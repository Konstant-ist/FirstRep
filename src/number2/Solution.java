package number2;

public class Solution {
    public static void main(String[] args) {
        String name = "ERE";
        String answer = String.valueOf(isPalindrome(name));
        System.out.println("Слово " + name + " палиндром?" + answer);
    }

    public static boolean isPalindrome(String name) {
        StringBuilder builder = new StringBuilder(name);
        builder.reverse();
        String rezult = builder.toString();
        if (rezult.equalsIgnoreCase(name)) ;
        {
            return true;
        }


        }
    }




