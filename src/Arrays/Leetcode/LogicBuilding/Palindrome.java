package Arrays.LogicBuilding;

import java.util.Scanner;

public class Palindrome {
    public static int reverse(int n) {
        int reverse = 0;
        while (n != 0) {
            int rem = n % 10;
            reverse = (reverse * 10) + rem;
            n /= 10;
        }
        return reverse;
    }

    public static String isPalindrome(int n) {
        int reversenum = reverse(n);
        if (n == reversenum) {
            return "Palindrome";
        }
        return "Not Palindrome";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number that you want to check for Palindromme");
        int number = s.nextInt();
        System.out.println("The  Number is : " + isPalindrome(number));
    }
}
