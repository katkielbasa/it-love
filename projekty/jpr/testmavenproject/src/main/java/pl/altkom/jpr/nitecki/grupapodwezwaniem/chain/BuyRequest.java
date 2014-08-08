package pl.altkom.jpr.nitecki.grupapodwezwaniem.chain;

import pl.altkom.jpr.nitecki.grupapodwezwaniem.chain.RequestLevels;

public class BuyRequest {

	private RequestLevels type;

	// 0 - zakup materiałów eksploatacyjnych
	// 1 - systemy informatyczne i audyty bezpieczeństwa
	// 2 - zakup innych materiałów

	private int requestType;
	private double price;
//	private String conclusion = null;

	public RequestLevels getType() {
		return type;
	}

	public void setType(RequestLevels type) {
		this.type = type;
	}

	public int getRequestType() {
		return requestType;
	}

	public void setRequestType(int requestType) {
		this.requestType = requestType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	public String getConclusion() {
//		return conclusion;
//	}
//
//	public void setConclusion(String conclusion) {
//		this.conclusion = conclusion;
//	}

}