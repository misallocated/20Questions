#include <fstream>
#include <iostream>
#include <string>
#include <vector>

int main() {
  std::ifstream myFile("words.txt");
  std::string s;
  int i = 0;
  std::vector<std::string> array;

  while (std::getline(myFile, s)) {
    array.push_back(s);
  }

  for (int i = array.size() - 1; i > 0; i--) {
    std::cout << array[i] << std::endl;
  }
}
