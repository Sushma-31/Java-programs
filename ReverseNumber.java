public class ReverseNumber {
    public static int reverse(int num) {
        int reversedNum = 0;
        while(num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Reversed number of " + n + " is: " + reverse(n));
    }
}
