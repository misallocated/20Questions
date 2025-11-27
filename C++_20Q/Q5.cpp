#include <fstream>
#include <iostream>
#include <string>

int main() {

  std::string s;

  std::ifstream myFile("words.txt");
  while (std::getline(myFile, s)) {

    if (s[0] == 'A' || s[0] == 'b') {
      std::cout << s << std::endl;
    }
  }

  myFile.close();
}
