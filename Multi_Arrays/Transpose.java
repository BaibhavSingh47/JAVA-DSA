package Multi_Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = { { 2, 6, 3},
                { 4, 8, 0},
                { 2, 6, 13} };
        print(arr);
        // Transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <=i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][j];
                arr[j][i] = temp;
            }
        }
        print(arr);

    }

    public static void print(int[][] arr) {
        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
