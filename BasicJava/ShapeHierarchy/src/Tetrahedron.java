
public class Tetrahedron extends ThreedimensionalShape{
	private double a;
	private double b;
	private double h;
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a>0?a:0;
	}
	public Tetrahedron(double a, double b, double h) {
		super();
		setA(a);
		setB(b);
		setH(h);
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b>0?b:0;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h>0?h:0;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 4*(getA()+Math.sqrt(Math.pow(getA(), 2)+(4*Math.pow(getH(), 2)))) ;
	}
	@Override
	public double volume() {
		
		return (1.0/3.0)*(getA()*getB()*getH());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nTetrahedron\nA: "+getA()+"\nB: "+getB()+"\nH: "+getH()+"\nArea: "+area()+"\nVolume: "+this.volume();
	}

}
