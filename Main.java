import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};
        Arrays.sort(numbers);
        
        System.out.println("Numbers in ascending order:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}