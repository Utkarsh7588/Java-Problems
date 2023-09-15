package Arrays;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={3,4,2,1,6};
        arr=sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
    public static int[] sort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid= arr.length/2;
        int [] left= sort(Arrays.copyOfRange(arr,0,mid));
        int [] right= sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);

    }
    public static int [] merge(int [] arr1, int[]arr2){
        int i=0,j=0,k=0;
        int [] mix=new int[arr1.length+arr2.length];
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                mix[k]=arr1[i];
                i++;
                k++;
            }
            else{
                mix[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            mix[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            mix[k]=arr2[j];
            j++;
            k++;
        }
        return mix;
    }
}
