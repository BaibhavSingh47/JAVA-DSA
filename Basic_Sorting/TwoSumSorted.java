package Basic_Sorting;

import java.util.Arrays;

public class TwoSumSorted {
    public static boolean main(String[] args) {
        int[] arr={3,0,1,4,8};
        int n=arr.length;
         Arrays.sort(arr); // time = nlogn , space = n
        int i=0,j=arr.length-1;
        while(i<j){ // time = n
            if(arr[i]+arr[j]==target) return true;
            else if(arr[i]+arr[j]>target) j--;
            else if(arr[i]+arr[j]<target) i++;
        }
        return false;
    }
}
