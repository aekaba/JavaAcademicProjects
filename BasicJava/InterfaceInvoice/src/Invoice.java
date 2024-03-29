
public class Invoice implements IPayable{
	private String partNumber, partDescription;
	private int quantity;
	private double pricePerItem;
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	@Override
	public double getPaymentAmount() {
		
		return getPricePerItem()*getQuantity();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Part Number: "+getPartNumber()+"\nPart Description: "+getPartDescription()+"\nQuantity: "+getQuantity()+"\nPrice per Item: "+getPricePerItem();
	}
	
	
}
