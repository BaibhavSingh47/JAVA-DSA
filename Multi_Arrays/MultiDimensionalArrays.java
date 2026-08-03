package Multi_Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // int[][] arr=new int[5][5 ];
        int[][] arr={{6,7,8,8},{2,3,4,5},{2,5,8,0}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
