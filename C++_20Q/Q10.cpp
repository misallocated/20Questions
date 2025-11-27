#include <cstring>
#include <fstream>
#include <iostream>
#include <vector>

int main() {
  std::ifstream myFile("lines.txt");
  std::string s;
  int numofLines;
  std::vector<std::string> array;

  while (std::getline(myFile, s)) {
    std::cout << "[+] Line found" << std::endl;
    numofLines += 1;
    array.push_back(s);
  }

  for (int i = array.size() - 1; i > 0; i--) {
    std::cout << array[i].length() << ":" << array[i] << std::endl;
  }
}
