package thoughtworks;


public class QuantityinYards implements Quantity {

	private double value;

	public static final double convertToNano= 3*12*2.54*10000000.0;
	
	public static final double convertBaseToYards(double value){
		
		final double convertToYards = QuantityinFoot.convertToNano;
		
		return value/convertToYards;
		
	}
	
	public QuantityinYards(){
		
	}
	
	public QuantityinYards(double value)  {
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
		QuantityinYards other = (QuantityinYards) obj;
		if (Double.doubleToLongBits(value) != Double
				.doubleToLongBits(other.value))
			return false;
		return true;
	}

	
	public double convertToBase(){
		
		return value*convertToNano;
		
	}

	public double getValue() {
		return value;
	}
		
	

	

	
}
