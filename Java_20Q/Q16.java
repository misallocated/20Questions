import java.util.Scanner;

public class Q16 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] words = new String[5];

    for (int i = 0; i < 5; i++) {
      String temp = in.nextLine();
      words[i] = temp;
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 4 - i; j++) {
        if (words[j].compareTo(words[j + 1]) > 0) {
          String temp = words[j];
          words[j] = words[j + 1];
          words[j + 1] = temp;
        }
      }
    }

    System.out.println("--------------");

    for (int i = 0; i < 5; i++) {
      System.out.println(words[i]);
    }

  }
}
