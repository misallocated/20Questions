import java.util.Scanner;

public class Q15 {
  public static void main(String[] main) {
    Scanner in = new Scanner(System.in);
    int[] numbers = new int[5];

    for (int i = 0; i < 5; i++) {
      System.out.println("Enter number: ");
      int temp = in.nextInt();
      numbers[i] = temp;
    }

    // Sort

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5 - i - 1; j++) {
        if (numbers[j] > numbers[j + 1]) {
          int temp = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = temp;
        }
      }
    }

    System.out.println("Sorted List: ");

    for (int i = 4; i >= 0; i--) {
      System.out.println(numbers[i]);

    }

  }
}
