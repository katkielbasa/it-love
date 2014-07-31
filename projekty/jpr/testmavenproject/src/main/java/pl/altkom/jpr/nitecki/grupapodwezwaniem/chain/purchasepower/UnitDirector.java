package pl.altkom.jpr.nitecki.grupapodwezwaniem.chain.purchasepower;

public class UnitDirector extends PurchasePower {

	private final double ALLOWABLE = 10000d;
	private final int POSSIBBLE_MATERIAL = 1;


	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() <= ALLOWABLE
				&& request.getPurpose() == POSSIBBLE_MATERIAL) {
			System.out.println("Unit director can buy product type " + request.getPurpose() + " for " + request.getAmount() + " cebul");
		} else if (successor != null) {
			successor.processRequest(request);
		}
	}

}
