package Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={3,4,2,1,6};
        sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr){
        sort(arr, arr.length-1,0);
    }
    public static void sort(int [] arr,int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            sort(arr,r,c+1);
        }
        else {

            sort(arr,r-1,0);
        }

    }
}
