public class PrintAlphabetsASCII {
    public static void main(String[] args) {
        System.out.println("ASCII values of Alphabets:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + ": " + (int) ch);
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + ": " + (int) ch);
        }
    }
}
