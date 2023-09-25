public class Palindrome {
    public static boolean isPermutationOfPalindrome(String str) {
        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();

        int[] charCounts = new int[128]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            charCounts[c]++;
        }

        int oddCount = 0;

        for (int count : charCounts) {
            if (count % 2 != 0) {
                oddCount++;
                if (oddCount > 1) {
                    return false; // More than one character has an odd count
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input1 = "Tact Coa";
        String input2 = "abcddcba";
        String input3 = "hello";

        boolean result1 = isPermutationOfPalindrome(input1);
        boolean result2 = isPermutationOfPalindrome(input2);
        boolean result3 = isPermutationOfPalindrome(input3);

        System.out.println("\"" + input1 + "\" is a permutation of a palindrome: " + result1);
        System.out.println("\"" + input2 + "\" is a permutation of a palindrome: " + result2);
        System.out.println("\"" + input3 + "\" is a permutation of a palindrome: " + result3);
    }
}
