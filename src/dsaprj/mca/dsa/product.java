package dsaprj.mca.dsa;

import java.util.Objects;

public class product {
	
	int prdID;
	String prdName;
	double prdPrice;
	public product(int prdID, String prdName, double prdPrice) {
		super();
		this.prdID = prdID;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
	}
	@Override
	public String toString() {
		return "product [prdID=" + prdID + ", prdName=" + prdName + ", prdPrice=" + prdPrice + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(prdID, prdName, prdPrice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		product other = (product) obj;
		return prdID == other.prdID && Objects.equals(prdName, other.prdName)
				&& Double.doubleToLongBits(prdPrice) == Double.doubleToLongBits(other.prdPrice);
	}
	

}