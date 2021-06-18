import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2577 { //�� ���� �ڿ����� �־����� �̸� ���� ������� 0���� 9���� ������ ���ڰ� ����� �������� ���϶�

	public static void main(String[] args) throws IOException {
		
	/*	Scanner sc = new Scanner(System.in);	
		
		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		String B = Integer.toString(value);
		//in.close();
		
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for(int j = 0; j < B.length(); j++) {
				if((B.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
	*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		
		String str = String.valueOf(val);
		
		for(int i = 0; i < str.length(); i++) {
			arr[(str.charAt(i) - 48)]++;
		}
		
		for (int v : arr) {
			System.out.println(v);
		}
	} 
}