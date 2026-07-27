package Binary_Search;

public class FirstOccurence {
    
        public static int binarysearch(int[] arr, int tar) {
            // Code Here
            int lo = 0, hi = arr.length - 1, idx = -1;
            while (lo <= hi) {
                int mid = (lo + hi) / 2;
                if (arr[mid] > tar)
                    hi = mid - 1;
                else if (arr[mid] < tar)
                    lo = mid + 1;
                else { // arr[mid] == tar
                    idx = mid;
                    hi = mid - 1;
                }
            }
            return idx;
        }
    
    public static void main(String[] args) {
        int[] arr = { 3, 6, 2, 5, 2 };
        System.out.println(binarysearch(arr, 2));

    }
    
}
