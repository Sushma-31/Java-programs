import java.util.Scanner;

public class LastAndSecondLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
       
        int lastDigit = number % 10;
        
      
        number /= 10;
        int secondLastDigit = number % 10;
        
        System.out.println("Last digit: " + lastDigit);
        System.out.println("Second last digit: " + secondLastDigit);
    }
}
