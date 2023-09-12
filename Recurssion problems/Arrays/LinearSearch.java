package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(search(arr,0,7));
    }
    public static boolean search(int[] arr, int n, int target){
        if(n==arr.length-1){
            return false;
        }
        return arr[n]==target?true:search(arr,n+1,target);
    }

}
