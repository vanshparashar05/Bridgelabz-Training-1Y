package Arrays.LogicBuilding;

import java.util.Scanner;

public class Prime {
    public static String isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                count++;
            }
        }
        if (count == 2) {
            return "Prime";
        }
        return "Not Prime";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number that you want to check for Prime");
        int num = s.nextInt();
        System.out.print("The Number is : "+isPrime(num));
    }
}
