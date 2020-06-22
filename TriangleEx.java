
public class TriangleEx {

	public static void main(String[] args) {
		
		Triangle t1 = new Triangle(10,20);
		Triangle t2 = new Triangle(10,20);
		Triangle t3 = new Triangle(10,10);
		
		t1.equalTriangle(t2);
		t1.equalTriangle(t3);
	}
}
