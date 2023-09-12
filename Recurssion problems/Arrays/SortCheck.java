package Arrays;

public class SortCheck {
    public static void main(String[] args) {
        int [] arr={1,2,3,5,4};
        System.out.println(check(arr,0));

    }
    public static boolean check(int[] arr,int n){
        if(n==arr.length-1){
            return true;
        }
        if(arr[n]<arr[n+1]){
            return check(arr,n+1);
        }
        return false;
    }
}
