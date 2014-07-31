package pl.altkom.jpr.nitecki.grupapodwezwaniem.chain.purchasepower;

// 0 - zakup materiałów eksploatacyjnych
// 1 - systemy informatyczne i audyty bezpieczeństwa
// 2 - zakup innych materiałów

class PurchaseRequest {
    private int number;
    private double amount;
    private int purpose;
 
    public PurchaseRequest(int number, double amount, int purpose) {
        this.number = number;
        this.amount = amount;
        this.purpose = purpose;
    }
 
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amt)  {
        amount = amt;
    }
 
    public int getPurpose() {
        return purpose;
    }
    public void setPurpose(int reason) {
        purpose = reason;
    }
 
    public int getNumber(){
        return number;
    }
    public void setNumber(int num) {
        number = num;
    }
}