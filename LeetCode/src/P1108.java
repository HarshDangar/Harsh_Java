public class P1108 {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            char temp = address.charAt(i);
            if (temp == '.') {
                builder.append("[.]");
            } else
                builder.append(temp);
        }
        return builder.toString();
    }
}
