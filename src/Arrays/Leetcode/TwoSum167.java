package Arrays.Leetcode;
import java.util.Scanner;
public class TwoSum167 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        int t=s.nextInt();
        int i=0;
        int j=a.length-1;
        int[] ans=new int[2];
        while(i<j){
            if(a[i]+a[j]<t){
                i++;
            }
            else if(a[i]+a[j]>t){
                j--;
            }
            else if(a[i]+a[j]==t){
               ans[0]=i+1;
               ans[1]=j+1;
               break;
            }
        }
        System.out.println("The positions of the numbers are : "+ans[0]+" and "+ans[1]);
    }
}
