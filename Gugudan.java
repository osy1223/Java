//
//GuguDan gu = new GuGuDan(7);
//
//gu.show();  // 7�� ���
//
//gu.setDan(8);
//
//gu.show()  // 8�� ���.

public class Gugudan {

	int dan = 0;
	
	Gugudan (int dan){
		this.dan = dan;
	}
	
	void setDan (int dan) {
		this.dan = dan;
	}
	
	void show() {
		for(int i=1; i<=9; i++) {
		System.out.println(dan+"X"+i+"="+dan*i);
		}
	}
	
	
}