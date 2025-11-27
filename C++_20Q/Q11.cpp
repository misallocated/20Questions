#include <iostream>

int calls = 0;

int fib(int n) {

  if (n <= 1) {
    calls += 1;
    return n;
  }

  else {
    calls += 1;
    std::cout << calls << std::endl;
    return (fib(n - 1) + fib(n - 2));
  }
}

int main() { std::cout << fib(10); }
