package Multi_Arrays;

import java.util.Scanner;

public class row {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int max=0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (max<arr[i][j]) {
                    max=arr[i][j];
                }
            }             
            if(min>max){
                min=max;
            }
        }
        System.out.println("minmum number ina max row is "+ min);
    }
}
