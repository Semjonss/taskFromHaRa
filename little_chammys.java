import java.util.*;
class Solution {
    public static int getpos(long n,long[] arr){
        int answer;
        int k = Arrays.binarySearch(arr,n);
        if (k < 0) answer = -k - 2;//because returns - i
        else answer = k;
        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int big = 320000;//the boundary of acceptable values
        long[] sqrsums = new long[big];
        for(int i = 0; i < sqrsums.length; i++){
            sqrsums[i]=((long)i * (i + 1) * (i + i + 1)) / 6;// number of sweets for  i'th first childrens
        }
        int t=in.nextInt();
        while(t-->0){
            long n = in.nextLong();
            System.out.println(getpos(n,sqrsums));
        }
    }
}
