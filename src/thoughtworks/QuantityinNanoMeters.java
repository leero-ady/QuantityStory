package thoughtworks;

public class QuantityinNanoMeters implements Quantity {

	private double value;
	
	public QuantityinNanoMeters(double value)  {
		super();
		this.value = value;
		
	}
	
	
	public double convertToBase() {
		
		return value;
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
		QuantityinNanoMeters other = (QuantityinNanoMeters) obj;
		if (Double.doubleToLongBits(value) != Double
				.doubleToLongBits(other.value))
			return false;
		return true;
	}


	public double getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
	
	
}
