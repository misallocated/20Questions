import java.util.Scanner;
import java.io.*;

public class Q7 {
  public static void main(String[] args) IOException {

      Scanner in = new Scanner(new FileReader("words.txt"));
      int lines = 0;
      int index = 0;

      while (in.hasNextLine()) { lines++; in.nextLine(); }

      String[] words = new String[lines];

      while (in.hasNextLine()) {
        String temp = in.nextLine();
        words[index] = temp;
        index += 1;
      }

      for (int i = index - 1; i >= 0; i--) {
        System.out.println(words[i]);
      }

    } 
  }
}
