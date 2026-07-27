package Arrays;
public class MedianOfTwoSortedArrays {

    public static void findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] c = new int[nums1.length + nums2.length];
        int i = 0;
        int k = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                c[k] = nums1[i];
                i++;
                k++;
            } else {
                c[k] = nums2[j];
                j++;
                k++;
            }
        }

            while (i < nums1.length) {
                c[k] = nums1[i];
                i++;
                k++;
            }
            while (j < nums2.length) {
                c[k] = nums2[j];
                j++;
                k++;
            }
            for (int j2 = 0; j2 < c.length; j2++) {
                System.out.print(c[j2] + " ");
            }
        
    }

    public static void main(String[] args) {
        int[] a = { 2, 5, 6, 9, 20 };
        int[] b = { 1, 3, 4, 5, 7, 8, 90 };
        findMedianSortedArrays(a, b);

    }
}