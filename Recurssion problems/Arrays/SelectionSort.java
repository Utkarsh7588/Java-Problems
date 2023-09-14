package Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={3,4,2,1,6};
        sort(arr,0,0);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void sort(int arr[],int r,int c) {
        if(r== arr.length-1){
            return;
        }

        if(c<arr.length){
            if(arr[c]<arr[r]){
                int temp=arr[c];
                arr[c]=arr[r];
                arr[r]=temp;
            }
            sort(arr,r,c+1);
        }
        else{
            sort(arr,r+1,r+2);
        }
    }
}
