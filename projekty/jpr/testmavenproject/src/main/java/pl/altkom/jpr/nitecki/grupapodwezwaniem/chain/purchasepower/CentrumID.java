package pl.altkom.jpr.nitecki.grupapodwezwaniem.chain.purchasepower;

public class CentrumID extends PurchasePower{

    private final double ALLOWABLE = 0d;
    private final int POSSIBLE_IT = 2;
    private final int POSSIBLE_MATERIAL = 1;
    
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() > ALLOWABLE && request.getPurpose() == POSSIBLE_IT || request.getPurpose() == POSSIBLE_MATERIAL) {
            System.out.println("CentrumID can buy product type " + request.getPurpose() + " for "  + request.getAmount() + " cebul and above");
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
	
}
