package Arrays.LogicBuilding;

import java.util.Scanner;

public class Swap {
    public static void swapElements(int[] arr,int a,int b) {
        if (a > arr.length || b > arr.length) {
            System.out.println("Invalid Input");
            return;
        }
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void displey(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=s.nextInt();
        int[] a=new int[size];
        System.out.println("Enter the Array");
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Enter the the indexes you want to swap");
        int p1=s.nextInt();
        int p2=s.nextInt();
        swapElements(a,p1,p2);
        displey(a);
    }
}
