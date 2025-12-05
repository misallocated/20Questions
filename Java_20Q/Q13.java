public class Q13 {
  public static void Sieve(int k) {
    int[] numbers = new int[k];

    for (int base = 2; base < k; base++) {
      for (int multiple = base * 2; multiple < k; multiple += base) {

        numbers[multiple] = 1;
      }
    }

    for (int i = 2; i < k; i++){
      if(numbers[i] == 0)
        System.out.println(i);
  }

  public static void main(String[] args) {
    Sieve(50);
  }
}
