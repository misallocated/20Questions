import java.util.Scanner;
import java.io.*;

public class Q7 {
  public static void main(String[] args) {
    try {

      Scanner in = new Scanner(new FileReader("words.txt"));
      int index = 0;

      String[] words = new String[100];

      while (in.hasNextLine()) {
        String temp = in.nextLine();
        words[index] = temp;
        index += 1;
      }

      for (int i = index - 1; i > 0; i--) {
        System.out.println(words[i]);
      }

    } finally {
      return;
    }
  }
}
