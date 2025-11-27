public class Q11 {

  public

  static int calls = 0;

  static int fib(int n) {
    if (n <= 1) {
      calls += 1;
      System.out.println(calls);
      return n;
    }

    else {
      calls += 1;
      System.out.println(calls);
      return fib(n - 1) + fib(n - 2);
    }
  }

  public static void main(String[] args) {
    System.out.println(fib(4));

  }
}
