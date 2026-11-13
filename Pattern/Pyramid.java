public class Pyramid {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j-i==4 || i==5) {
                    System.out.print("* ");
                } else if((i==2 && j==4)  || (j==2 && i==4)  || (i==3 && j==3))
                     {
                         System.out.print("* ");
                }
                
            }
            System.out.println();
        }
    }
}