package Arrays.LogicBuilding;
import java.util.Scanner;

public class ReverseNumber {
    public static int reverseOfTheNumber(int n){
        int reverse=0;
        while(n!=0){
            int rem=n%10;
            reverse=(reverse*10)+rem;
            n/=10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number that you want to reverse");
        int num=s.nextInt();
        System.out.println("The Reversed Number is : "+reverseOfTheNumber(num));
    }
}
