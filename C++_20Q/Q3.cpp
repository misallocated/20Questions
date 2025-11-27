#include <iostream>

int main() {
  std::string s;
  std::cout << "Enter text to be capitalised: ";
  std::getline(std::cin, s);

  for (int i = 0; i < s.length(); i++) {
    char temp = std::toupper(s[i]);
    std::cout << temp;
  }
}
