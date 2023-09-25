public class StringCompression {
    public static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Return the original string if it's null or empty
        }

        StringBuilder compressed = new StringBuilder();
        char currentChar = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                compressed.append(currentChar);
                compressed.append(count);
                currentChar = str.charAt(i);
                count = 1;
            }
        }

        // Append the last character and its count
        compressed.append(currentChar);
        compressed.append(count);

        // Return the shorter of the original and compressed strings
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String compressed = compressString(input);
        System.out.println("Original: " + input);
        System.out.println("Compressed: " + compressed);
    }
}
