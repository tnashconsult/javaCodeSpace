import java.util.Scanner;

public class Fraction {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numerator, denominator, result;
    
    System.out.println("Enter Numerator");
    numerator = scanner.nextInt();
    System.out.println("Enter Denominator:");
    denominator = scanner.nextInt();
    System.out.println();

    result = numerator/denominator;
    System.out.println( numerator + " / " + denominator + " = " + result);
    
  }

}