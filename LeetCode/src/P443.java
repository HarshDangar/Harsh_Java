public class P443 {
    public static void main(String[] args) {
        String str = "abbbbbbbbbbbb";
        System.out.println(compress(str.toCharArray()));
    }

    private static int compress(char[] chars) {
        int start = 0;
        int end;
        int index = 0;

        while (start < chars.length) {
            end = start;
            while (end < chars.length && chars[start] == chars[end]) {
                end++;
            }

            chars[index] = chars[start];
            if (end - start > 1) {
                for (char c : String.valueOf(end - start).toCharArray()) {
                    chars[index + 1] = c;
                    index++;
                }
                index++;
            } else {
                index += 1;
            }
            start = end;
        }
        return index;
    }
}
