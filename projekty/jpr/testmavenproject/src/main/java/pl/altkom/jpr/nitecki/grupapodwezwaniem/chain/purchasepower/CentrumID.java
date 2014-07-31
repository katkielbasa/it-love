package pl.altkom.jpr.nitecki.grupapodwezwaniem.chain.purchasepower;

public class CentrumID extends PurchasePower{

    private final double ALLOWABLE = 0d;
    private final int ALLOWABLE_PURPOSE = 2;
    
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() >= ALLOWABLE && request.getPurpose() == ALLOWABLE_PURPOSE) {
            System.out.println("CentrumID can buy product type " + request.getPurpose() + " for "  + request.getAmount() + " cebul and above");
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
	
}
