
public class Triangle extends TwoDimensionalShape{
	private double r;
	private double h;
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r>0?r:0;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h>0?h:0;
	}
	public Triangle(double r, double h) {
		super();
		setR(r);
		setH(h);
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return r*(h/2);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nTriangle\nHeight: "+getH()+"\nWeight: "+getR()+"\nArea: "+area();
	}
	
}
