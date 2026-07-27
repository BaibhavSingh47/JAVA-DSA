// package Basic_Sorting;

// public class SelectionSort {
//     public static void print(int[] arr) {
//         for (int ele : arr) {
//             System.out.print(ele + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 5, -2, 6, 7, 2, 0, 7, 2 };
//         int n = arr.length;

//         for (int i = 0; i < n - 1; i++) { // n-1 passes

//             int min = Integer.MAX_VALUE, mindx = -1;
//             for (int j = i; j < n; j++) {
//                 if (arr[j] < min) {
//                     min = arr[j];
//                     mindx = j;
//                 }
//             }
//             int temp = arr[i];
//             arr[i] = arr[mindx];
//             arr[mindx] = temp;
//         }
//         print(arr);
//     }
// }



package Basic_Sorting;

/**
 * SelectionSort
 */
public class SelectionSort {

    public static void print(int[] arr) {
    for (int ele : arr) {
    System.out.print(ele + " ");
    }
    }

    public static void main(String[] args) {
        int[] arr={2,-3,-1,7,3,2,0};
        int n=arr.length;
        for (int i = n-1; i >= 1; i--) {
            int max=Integer.MIN_VALUE, maxdx=-1;
            for (int j = i; j >=0; j--) {
                if (arr[j]>max) {
                    max=arr[j];
                    maxdx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxdx];
            arr[maxdx]=temp;
        }
        print(arr);
        
    }
}