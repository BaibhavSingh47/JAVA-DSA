package Binary_Search;

public class Binary {
    static boolean searchInSorted(int arr[], int tar) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] > tar)
                hi = mid - 1;
            else if (arr[mid] < tar)
                lo = mid + 1;
            else
                return true;
        }
        return false; 
    }
    public static void main(String[] args) {
        int[] arr={3,6,2,5,2};
        System.out.println(searchInSorted(arr, 2));
        
    }
}
