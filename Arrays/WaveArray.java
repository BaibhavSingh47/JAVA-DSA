class Solution {
    public static void convertToWave(int[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
    }
}

class Solution2 {
    public void sortInWave(int arr[]) {
        // code here
        int n = arr.length;
        int i = 0;
        int j = i + 1;
        while (i != n - 1 && j < n) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i += 2;
            j = i + 1;
        }

    }
}
