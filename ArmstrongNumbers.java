public class ArmstrongNumbers {
    public static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0, n = 0;
        originalNum = num;

        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }

        originalNum = num;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        return result == num;
    }

    public static void main(String[] args) {
        int n = 1000; 
        System.out.println("Armstrong numbers up to " + n + ":");
        for (int i = 0; i <= n; i++) {
            if (isArmstrong(i))
                System.out.print(i + " ");
        }
    }
}
