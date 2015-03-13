import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int serchAnswer(int sum, int a, int b, int c, int d){
        int answer = 0;
        for(int w = 0; w <= d; w++){
            if(w * 10 == sum){
                answer += 1;
                break;
            }else if(w * 10 > sum){
                break;
            }
            for(int x = 0; x <= c; x++){
                if(w * 10 + x * 5 == sum){
                    answer += 1;
                    break;
                }else if(w * 10 + x * 5 > sum){
                     break;
                }
                for(int y = 0; y <= b; y++){
                    if(w * 10 + x * 5 + y * 2 == sum){
                        answer += 1;
                        break;
                    }else if(w * 10 + x * 5 + y * 2 > sum){
                        break;
                    }
                    if(sum - (w * 10 + x * 5 + y * 2) <= a){
                        answer += 1;
                    }
                }
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int sum = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            System.out.println(serchAnswer(sum, a, b, c, d));
        }
    }
}
