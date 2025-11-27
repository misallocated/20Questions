public class Q8 {

  public

  String payload;
  Q8 next;

  Q8(String payload, Q8 next) {
    this.payload = payload;
    this.next = next;
  }

  public static void main(String[] args) {
    Q8 base = null;
    Q8 temp;

    temp = new Q8("Test", base);
    base = temp;

    // Head insert new
    temp = new Q8("okay", base);
    base = temp;

    // Insert Another
    temp = new Q8("poop", base);
    base = temp;

    Q8 current = base;
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
