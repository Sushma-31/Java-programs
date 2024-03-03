public class StringToCharacters {
    public static void main(String[] args) {
        String str = "Hello";
        char[] charArray = str.toCharArray();
        System.out.println("Converted String to Characters:");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
    }
}
