package thoughtworks;

public class QuantityinMeters implements Quantity {

	private double value;

	public static final double convertToNano=1000000000.0;
			
	
	public static final double convertBaseToMeter(double value){
		
		final double convertToMeter =  convertToNano;
		
		return value/convertToMeter;
	}

	
	public QuantityinMeters(double value)  {
		super();
		this.value = value;
		
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
		QuantityinMeters other = (QuantityinMeters) obj;
		if (Double.doubleToLongBits(value) != Double
				.doubleToLongBits(other.value))
			return false;
		return true;
	}


	public double convertToBase() {
		return value*convertToNano;
	}

	
	public QuantityinMeters addInMeters(Quantity secondValue){
		
		double sum = this.convertToBase() + secondValue.convertToBase();				
		
		return new QuantityinMeters(convertBaseToMeter(sum));
		
	}

	public double getValue() {
		
		return value;
	}
	
	

	
	
	
	
}
