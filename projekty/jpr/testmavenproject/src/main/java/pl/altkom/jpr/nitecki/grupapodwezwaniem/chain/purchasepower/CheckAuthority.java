package pl.altkom.jpr.nitecki.grupapodwezwaniem.chain.purchasepower;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

class CheckAuthority {
    public static void main(String[] args) {
        LocalLeader leader = new LocalLeader();
        UnitDirector director = new UnitDirector();
        CentrumID cid = new CentrumID();

        leader.setSuccessor(director);
        director.setSuccessor(cid);

 
        // Press Ctrl+C to end.
        
//        try {
//            while (true) {
//                System.out.println("Enter the amount to check who should approve your expenditure.");
//                System.out.print(">");
//                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
//                leader.processRequest(new PurchaseRequest(0, d, 0));
//                System.out.println("Enter the type of purchase.");
//                System.out.print(">");
//                int a = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
//                leader.processRequest(new PurchaseRequest(0, 0, a));
//           }
//        } catch(Exception e) {
//            System.exit(1);
//        }
        
        PurchaseRequest purchase1 = new PurchaseRequest(0, 200, 0);
        PurchaseRequest purchase2 = new PurchaseRequest(0, 2000, 1);
        PurchaseRequest purchase3 = new PurchaseRequest(0, 200000, 2);
        PurchaseRequest purchase4 = new PurchaseRequest(0, 200, 2);
        PurchaseRequest purchase5 = new PurchaseRequest(0, 100423, 1);
        PurchaseRequest purchase6 = new PurchaseRequest(0, 200, 1);
        
        leader.processRequest(purchase1);
        leader.processRequest(purchase2);
        leader.processRequest(purchase3);
        leader.processRequest(purchase4);
        leader.processRequest(purchase5);
        leader.processRequest(purchase6);
        
    }
}
