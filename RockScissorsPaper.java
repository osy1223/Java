import java.util.Scanner;


public class RockScissorsPaper {
	public static void main(String[] args) {
	while(true) {
		Scanner scanner = new Scanner(System.in);

		int comNum = (int) (Math.random() * 3) + 1; 
		String str = "";
		String str2 = "";
		int myNum = 0;
		System.out.print("가위, 바위, 보 입력: ");
		
		str = scanner.next();  
		
		switch(str) {
		case "가위":
			myNum = 1;
			break;
		case "바위":
			myNum = 2;
			break;
		case "보":
			myNum = 3;
			break;
		}
		
		if(myNum == 1 || myNum == 2 || myNum == 3) {
			// 제대로 입력됨
		} else {
			System.out.print("\n< ERROR > 가위 바위 보 중 하나를 입력하세요 \n");
			continue;
		}
		

		System.out.print("컴퓨터가 ");
		if (comNum == 1) {
			System.out.print("가위");
		} else if (comNum == 2) {
			System.out.print("바위");			
		} else {
			System.out.print("보");
		}
		System.out.println("를 냈습니다.");		

		System.out.print("사용자가 ");
		if (myNum == 1) {
			System.out.print("가위");
		} else if (myNum == 2) {
			System.out.print("바위");			
		} else {
			System.out.print("보");
		}	
		System.out.println("를 냈습니다.");		

		if (comNum == myNum) { 
			System.out.println("결과 : 비겼습니다.");				
		} else if ((comNum == 1 && myNum == 2) || (comNum == 2 && myNum == 3) || (comNum == 3 && myNum == 1)) {
			System.out.println("결과 : 이겼습니다.");
		} else {
			System.out.println("결과 : 졌습니다.");			
		}				
	}		
	}
}
	
		