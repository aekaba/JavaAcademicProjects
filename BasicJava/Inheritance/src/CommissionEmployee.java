
public class CommissionEmployee {
  private String name, lastName, SSN;
  private double commissionRate, GroseSaleAmaount;
  
  public CommissionEmployee(String name, String lastName, String SSN, double commissionRate, double GroseSaleamaount) {
	  setCommissionRate(commissionRate);
	  setGroseSaleAmaount(GroseSaleamaount);
	  this.lastName = lastName;
	  this.name = name;
	  this.SSN = SSN;
  }

public String getName() {
	return name;
}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSSN() {
		return SSN;
	}
	
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
	
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate >= 0 && commissionRate <=1 ? commissionRate:0;
	}
	
	public double getGroseSaleAmaount() {
		return GroseSaleAmaount;
	}
	
	public void setGroseSaleAmaount(double groseSaleAmaount) {
		GroseSaleAmaount = groseSaleAmaount > 0?groseSaleAmaount:0;
	}
	
	public double earning() {
		return commissionRate*GroseSaleAmaount;
	}
	
	@Override
		public String toString() {
			return getName()+" "+getLastName()+" "+getSSN()+" "+getCommissionRate()+" "+getGroseSaleAmaount();
		}
}
