import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
        
            int number = scanner.nextInt();
            
         
            int result = 10 / number;
            
         
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println("Error: Division by zero");
        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
        } finally {
            
            scanner.close();
        }
    }
}
