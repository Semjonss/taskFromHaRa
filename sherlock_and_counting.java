import java.util.*;
public class Solution {
    
    public static long f(long n,long i) {
        return i * (n - i);
    }
    
    public static long searchAnswer(long n, long k){
        long m = n / 2;
        long nk = n * k;
        long answer, left, right, mid;
        if (f(n, m) <= nk) {
                answer = n - 1;
            }
            else {
                left = 2;
                right = m;
                while (left <= right) {
                    mid = (left + right) / 2;
                    if (f(n, mid) <= nk) {
                        left = mid + 1;
                    }
                    else {
                        right = mid - 1;
                    }
                }
                answer = left - 1;
                left = m;
                right = n - 1;
                while (left <= right) {
                    mid = (left + right) / 2;
                    if (f(n, mid) <= nk) {
                        right = mid - 1;
                    }
                    else {
                        left = mid + 1;
                    }
                }
                answer = answer + n - right - 1;  
            }
        return answer;
    }        
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long n, k, answer;
        for (int c = scanner.nextInt(); c > 0; --c) {
            n = scanner.nextLong();
            k = scanner.nextLong();
            answer = searchAnswer(n, k);
            System.out.println(answer);   
            in.close();
        }            
    }
}
