package Arrays;

public class TwoSum {
    public static boolean sum(int[] arr, int Target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == Target) {
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 1, 5, 2, 9 };
        System.out.println(sum(arr, 45));
    }
}
