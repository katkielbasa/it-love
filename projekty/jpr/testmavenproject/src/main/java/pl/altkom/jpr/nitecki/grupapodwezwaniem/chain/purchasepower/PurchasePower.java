package pl.altkom.jpr.nitecki.grupapodwezwaniem.chain.purchasepower;

abstract class PurchasePower {
    protected static final double ALLOWABLE_PURPOSE = 0d;
    protected PurchasePower successor;
 
    public void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }
 
    abstract public void processRequest(PurchaseRequest request);
}
