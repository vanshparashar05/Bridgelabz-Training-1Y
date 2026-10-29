package Arrays.LogicBuilding;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void display(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]!=-1){
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void removeDuplicate(int[] a){
        System.out.println("Array before removal of duplicates");
        display(a);
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[i]=-1;
                    a[j]=-1;
                }
            }
        }
        System.out.println("\nArray after removal of duplicates");
        display(a);
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
        removeDuplicate(arr);
    }
}
