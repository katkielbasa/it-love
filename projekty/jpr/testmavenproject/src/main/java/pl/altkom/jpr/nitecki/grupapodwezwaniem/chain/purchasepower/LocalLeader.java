package pl.altkom.jpr.nitecki.grupapodwezwaniem.chain.purchasepower;

public class LocalLeader extends PurchasePower{

    private final double ALLOWABLE = 200d;
    private final int ALLOWABLE_PURPOSE = 0;
    
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= ALLOWABLE && request.getPurpose() == ALLOWABLE_PURPOSE ) {
            System.out.println("Local Leader can buy product type " + request.getPurpose() + " for " + request.getAmount() + " cebul");
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
	
}
