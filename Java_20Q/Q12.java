public class Q12 {

  static int calls = 0;

  public static int f(int n) {
    int f;

    if (n < 2) {
      calls++;
      System.out.println(calls);
      return n;
    }
    calls++;
    System.out.println(calls);
    return f(n - 1) + f(n - 2) + f(n - 3);

  }

  public static void main(String[] args) {
    System.out.println(f(4));
  }
}
