public class UniqueCharacters {
    public static boolean hasUniqueCharacters(String str) {
        if (str == null || str.length() > 128) {
            return false; // Assuming ASCII characters (128 possible characters)
        }

        boolean[] charSet = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val]) {
                return false; // Duplicate character found
            }
            charSet[val] = true;
        }

        return true; // All characters are unique
    }

    public static void main(String[] args) {
        String input = "abcdefg";
        boolean result = hasUniqueCharacters(input);
        System.out.println("Input string has all unique characters: " + result);
    }
}
