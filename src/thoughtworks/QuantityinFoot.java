package thoughtworks;

public class QuantityinFoot implements Quantity {

	private static double value;
	
	public static final double convertToNano= 12*2.54*10000000.0;

	public QuantityinFoot(){
		
	}
	
	public QuantityinFoot(double value) {
		super();
		this.value = value;
	}
	
	public static final double convertBaseToFeet(double value){
		
		final double convertToFeet = QuantityinFoot.convertToNano;
		
		return value/convertToFeet;

		
	}
	
	
	public double convertToBase() {

		return value*convertToNano;
	}

	

	public double getValue() {
		// TODO Auto-generated method stub
		return value;
	}



	
	
	
	
}
