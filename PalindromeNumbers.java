public class PalindromeNumbers {
    public static boolean isPalindrome(int num) {
        int reversedNum = 0, remainder, originalNum;
        originalNum = num;

        while( num != 0 ) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num  /= 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        int n = 100; 
        System.out.println("Palindrome numbers up to " + n + ":");
        for (int i = 0; i <= n; i++) {
            if (isPalindrome(i))
                System.out.print(i + " ");
        }
    }
}
