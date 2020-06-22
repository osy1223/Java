/*
 *	Rectangle r1 = new Rectangle(5,6);
	Rectangle r2 = new Rectangle(7,9);
	Rectangle r3 = Rectangle.compareRect(r1,r2);

	System.out.println(r3.getHeight() + " : " + r3.getWidth()  + "입니다.");\
	
	=============================
	출력 : 9 : 7 입니다.
 */
public class Rectangle {

	int Width;
	int Height;
	
	public Rectangle( int Width,int Height){
		this.Width = Width;
		this.Height = Height;
	}
	public int getWidth() {
		return Width;
	}
	
	public int getHeight() {
		return Height;
	}
	
	
	public static Rectangle compareRect(Rectangle r1, Rectangle r2) {
		Rectangle max = null;
		if(r2.Width >r1.Width & r2.Height > r1.Height) {
				max = r2;
		}else {
			max = r1;
		}
	return max;
	
	}
}
