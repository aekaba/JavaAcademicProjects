
public class Cube extends ThreedimensionalShape {
	private double height;
	
	public Cube(double height) {
		super();
		setHeight(height);;
		
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height>0?height:0;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 6*Math.pow(height, 2);
	}
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return Math.pow(height, 3);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nCube\nHeight: "+getHeight()+"\nArea: "+area()+"\nVolume: "+volume();
	}
}
