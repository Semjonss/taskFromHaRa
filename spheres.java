
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.regex.Pattern;

public class Solution {
    public static boolean isContac(double xs, double ys, double zs, double ax, double ay, double az, double rs){
        boolean answer = false;
        double a = ax * ax + ay * ay + az * az;
        double b = 2 * (xs * ax + ys * ay + zs * az);
        double c = xs * xs + ys * ys + zs * zs - rs;
        double discr = b * b - 4 * a * c;
        double res1 = (-b + Math.sqrt(discr)) / (2 * a);
        double res2 = (-b - Math.sqrt(discr)) / (2 * a);
        if (a == 0) {
            answer = false;
        }    
        else if (discr < 0) {
            answer = false;
        }else if (res1 > 0) {
            answer = true;
        }else if (res2 > 0) {
            answer = true;
        }
        return answer;
    }    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        for (int L = in.nextInt(); L > 0; --L){
            int R1 = in.nextInt();
            int R2 = in.nextInt();
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int z1 = in.nextInt();
            int a1x = in.nextInt();
            int a1y = in.nextInt();
            int a1z = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int z2 = in.nextInt();
            int a2x = in.nextInt();
            int a2y = in.nextInt();
            int a2z = in.nextInt();
            double xs = x1 - x2;
            double ys = y1 - y2;
            double zs = z1 - z2;
            double ax = a1x - a2x;
            double ay = a1y - a2y;
            double az = a1z - a2z;
            double rs = (R1 + R2) * (R1 + R2);
            if (isContac(xs, ys, zs, ax, ay, az, rs)){
                System.out.println("YES");   
            }
            else{
                System.out.println("NO");
            }
            in.close();
        }
    }
}
