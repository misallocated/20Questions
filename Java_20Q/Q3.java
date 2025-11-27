import java.util.Scanner;

public class Q3 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter Line to Capitalise: ");

    String s = scan.nextLine();

    String capitalised = s.toUpperCase();

    System.out.println("Capitalised: " + capitalised);
  }
}
