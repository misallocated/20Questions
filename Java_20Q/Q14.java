import java.util.Scanner;

public class Q14 {
  public static void Euclid(int num1, int num2) {

    int r = num1 % num2;

    while (r > 0) {
      num1 = num2;
      num2 = r;
      r = num1 % num2;
    }
    System.out.println("GCD: " + num2);
  }

  public static void main(String[] args) {

    int num1;
    int num2;

    Scanner n = new Scanner(System.in);

    System.out.println("Enter first number: ");

    num1 = n.nextInt();

    System.out.println("Enter Second number: ");

    num2 = n.nextInt();

    Euclid(num1, num2);

  }
}
