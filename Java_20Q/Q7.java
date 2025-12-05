import java.util.Scanner;
import java.io.*;

public class Q7 {
  public static void main(String[] args) throws IOException {

      Scanner in = new Scanner(new FileReader("words.txt"));
      int lines = 0;
      int index = 0;

      while (in.hasNextLine()) { lines++; in.nextLine(); }

      String[] words = new String[lines];

      Scanner add = new Scanner(new FileReader("words.txt"));

      while (add.hasNextLine()) {
        words[index] = add.nextLine();
        index += 1;
      }

      for (int i = lines - 1; i >= 0; i--) {
        System.out.println(words[i]);
      }

    } 
  }
}
