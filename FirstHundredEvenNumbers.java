public class FirstHundredEvenNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        
        System.out.println("First 100 even numbers:");
        while (count < 100) {
           
                System.out.println(number);
                count++;
            
            number += 2;
        }
    }
}
