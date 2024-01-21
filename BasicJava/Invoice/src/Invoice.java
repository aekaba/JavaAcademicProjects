
public class Invoice {
	private String partNumber;
	private String partDescription;
	private int partCount;
	private double partPrice;
	
	public Invoice(String partNumber, String partDescription, int partCount, double partPrice) { 
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		if ( partCount>0) 
			this.partCount = partCount;
		if (partPrice>0)
			this.partPrice = partPrice;
	}
	
	public Invoice() { 
		
	}
	
	public double getInvoiceAmount() {
		return partCount*partPrice;
	}
	
	public void invoiceDetail() {
		System.out.println("Part Number: "+partNumber+"\nPart Description: "+partDescription+"\nPart Count: "+partCount+"\nPart Price: "+partPrice+"\nIncoive Amount: "+ getInvoiceAmount());
	}
	
	
		// GET & SET METODS //
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getPartCount() {
		return partCount;
	}
	public void setPartCount(int partCount) {
		this.partCount = partCount;
	}
	public double getPartPrice() {
		return partPrice;
	}
	public void setPartPrice(double partPrice) {
		this.partPrice = partPrice;
	}
}
