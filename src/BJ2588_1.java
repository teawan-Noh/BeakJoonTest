
import java.util.Scanner;

public class BJ2588_1 {

	public static void main(String[] args) {
		//���ڿ��� �Է¹޾� chartAt()���� �ϳ��� ���� ���� ���
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		String B = sc.next();
		
		System.out.println(A * (B.charAt(2) - '0'));
		System.out.println(A * (B.charAt(1) - '0'));
		System.out.println(A * (B.charAt(0) - '0'));
		System.out.println(A * Integer.parseInt(B));
		System.out.println(" ");

	}
}