import java.util.Scanner;


public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0)
		{
			int y = scanner.nextInt();
			long u = 1;
			for(int j = 0; j < y; j++)
			{
				u=(u * 2) % 100000;
			}
			System.out.println(u-1);			
		}
	}

}
