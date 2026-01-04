public class Main {
    public static void main(String[] args) throws Exception {
        String str = "abbccda";

        HuffmanCoder hf = new HuffmanCoder(str);
        String codedString = hf.encode(str);
        System.out.println(codedString);

        String decodedString = hf.decode(codedString);
        System.out.println(decodedString);
    }
}
