import java.util.Scanner;
import java.io.*;

public class Q6 {
  public static void main(String[] args) {
    try {
      Scanner in = new Scanner(new FileReader("words.txt"));

      while (in.hasNextLine()) {
        String temp = in.nextLine();
        if (temp.length() > 10) {
          System.out.println(temp);
        }
      }
    } finally {
      return;

    }
  }
}
