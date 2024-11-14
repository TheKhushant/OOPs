import java.util.Scanner;
public class NestedTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Outer try block starts...");
            try {
                System.out.println("Inner try block starts...");
                System.out.println("Enter a number: ");
                String input = scanner.nextLine();
                int number = Integer.parseInt(input);  
            } catch (NumberFormatException e) {
                System.out.println("((())) Invalid input. Not a valid number.");
            } catch (Exception e) {
                System.out.println("((())) Unexpected error in inner try block.");
            }

            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("((())) Cannot divide by zero.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("((())) Invalid input type.");
        } catch (Exception e) {
            System.out.println("((())) Unexpected error in outer try block.");
        } finally {
            System.out.println("((())) Program ends...");
            scanner.close();
        }
    }
}
