import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1005;
        long[][] C = new long[n+1][n+1];
        int MOD = (int)1e9;
        C[0][0] = 1;
        for (int i= 1 ; i<= n ; i++) {
            C[i][0] = 1;
            for (int k=1 ; k <= n ; k++)
                C[i][k] = (C[i-1][k] + C[i-1][k-1]) % MOD;
        }

        int t = scanner.nextInt();
        while (t-- > 0) {
            n = scanner.nextInt();
            for (int i=0 ; i<=n ; i++)
                System.out.print(C[n][i] + " ");
            System.out.println();
        }
    }
}
