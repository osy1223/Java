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

			System.out.print("ù��° ���ڸ� �Է��ϼ���: ");
			num1 = sc.nextInt();

			System.out.print("�����ȣ�� ��������: ");
			op = sc.next();

			System.out.print("�ι�° ���ڸ� �Է��ϼ���: ");
			num2 = sc.nextInt();

			switch (op) { // ����
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
			
			System.out.println("���α׷� ����"); //else�� �� ����
			break;			
		}
		
		
	}
}
