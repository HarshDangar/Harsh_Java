
public class P28 {
    public static void main(String[] args) {
        String haystack = "sabdbutsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

//    public static int strStr(String haystack, String needle) {
//        if (haystack.contains(needle)) {
//            return haystack.indexOf(needle);
//        } else {
//            return -1;
//        }
//    }

    private static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        // Here we have minus the length of needle because if needle is last in haystack than the maximum ans will be haystack minus needle.

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
