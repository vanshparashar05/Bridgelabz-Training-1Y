package Arrays.LogicBuilding;

import java.util.Scanner;

public class Sum {
    public static int sumofNNumbers(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number that you want to the sum of");
        int num=s.nextInt();
        System.out.println("The sum of the Numbers is :"+sumofNNumbers(num));
}
}
