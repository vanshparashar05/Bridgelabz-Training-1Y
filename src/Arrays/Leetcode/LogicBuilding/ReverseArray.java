package Arrays.LogicBuilding;

import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int[] a) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }

    public static void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("The original array is :-");
        display(arr);
        System.out.println("\nThe reversed array is :-");
        reverse(arr);
        display(arr);
    }
}
