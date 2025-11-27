import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class LLNode {
  String data;
  LLNode next;

  public LLNode(String data, LLNode next) {
    this.data = data;
    this.next = next;
  }
}

public class LLNodeExample {

  public static void main(String[] args) throws Exception {
    LLNode head = null;

    String filename = "lines.txt";

    try (Scanner sc = new Scanner(new File(filename))) {
      while (sc.hasNextLine()) {
        String line = sc.nextLine();
        head = new LLNode(line, head);
      }

      System.out.println("Lines in reverse order (linked list):");
      LLNode current = head;
      while (current != null) {
        System.out.println(current.data);
        current = current.next;
      }
    }
  }
}
