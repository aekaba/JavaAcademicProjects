

public class Sphere extends ThreedimensionalShape {
	private double r;
	
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r>0?r:0;
	}
	
	public Sphere(double r) {
		super();
		setR(r);
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 4*Math.PI*Math.pow(r, 2);
	}
	
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return (4.0/3.0)*Math.PI*Math.pow(r, 3);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nSphere\nr: "+getR()+"\nArea: "+area()+"\nVolume: "+volume();
	}
	
}
