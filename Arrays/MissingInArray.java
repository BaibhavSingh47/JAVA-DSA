// public class MissingInArray {
//     public static void missArr(int[] arr) {
//         int n = arr.length;
//         int max = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (max <= arr[i]) {
//                 max = arr[i];
//             } else {
//                 max = 0 + max;
//             }
//         }
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];

//         }
//         int max2 = 0;

//         for (int i = 1; i <= max; i++) {
//             max2 += i;
//         }

//         if (n == 1) {
//             if (max == 1) {
//                 System.out.println(2); 

//             } else {
//                 System.out.println(1); 
//             }

//         } else {
//             if (max == n) {
//                 System.out.println(max+1);
//             } else {
//                 System.out.println(max2-sum);
//             }

//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1,2,3 };
//         missArr(arr);
//     }
// }


class Solution {
    int missingNum(int arr[]) {
        long n = arr.length + 1; // 1 to n tak numbers honge arr me
        long sum = n * (n + 1) / 2;
        long arraySum = 0;
        for (int ele : arr) {
            arraySum += ele;
        }
        return (int) (sum - arraySum);
    }
}