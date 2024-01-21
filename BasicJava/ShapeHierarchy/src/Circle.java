
public class Circle extends TwoDimensionalShape{
	private double r;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r>0?r:0;
	}

	public Circle(double r) {
		super();
		setR(r);
	}

    @Override
    public double area() {
    	// TODO Auto-generated method stub
    	return Math.PI*Math.pow(getR(), 2);
    }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nCİRCLE\nr: "+getR()+"\nArea: "+area();
	}
	
	

}
