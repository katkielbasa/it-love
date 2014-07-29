package pl.altkom.jpr.instruktor;

/**
 * Klasa oblcza opłaty pocztowe
 * @author instruktor
 *
 */
public class PostTaxCalculator {

	public float calculateExpressPayment(int typ, float value, boolean usingInternet){
		
		if (typ == 1){
			if (usingInternet){
				if((value >0) && (value <=200)){
					return 9.50f;
				}
				if((value >200) && (value <=300)){
					return 13f;
				}
				if((value >300) && (value <=500)){
					return 14.5f;
				}
				if((value >500) && (value <=1000)){
					return 18.5f;
				}
				if((value >1000) && (value <=5000)){
					return 35f;
				}
				if(value >5000){
					return 70f;
				}
			}else{
				if((value >0) && (value <=200)){
					return 15f;
				}
				if((value >200) && (value <=300)){
					return 17;
				}
				if((value >300) && (value <=500)){
					return 18f;
				}
				if((value >500) && (value <=1000)){
					return 22f;
				}
				if((value >1000) && (value <=5000)){
					return 43f;
				}
				if(value >5000){
					return 85f;
				}
			}
			
		}else if(typ == 2){
			
		}else if(typ == 3){
			
			
		}
		return 0;
	}
}
