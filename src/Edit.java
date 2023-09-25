public class Edit {
    public static boolean isOneEditAway(String str1, String str2) {
        if (Math.abs(str1.length() - str2.length()) > 1) {
            return false; // More than one edit away
        }

        boolean foundEdit = false;
        int i = 0, j = 0;

        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) != str2.charAt(j)) {
                if (foundEdit) {
                    return false; // Already found one edit, so more than one edit away
                }

                foundEdit = true;

                if (str1.length() < str2.length()) {
                    j++; // Increment j to skip a character in the longer string
                } else if (str1.length() > str2.length()) {
                    i++; // Increment i to skip a character in the longer string
                }
            } else {
                i++;
                j++;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "pale";
        String str2 = "ple";
        String str3 = "pales";
        String str4 = "bale";
        String str5 = "bake";

        System.out.println(isOneEditAway(str1, str2)); // true (one insertion)
        System.out.println(isOneEditAway(str1, str3)); // true (one insertion)
        System.out.println(isOneEditAway(str1, str4)); // true (one replacement)
        System.out.println(isOneEditAway(str1, str5)); // false (more than one edit away)
    }
}
