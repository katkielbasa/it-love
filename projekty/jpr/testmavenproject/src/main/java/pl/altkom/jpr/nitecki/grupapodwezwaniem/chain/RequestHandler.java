package pl.altkom.jpr.nitecki.grupapodwezwaniem.chain;

abstract class PurchasePower {
//    protected static final double BASE = 200;
    protected PurchasePower successor;
 
    public void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }
 
    abstract public void processRequest(PurchaseRequest request);
}
