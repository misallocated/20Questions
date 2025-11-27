#include <iostream>

int calls = 0;

int f(int n) {
  if (n < 2) {
    calls += 1;
    return n;
  }
  calls += 1;
  return f(n - 1) + f(n - 2) + f(n - 3);
}

int main() {
  std::cout << "Sum: " << f(4) << std::endl;
  std::cout << "Calls: " << calls << std::endl;
}
