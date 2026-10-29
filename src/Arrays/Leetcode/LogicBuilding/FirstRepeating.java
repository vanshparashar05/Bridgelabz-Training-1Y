package Arrays.LogicBuilding;

import java.util.Scanner;

public class FirstRepeating {
    public static int firstRepeating(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    return a[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("The First Repeating Element is :- "+firstRepeating(arr));
    }
}
