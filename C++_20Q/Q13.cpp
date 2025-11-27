#include <iostream>

void Sieve(int range) {

  int *array = new int[range];

  for (int base = 2; base < range; base++) {
    for (int multiple = base * 2; multiple < range;
         multiple = multiple + base) {
      array[multiple] = 1;
    }
  }

  for (int i = 2; i < range; i++) {
    if (array[i] == 0) {
      std::cout << i << std::endl;
    }
  }
}

int main() { Sieve(10); }
