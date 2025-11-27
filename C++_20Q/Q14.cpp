#include <iostream>

int main() {

  int num1;
  int num2;
  int r;

  std::cout << "Enter first number: " << std::endl;
  std::cin >> num1;

  std::cout << "Enter second number: " << std::endl;
  std::cin >> num2;

  r = num1 % num2;
  while (r > 0) {
    std::cout << "Entered Loop!" << std::endl;
    num1 = num2;
    num2 = r;
    r = num1 % num2;
  }
  std::cout << "The GCD: " << num2 << std::endl;
}
