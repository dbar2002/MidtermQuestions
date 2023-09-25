public class RotationChecker {
    public static boolean isSubstring(String str1, String str2) {
        // Simulate the isSubstring function
        return str1.contains(str2);
    }

    public static boolean isRotation(String s1, String s2) {
        // Check if the lengths are the same and not empty
        if (s1.length() == s2.length() && !s1.isEmpty()) {
            // Concatenate s1 with itself to create s1s1
            String s1s1 = s1 + s1;
            // Check if s2 is a substring of s1s1
            return isSubstring(s1s1, s2);
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        boolean result = isRotation(s1, s2);

        if (result) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is not a rotation of " + s1);
        }
    }
}
