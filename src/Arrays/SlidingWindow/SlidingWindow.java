package Arrays.SlidingWindow;

import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        int size=3;
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=a[i];
        }
        System.out.println(sum);
        for(int i=1;i<=a.length-size;i++){
            sum=sum-a[i-1]+a[i+size-1];
            System.out.println(sum);
        }
    }
}
