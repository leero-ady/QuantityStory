package thoughtworks;

public class QuantityinCentimeters implements Quantity {

	private double value;

	public static final double convertToNano=10000000.0;
	
	public QuantityinCentimeters(){
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuantityinCentimeters other = (QuantityinCentimeters) obj;
		if (Double.doubleToLongBits(value) != Double
				.doubleToLongBits(other.value))
			return false;
		return true;
	}

	public QuantityinCentimeters(double value)  {
		super();
		this.value = value;
		
	
	}
	
	public static final double convertBaseToCentimeter(double value){
		
		final double convertToCentimeter = QuantityinCentimeters.convertToNano;
		
		return value/convertToCentimeter;
	}




	
	public double convertToBase() {
		
		return value*convertToNano;
	}

	
	public double getValue() {
		return value;
	}

	
	
}
