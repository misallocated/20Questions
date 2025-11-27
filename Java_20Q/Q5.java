import java.util.Scanner;
import java.io.*;

public class Q5 {
  public static void main(String[] args) {
    try {

      Scanner in = new Scanner(new FileReader("words.txt"));

      while (in.hasNextLine()) {
        String temp = in.nextLine();
        if (temp.contains("A") || temp.contains("b")) {
          System.out.println(temp);
        }
      }

    } finally {
      return;
    }

  }

}
