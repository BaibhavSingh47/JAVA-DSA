package Strings;

/**
 * NumberOfVowels
 */
public class NumberOfVowels {

    public static void main(String[] args) {
        String s="baibhav";
        int i=0;
        for (int j = 0; j < s.length(); j++) {
            char ch=s.charAt(j);
            if (ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' ||ch== 'u' ) {
                i += 1;
            }
        }

        System.out.println(i);
    }
}