import java.util.Arrays;

public class Permutation {
    public static boolean arePermutations(String str1, String str2) {
        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert both strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "bca";

        boolean result = arePermutations(str1, str2);

        if (result) {
            System.out.println(str1 + " and " + str2 + " are permutations of each other.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not permutations of each other.");
        }
    }
}
