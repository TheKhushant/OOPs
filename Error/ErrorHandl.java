package duplicate;
public class ErrorHandl {
    public static void main(String[] args) {
        
        try {
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
        
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        }
        
        try {
            String str = null;
            System.out.println(str.length()); 
        } catch (NullPointerException e) {
            System.out.println("Null reference encountered.");
        }
                
        try {
            String input = "abc"; 
            int num = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
        
    }
}
