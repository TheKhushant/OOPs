import java.util.Scanner;
public class ErrorHandl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // to generate ArthemeticException 
            int result = 10/0;

            // to generate input mismatch error
            System.out.println("enter an integer (enter inpute as = asdf/abc): ");
            int value = scanner.nextInt(); 

            //to generate exception 
            
        }
        catch (ArithmeticException e) {
            System.out.println("((()))Cannot divide by zero.");
        }
        catch (java.util.InputMismatchException e) {
            System.out.println("((()))enter valid inpute.");
        }
        catch (Exception e) {
            System.out.println("((()))un expected error error");
        }
        finally{
            System.out.println("((()))program ends...");
            scanner.close();
        }
    }
}
