import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter Full Expression: ");

    String expression = s.nextLine();
    String operator = "";
    String num1 = "";
    String num2 = "";
    int index = 0;
    int result = 0;

    for (int i = 0; i < expression.length(); i++) {

      if (expression.charAt(i) == '+') {
        operator = "+";
        index = i;
      }

      if (expression.charAt(i) == '-') {
        operator = "-";

        index = i;
      }

      if (expression.charAt(i) == '/') {
        operator = "/";
        index = i;
      }

      if (expression.charAt(i) == '*') {
        operator = "*";
        index = i;
      }

    }

    for (int i = 0; i < index - 1; i++) {
      num1 += expression.charAt(i);

    }

    for (int i = index + 2; i < expression.length(); i++) {

      num2 += expression.charAt(i);

    }

    switch (operator) {
      case "+":

        result = Integer.parseInt(num1) + Integer.parseInt(num2);
        System.out.println(result);
        break;

      case "-":

        result = Integer.parseInt(num1) - Integer.parseInt(num2);
        System.out.println(result);
        break;

      case "/":

        result = Integer.parseInt(num1) / Integer.parseInt(num2);
        System.out.println(result);
        break;

      case "*":

        result = Integer.parseInt(num1) * Integer.parseInt(num2);
        System.out.println(result);
        break;
    }

  }
}
