
public class Test {

	public static void main(String[] args) {
		Shape[] ShapeObj=new Shape[6];
		ShapeObj[0] = new Square(4, 4);
		ShapeObj[1] = new Circle(4);
		ShapeObj[2] = new Cube(4);
		ShapeObj[3] = new Sphere(4);
		ShapeObj[4] = new Triangle(8, 3);
		ShapeObj[5] = new Tetrahedron(4, 4, 4);
		System.out.println("----------------");
		for (Shape item : ShapeObj) {
			System.out.println(item);
			
			System.out.println("----------------");
		}

	}

}
