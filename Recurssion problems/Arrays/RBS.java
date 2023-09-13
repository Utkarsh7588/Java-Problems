package Arrays;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {6, 7, 1, 2, 3, 4, 5};
        System.out.println(search(arr, 0, arr.length - 1, 1));
    }

    public static int search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;  // Base case: target not found
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;  // Target found
        }

        if (arr[start] <= arr[mid]) {
            if (arr[start] <= target && target <= arr[mid]) {
                return search(arr, start, mid - 1, target);  // Search left half
            } else {
                return search(arr, mid + 1, end, target);     // Search right half
            }
        }

        if (arr[mid] <= target && target <= arr[end]) {
            return search(arr, mid + 1, end, target);  // Search right half
        }

        return search(arr, start, mid - 1, target);  // Search left half
    }
}
