import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int L = scanner.nextInt();
		while (L-- > 0){
			int n = scanner.nextInt();
			serchAnswer(n);
		}
        scanner.close();
	}

	public static void serchAnswer(int number) {
		long n;
		for(int i = 1; ; i++){
			String s = Integer.toBinaryString(i);
			n = Long.parseLong(s.replace('1', '9'));
			if(n % number == 0){
				System.out.println(n);
				break;
			}
		}
	}
}

