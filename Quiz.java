import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int user = 0; //�Է¹޴°�
		int computer = (int)(Math.random()*3);//Math.random �� 0~1 �Ǽ��� ����->����ȯ int->0,1,2
		
	while(true) {
		char yn;
		try {
			System.out.println("����(0),����(1),��(2) �߿� �ϳ��� ���ÿ�");
			user=sc.nextInt();
			 
			if(user<0 && user>=3) {
				System.out.println("�߸� �Է��߽��ϴ�. ���Է� ��Ź�帳�ϴ�");
				continue;
			}
							
		} catch (Exception e) {
			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
		
		
		}	
			System.out.println("��ǻ�Ͱ� �� ��: "+computer+" ���� �� ��: "+user);
			System.out.println();
			if(user == computer)
				System.out.println("�����ϴ�");
			else if(user==0&&computer==1)
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
			else if(user==1&&computer==2)
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
			else if(user==2&&computer==0)
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
			else
				System.out.println("��ǻ�Ͱ� �����ϴ�");
			
			System.out.println();
			System.out.println("y or n?");
			yn=sc.next().charAt(0);
			if(yn=='y'||yn=='Y')
				continue;
			else
				System.out.println();
				System.out.println("bye");
				break;
			
	}
		
	}
}
