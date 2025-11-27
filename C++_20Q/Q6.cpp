#include <fstream>
#include <iostream>
#include <string>

int main() {

  std::string s;

  std::ifstream myFile("words.txt");

  while (std::getline(myFile, s)) {
    if (s.length() >= 10) {
      std::cout << s << std::endl;
    }
  }
}
