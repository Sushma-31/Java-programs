public class PrintNumbersASCII {
    public static void main(String[] args) {
        System.out.println("ASCII values of Numbers:");
        for (char ch = '0'; ch <= '9'; ch++) {
            System.out.println(ch + ": " + (int) ch);
        }
    }
}
