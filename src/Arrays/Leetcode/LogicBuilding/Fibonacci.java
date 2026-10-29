package Arrays.LogicBuilding;

import java.util.Scanner;

public class Fibonacci {
    public static void fibonacciSeries(int n) {
        int first = 0;
        int second = 1;
        System.out.print("0 " + "1 ");
        for (int i = 0; i < n; i++) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the term till where you want the fibonacci series");
        int num = s.nextInt();
        System.out.print("The Fibonacci Series is :");
        fibonacciSeries(num);
    }
}
