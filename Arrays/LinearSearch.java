package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={3,6,8,3,78,2};
        int Target=78;
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if (Target==arr[i]) {
                flag=true;
                break;
            }
        }
        if (flag==true) {
            System.out.println("Yes it is exist in a array");
        }
        else{
            System.out.println("no it is not exist in array");
        }
    }
}
