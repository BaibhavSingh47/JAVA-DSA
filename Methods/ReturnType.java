// public class ReturnType {
//     public static int prasun(){
//         System.out.println("banu");
//         System.out.println("Nanda");
//         return 5;
//     }
//     public static void main(String[] args) {
         
//         System.out.println(prasun());
//     }
// }


public class ReturnType {

    public static int hit(int a){
        if (a<5) {
            return a;
        }
        return 4;
    }

    public static void main(String[] args) {
     hit(3); 
    }
}