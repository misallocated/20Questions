import java.util.Scanner;

public class Q4E {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Enter Expression: ");

    String equation = s.nextLine();

    String[] parts = equation.split(" ");

    if (parts[1].equals("+")) {
      System.out.println(Integer.parseInt(parts[0]) + Integer.parseInt(parts[2]));
    }

    if (parts[1].equals("-")) {
      System.out.println(Integer.parseInt(parts[0]) - Integer.parseInt(parts[2]));
    }

    if (parts[1].equals("/")) {
      System.out.println(Integer.parseInt(parts[0]) / Integer.parseInt(parts[2]));
    }

    if (parts[1].equals("*")) {
      System.out.println(Integer.parseInt(parts[0]) * Integer.parseInt(parts[2]));
    }

    // Use .equals to compare actual values, == checks references
  }
}
