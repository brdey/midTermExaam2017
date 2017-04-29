package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
    	permutationString("", "ABC");
    }

    public static void permutationString(String firstString, String lastString) {
      if (lastString.length() <= 1)
        System.out.println(" The Permutation strings are : "+firstString + lastString);
      else
        for (int i = 0; i < lastString.length(); i++) {
          try {
            String newString = lastString.substring(0, i) + lastString.substring(i + 1);

            permutationString(firstString + lastString.charAt(i), newString);
          } catch (StringIndexOutOfBoundsException exception) {
            exception.printStackTrace();
          }
        }
    }
}
