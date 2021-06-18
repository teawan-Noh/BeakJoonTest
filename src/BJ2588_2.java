
import java.util.Scanner;

public class BJ2588_2 {

	public static void main(String[] args) {
		// 나머지와 나눗셈 연산을 통해 각 자릴수를 구하여 쓰는방법

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a * (b%10));
		System.out.println(a * ((b%100)/10));
		System.out.println(a * (b/100));
		System.out.println(a * b);
	}

}