
import java.util.Random;
public class Lotto {

	void execute() {
		int[] lottoNum = new int[6];
		int min =1;
		final int MAX_NUM = 45;
		
		Random random = new Random();
		//범위가 1~45
		for(int i=0; i<lottoNum.length; i++) {	
			lottoNum[i] = (random.nextInt((MAX_NUM)+1)); //=((max-min)+1)+min
		
		for(int j=0; j<i; j++) {
			if(lottoNum[j]==lottoNum[i]) {	
				System.out.println("중복된 번호 있음 "+lottoNum[j]);
				i--; //핵심
				}		
			}	
		System.out.println(lottoNum[i]);
		}
	}
}
