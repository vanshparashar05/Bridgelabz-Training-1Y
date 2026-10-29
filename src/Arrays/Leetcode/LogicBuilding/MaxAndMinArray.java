package Arrays.LogicBuilding;

import java.util.Scanner;

public class MaxAndMinArray {
    public static int maximumOfArray(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int minimumOfArray(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static int secondMax(int[] a) {
        int max=maximumOfArray(a);
        for(int i=0;i<a.length;i++) {
            if (a[i] == max) {
                a[i] = Integer.MIN_VALUE;
            }
        }
       return maximumOfArray(a);
    }
        public static int secondMin ( int[] a){
           int min=minimumOfArray(a);
           for(int i=0;i<a.length;i++){
               if(a[i]==min){
                   a[i]=Integer.MAX_VALUE;
               }
           }
           return minimumOfArray(a);
        }
        public static void main (String[] args){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the size of array");
            int size = s.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the Array");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println("The Maximum of the array is : " + maximumOfArray(arr));
            System.out.println("The Minimum of the array is : " + minimumOfArray(arr));
            System.out.println("The Second Maximum of the array is : " + secondMax(arr));
            System.out.println("The Second Minimum of the array is : " + secondMin(arr));
        }
    }
