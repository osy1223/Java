//출력 : 8

public class Circle {

	int radius;
	
	Circle (int radius) {
		this.radius= radius;
	}
	
	static Circle maxCircle(Circle c1, Circle c2, Circle c3) {
		Circle max = null;
		
		if(c1.radius > c2.radius && c1.radius>c3.radius) {
			max = c1;
		}else if(c2.radius>c1.radius && c2.radius>c3.radius) {
			max = c2;
		}else if(c3.radius>c1.radius && c3.radius>c2.radius) {
			max = c3;
		}else {
			System.out.println("알 수 없습니다");
		}
		return max;
	}

	
}
