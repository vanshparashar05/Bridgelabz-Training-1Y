package Arrays.Leetcode;

public class RotateArray189 {
        public void rotate(int[] nums, int k) {
            k=k%nums.length;
            reverse(nums,0,nums.length-1);
            reverse(nums,0,k-1);
            reverse(nums,k,nums.length-1);
        }
        public static void reverse(int[] arr,int a,int b){
            while(a<b){
                int temp=arr[a];
                arr[a]=arr[b];
                arr[b]=temp;
                a++;
                b--;
            }
        }
    }
