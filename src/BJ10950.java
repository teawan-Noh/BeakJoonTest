
import java.util.Scanner;

public class BJ10950 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 1; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			int total = A + B ;
			System.out.println(total);
		}
		
	}

}