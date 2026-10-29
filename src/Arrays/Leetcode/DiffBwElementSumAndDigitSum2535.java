package Arrays.Leetcode;

import java.util.Scanner;

public class DiffBwElementSumAndDigitSum2535 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        int sum=0;
        int dsum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            while(a[i]!=0){
                int d=a[i]%10;
                dsum+=d;
                a[i]/=10;
            }
        }
        System.out.println("The Difference between Element Sum and Digit Sum is : "+Math.abs(sum-dsum));
    }
}
