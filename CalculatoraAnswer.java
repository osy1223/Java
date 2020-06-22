import java.util.Scanner;

public class CalculatoraAnswer {

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int min(int num1, int num2) {
		return num1 - num2;
	}

	public static int mul(int num1, int num2) {
		return num1 * num2;
	}

	public static int div(int num1, int num2) {
		return num1 / num2;
	}

	void excute() {
		char yn;
		int num1, num2, result = 0;
		String op;

		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.print("첫번째 숫자를 입력하세요: ");
			num1 = sc.nextInt();

			System.out.print("연산기호를 넣으세요: ");
			op = sc.next();

			System.out.print("두번째 숫자를 입력하세요: ");
			num2 = sc.nextInt();

			switch (op) { // 연산
			case "+":
				result = add(num1, num2);
				break;
			case "-":
				result = min(num1, num2);
				break;
			case "*":
				result = mul(num1, num2);
				break;
			case "/":
				result = div(num1, num2);
				break;
			default:
				break;
			}
			
			System.out.println(result);

			System.out.print("Continue ? Yes or No");
			yn = sc.next().charAt(0);
			if (yn == 'y' || yn == 'Y') {
				continue;				
			}
			
			System.out.println("프로그램 종료"); //else일 때 실행
			break;			
		}
		
		
	}
}
