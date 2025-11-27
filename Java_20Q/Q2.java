import java.util.Scanner;

public class Q2 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter String To Reverse: ");

    String s = scan.nextLine();

    String rev = "";

    for (int i = s.length() - 1; i >= 0; i--) {
      char currentChar = s.charAt(i);
      rev += currentChar;
    }

    System.out.println("Reversed: " + rev);
  }
}
