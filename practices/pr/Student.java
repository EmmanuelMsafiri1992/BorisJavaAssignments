package pr;

public class Student {
    
  /**
   * Converts a numerical score to a letter grade
   * @param score The numerical score to convert
   * @return The letter grade as a String (A, B, C, D, or F)
   */
  public String setGrade(int score) {
      if (score >= 90) {
          return "A";
      } else if (score >= 80) {
          return "B";
      } else if (score >= 70) {
          return "C";
      } else if (score >= 60) {
          return "D";
      } else {
          return "F";
      }
  }
  
  /**
   * Determines if a score is a passing grade (60 or above)
   * @param score The numerical score to check
   * @return true if the score is passing, false otherwise
   */
  public boolean isPassingGrade(int score) {
      return score >= 60;
  }
  
  /**
   * Combines first and last name into a full name
   * @param first The first name
   * @param last The last name
   * @return The full name as a String
   */
  public String getFullName(String first, String last) {
      return first + " " + last;
  }

  public static void main(String[] args) {
      // Create a new Student object
      Student student = new Student();
      
      // Test setGrade using for loop
      System.out.println("Testing grades from 50 to 100:");
      for (int score = 50; score <= 100; score += 10) {
          String grade = student.setGrade(score);
          boolean isPassing = student.isPassingGrade(score);
          System.out.println("Score: " + score + 
                           " | Grade: " + grade + 
                           " | Passing: " + isPassing);
      }
      
      // Test getFullName with multiple students using for loop
      System.out.println("\nTesting different student names:");
      String[] firstNames = {"John", "Mary", "James", "Sarah", "Michael"};
      String[] lastNames = {"Doe", "Smith", "Johnson", "Williams", "Brown"};
      
      for (int i = 0; i < firstNames.length; i++) {
          String fullName = student.getFullName(firstNames[i], lastNames[i]);
          System.out.println("Student " + (i+1) + ": " + fullName);
      }
  }
}