package chap01;
import java.util.*;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int result=1;
		System.out.print("승수: ");
		int power = scanner.nextInt();
		
		int i=1;
		while(i<=power){
			result=result*2;
			i++;
		}
		
		System.out.println("2의 " + power + "제곱은 "+result+"입니다.");
		scanner.close();
	}

}
