import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int user = 0; //입력받는값
		int computer = (int)(Math.random()*3);//Math.random 은 0~1 실수가 랜덤->형변환 int->0,1,2
		
	while(true) {
		char yn;
		try {
			System.out.println("가위(0),바위(1),보(2) 중에 하나를 고르시오");
			user=sc.nextInt();
			 
			if(user<0 && user>=3) {
				System.out.println("잘못 입력했습니다. 재입력 부탁드립니다");
				continue;
			}
							
		} catch (Exception e) {
			System.out.println("입력이 잘못되었습니다.");
		
		
		}	
			System.out.println("컴퓨터가 낸 것: "+computer+" 내가 낸 것: "+user);
			System.out.println();
			if(user == computer)
				System.out.println("비겼습니다");
			else if(user==0&&computer==1)
				System.out.println("컴퓨터가 이겼습니다");
			else if(user==1&&computer==2)
				System.out.println("컴퓨터가 이겼습니다");
			else if(user==2&&computer==0)
				System.out.println("컴퓨터가 이겼습니다");
			else
				System.out.println("컴퓨터가 졌습니다");
			
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
