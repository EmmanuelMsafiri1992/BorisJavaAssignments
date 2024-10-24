package pr;

public class SimpleCalculator {
    
  /**
   * Adds two integers
   * @param a First number
   * @param b Second number
   * @return Sum of a and b
   */
  public int add(int a, int b) {
      return a + b;
  }
  
  /**
   * Subtracts two integers
   * @param a First number
   * @param b Second number
   * @return Difference of a and b
   */
  public int subtract(int a, int b) {
      return a - b;
  }
  
  /**
   * Multiplies two integers
   * @param a First number
   * @param b Second number
   * @return Product of a and b
   */
  public int multiply(int a, int b) {
      return a * b;
  }
  
  /**
   * Divides two doubles
   * @param a First number (dividend)
   * @param b Second number (divisor)
   * @return Quotient of a and b
   */
  public double divide(double a, double b) {
      if (b == 0) {
          System.out.println("Error: Cannot divide by zero!");
          return 0;
      }
      return a / b;
  }
  
  /**
   * Checks if a number is even
   * @param number Number to check
   * @return true if even, false if odd
   */
  public boolean isEven(int number) {
      return number % 2 == 0;
  }
  
  /**
   * Finds the maximum of two numbers
   * @param a First number
   * @param b Second number
   * @return The larger of a and b
   */
  public int max(int a, int b) {
      return (a > b) ? a : b;
  }
  
  /**
   * Returns the absolute value of a number
   * @param number Number to find absolute value of
   * @return Absolute value of the number
   */
  public int absolute(int number) {
      return Math.abs(number);
  }
  
  public static void main(String[] args) {
      SimpleCalculator calc = new SimpleCalculator();
      
      // Test basic operations
      System.out.println("Basic Operations:");
      System.out.println("-----------------");
      int num1 = 15;
      int num2 = 5;
      
      System.out.println(num1 + " + " + num2 + " = " + calc.add(num1, num2));
      System.out.println(num1 + " - " + num2 + " = " + calc.subtract(num1, num2));
      System.out.println(num1 + " * " + num2 + " = " + calc.multiply(num1, num2));
      System.out.println(num1 + " / " + num2 + " = " + calc.divide(num1, num2));
      
      // Test division by zero
      System.out.println("\nTesting division by zero:");
      System.out.println("10 / 0 = ");
      calc.divide(10, 0);
      
      // Test isEven
      System.out.println("\nTesting isEven:");
      System.out.println("-----------------");
      int[] numbersToTest = {2, 5, 10, 15};
      for (int num : numbersToTest) {
          System.out.println(num + " is even: " + calc.isEven(num));
      }
      
      // Test max
      System.out.println("\nTesting max:");
      System.out.println("-----------------");
      System.out.println("Max of 10 and 20: " + calc.max(10, 20));
      System.out.println("Max of 30 and 15: " + calc.max(30, 15));
      
      // Test absolute
      System.out.println("\nTesting absolute:");
      System.out.println("-----------------");
      int[] absNumbers = {-5, 0, 5, -10};
      for (int num : absNumbers) {
          System.out.println("Absolute of " + num + " is: " + calc.absolute(num));
      }
  }
}
