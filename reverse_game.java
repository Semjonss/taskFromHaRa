import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution
{
    public static int serchAnswer(int n, int k){
		int[] arr = new int[n];
		int x = 0, y = n - 1;
		for(int j = 0; j < arr.length; j++)
		{
			if((j % 2) == 0)
				arr[j] = y--;
			else
				arr[j] = x++;
		}
        int j = 0;
        while (arr[j] != k){
            j++;
        }
        return j;
    }
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int T = scanner.nextInt();
		for(int i = 0; i < T; i++)
		{
            int N = scanner.nextInt();
		    int K = scanner.nextInt();
            System.out.println(serchAnswer(N, K));
		}
	}
}
