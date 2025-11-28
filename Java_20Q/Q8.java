import java.util.Scanner;
import java.io.*;

public class LLNode {
  public String payload;
  public LLNode next;

  LLNode(String payload, LLNode next) {
    this.payload = payload;
    this.next = next;
  }
}

public class Q8E {
  public static void main() throws IOException {
    Scanner in = new Scanner(new FileReader("words.txt"));
    LLNode base = null;
    LLNode temp;

    while (in.hasNextLine()) {
      String t = in.nextLine();
      temp = new LLNode(t, base);
      base = temp;
    }

    LLNode current = base;
    boolean flag = true;

    while (flag) {
      System.out.println(current.payload);
      current = current.next;
      if (current.next == null) {
        System.out.println(current.payload);
        flag = false;
      }
    }

  }
}
