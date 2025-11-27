#include <iostream>

int main() {
  std::string s;
  std::cout << "Enter text to be reversed: ";
  std::getline(std::cin, s);

  for (int i = s.length(); i >= 0; i--) {
    std::cout << "Reversed: " << s[i];
  }
}
