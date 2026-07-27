package Arrays;

import java.util.Scanner;

public class SumAndMax {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] arr =new int [5];
        System.out.println("Enter n array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int mul=1;
        int max=0;
          for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            mul*=arr[i];
            if (max>arr[i]) {
                max=0;
            }
            else{
                max=arr[i];
            }

        }
        System.out.println(sum);
        System.out.println(mul);
        System.out.println(max);
    }
}
