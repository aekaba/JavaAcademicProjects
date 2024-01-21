
public class Square extends TwoDimensionalShape{
	private double height;
	private double weight;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height>0?height:0;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight>0?height:0;
	}
	
	@Override
	public double area() {
		
		return getWeight()*getHeight();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nSQUARE\nHeight: "+getHeight()+"\nWeight: "+getWeight()+"\nArea: "+area();
	}
	public Square(double height, double weight) {
		super();
		setHeight(height);
		setWeight(weight);
	}
}
