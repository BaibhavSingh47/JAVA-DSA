package Arrays;

public class MulAdd {
   
    public static void main(String[] args) {
        int[] arr={1,3,6,7,10};

        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
                System.out.println(arr[i]+10);
            }
            else{
                System.out.println(arr[i]*2);
            }
        }

    }
}
