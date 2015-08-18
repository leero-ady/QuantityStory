package thoughtworks;

public class QuantityinInches implements Quantity{

	private static double value;
	
	public static final double convertToNano=2.54*10000000.0;
	
	public QuantityinInches(){
		
	}
	
	public QuantityinInches(double value) {
		
		this.value = value;
	}
	
	
	
	public double convertToBase() {
		
		return value*convertToNano;
	}


	public static final double convertBaseToInches(double value){
		
		final double convertToInches = QuantityinInches.convertToNano;
		
		return value/convertToInches;
		
	}

	public double getValue() {
		return value;
	}
	


	


	

}
