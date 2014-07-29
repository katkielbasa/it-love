package pl.altkom.jpr.nawara;

public class TestMinimalValue {

	public static void main(String args[]) {
		 MinimalValueSearcher obj = new MinimalValueSearcher();
		 int[] liczby = new int[3];
		 liczby[0]=4;
		 liczby[1]=7;
		 liczby[2]=2;
		 
//int wynik = obj.findMinimalValue(liczby)
//System.out.println(wynik);
		 //to jest to samo co na dole, prawie to samo
	
		 
		 System.out.println(obj.findMinimalInt(liczby));
		 
		 for (int i = 0; i < 6; i++){
			 System.out.println("lala");
		 }
		 
		
}
}
/*for (int liczba : liczby){
	 
}

na temat p�tli for*/

