package thoughtworks;

public class QuantityinMiles implements Quantity {
	
	private static double value;

	public static final double convertToNano= 3*12*2.54*10000000.0;
			
	public QuantityinMiles(){
		
	}
	
	public QuantityinMiles(double value)  {
		this.value = value;
		
	}
	
	
	public  double convertToBase(){
		
		return value*convertToNano;
		
	}
		
	

	public double getValue() {
		return value;
	}


}
