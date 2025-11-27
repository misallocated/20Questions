import java.util.Scanner;
import java.io.*;

public class Q10 {
  public static void main(String[] args) throws IOException {

    Scanner in = new Scanner(new FileReader("words.txt"));
    int numOfLines = 0;

    while (in.hasNextLine()) {
      numOfLines++;
      in.nextLine();
    }

    in.close();

    String[] lines = new String[numOfLines];
    Scanner append = new Scanner(new FileReader("words.txt"));
    int index = 0;

    while (append.hasNextLine()) {
      lines[index] = append.nextLine();
      index++;
    }

    append.close();

    for (int i = lines.length - 1; i >= 0; i--) {
      int temp = lines[i].length();
      System.out.println(temp + ":" + lines[i]);
    }

  }
}
