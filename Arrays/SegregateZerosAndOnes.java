// public class SegregateZerosAndOnes {
//     public static void main(String[] args) {
//         int [] arr={0,0,1,1,0};
//        int numberOfZeros=0;
//        int numberOfOnes=0;
//        for(int ele: arr){
//         if (ele==0) {
//             numberOfZeros++;
//         }
//         else numberOfOnes++;
//        }

//        for (int i = 0; i < arr.length; i++) {
//         if (i<numberOfZeros) {
//             arr[i]=0;
//         }
//         else arr[i]=1;
//        }

//        for (int i = 0; i < arr.length; i++) {
//         System.out.println(arr[i]);
//        }
//     }
// }



/**
 * SegregateZerosAndOnes
 */
public class SegregateZerosAndOnes {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0 };
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {                                             //Two Pointer Approach
            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

            else if (arr[i]==0 && arr[j]==0) {
                    i++;
                }
            else if (arr[i]==1 && arr[j]==1) {
                j--;
            }

            else{
                i++;
                j--;
            }


        }

        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.println(arr[j2]);
        }

    }
}