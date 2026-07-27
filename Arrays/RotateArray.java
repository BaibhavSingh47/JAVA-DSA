
// public class RotateArray{

//     public static void swap(int[] arr, int d){
//         int i=0;
//         int j=arr.length-1;
//         while(i<j){
//             int temp =arr[i];
//              arr[i]=arr[j];
//              arr[j]=temp;
//              i++;
//              j--;

//         }

//         int x = 0;
//         int y = arr.length-d - 1;
//         while (x < y) {
//             int temp = arr[x];
//             arr[x] = arr[y];
//             arr[y] = temp;
//             x++;
//             y--;

//         }

//         int a = arr.length-d;
//         int b = arr.length -1;
//         while (a < b) {
//             int temp = arr[a];
//             arr[a] = arr[b];
//             arr[b] = temp;
//             a++;
//             b--;

//         }

//         for (int j2 = 0; j2 < arr.length; j2++) {
//             System.out.println(arr[j2]);
//         }

//     }
//     public static void main(String[] args) {
//         int[] arr={1,2,3,4,5};
//         swap(arr, 2);
//     }
// }

// mETHOD--2
/**
 * RotateArray
 */


public class RotateArray {

    public static void rotateArr(int [] arr, int d){

    int n=arr.length;
    d = d % n;

    reverse(arr,0,n-1);
    reverse(arr,0,n-d-1);

    reverse(arr,n-d,n-1);

    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    }

    public static void reverse(int[] arr,int i,int j){
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int [] arr={1,3,5,7,9};
        rotateArr(arr, 2);

    }
}