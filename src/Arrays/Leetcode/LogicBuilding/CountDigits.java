package Arrays.LogicBuilding;
import java.util.Scanner;

public class CountDigits {
    public static int countDigitOfNumber(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number for which you want the count");
        int num=s.nextInt();
        System.out.println("Number of Digits in the inputted number is : "+countDigitOfNumber(num));
    }
}
