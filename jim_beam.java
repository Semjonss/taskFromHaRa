import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    
    public static long min(long a, long b){
        long answer = b;
        if(a < b){
            answer = a;
        }
        return answer;
    }
    
    public static long max(long a, long b){
        long answer = b;
        if(a > b){
            answer = a;
        }
        return answer;
    }
    
    public static boolean inside(long x1, long y1, long x2, long y2, long x3, long y3){
        boolean answer = false;
        if((min(x1, x2) <= x3) && (x3 <= max(x1, x2)) && (min(y1, y2) <= y3) && (y3 <= max(y1, y2))){
            answer = true;
        }
        return answer;      
    }
    
     public static boolean nifrossing(long abc, long abd, long cda, long cdb){
        boolean answer = false;
        if (((abc>0 && abd<0)||(abc<0 && abd>0)) && ((cda>0 && cdb<0)||(cda<0 && cdb>0))){
            answer = true;
        }
        return answer;      
    }
           
    public static long crossProduct(long x1, long y1, long x2, long y2, long x3, long y3){
        return (((x2 - x1) * (y3 - y1)) - ((y2 - y1) * (x3 - x1)));        
    }   
    
    public static boolean canBean(long x1, long y1, long x2, long y2, long x3, long y3, long x4, long y4){
        boolean answer = false;
        long abc = crossProduct(x1, y1, x2, y2, x3, y3);
        long abd = crossProduct(x1, y1, x2, y2, x4, y4);
        long cda = crossProduct(x3, y3, x4, y4, x1, y1);
        long cdb = crossProduct(x3, y3, x4, y4, x2, y2);
        if (nifrossing(abc, abd, cda, cdb)){ 
            answer = true;
        }
        if ((abc == 0) && (inside(x1, y1, x2, y2, x3, y3))){
            answer = true;
        }
        if ((abd == 0) && (inside(x1, y1, x2, y2, x4, y4))){
            answer = true;
        } 
        if ((cda == 0) && (inside(x3, y3, x4, y4, x1, y1))){
            answer = true;
        }
        if ((cdb == 0) && (inside(x3, y3, x4, y4, x2, y2))){
            answer = true;
        }
        return answer;
    }
    
    public static void main(String[] args) {
        long x, y, x1, x2, y1, y2;
        Scanner in = new Scanner(System.in);
        for (int L = in.nextInt(); L > 0; --L){
            x1 = in.nextLong();
            y1 = in.nextLong();
            x2 = in.nextLong();
            y2 = in.nextLong();
             x = in.nextLong();
            y = in.nextLong();
            if (canBean(0, 0, x, y, x1, y1, x2, y2)){
                System.out.println("NO");   
            } 
            else{           
                System.out.println("YES");
            }
        }
        in.close();
    }
}
