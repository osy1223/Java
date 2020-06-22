
public class Triangle {

	int width;
	int height;
	
	Triangle(int n1, int n2){
		width = n1;
		height = n2;
	}
	
	void equalTriangle(Triangle tri) {
		
		if((width == tri.width) && (height == tri.height)) {
			System.out.println("같은 삼각형입니다");
		}else
			System.out.println("다른 삼각형입니다");
		
		
	}
	
	
}
