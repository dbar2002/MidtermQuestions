public class URLify {
    public static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        int newIndex = trueLength - 1 + spaceCount * 2;

        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[newIndex] = '0';
                str[newIndex - 1] = '2';
                str[newIndex - 2] = '%';
                newIndex -= 3;
            } else {
                str[newIndex] = str[i];
                newIndex--;
            }
        }
    }

    public static void main(String[] args) {
        String input = "Mr John Smith    ";
        int trueLength = 13; // The true length of the string excluding extra spaces
        char[] str = input.toCharArray();

        replaceSpaces(str, trueLength);

        // Convert the character array back to a string
        String result = new String(str);

        System.out.println("Original: " + input);
        System.out.println("Modified: " + result);
    }
}
