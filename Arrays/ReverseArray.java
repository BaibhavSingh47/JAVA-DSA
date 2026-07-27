package Arrays;


// public class ReverseArray {

//    public static void main(String[] args) {
//      int[] arr={3,4,5,6,7,8};
//     for (int i = arr.length-1; i >= 0; i--) {
//         System.out.println(arr[i]+ " ");
        
//     }
//    }
// }

/**
 * ReverseArray
 */
public class ReverseArray {
    public static void swap(int[] arr){
        int i=0,j=arr.length-1;
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        swap(arr);
    }
}