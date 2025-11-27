#include <fstream>
#include <iostream>
#include <vector>

int main() {
  std::ifstream myFile("integers.txt");
  std::string s;
  std::vector<int> nums;
  int numofLines = 0;
  int sum = 0;

  while (std::getline(myFile, s)) {
    nums.push_back(std::stoi(s));
    numofLines += 1;
  }

  for (int i = 0; i < nums.size(); i++) {
    std::cout << nums[i] << std::endl;
    sum += nums[i];
  }

  int median = numofLines / 2;

  std::cout << "-------------" << std::endl << "The sum: " << sum << std::endl;
  std::cout << "The mean: " << sum / numofLines << std::endl;
  std::cout << "-------------" << std::endl;
  std::cout << "The median: " << nums[median] << std::endl;
  std::cout << "-------------" << std::endl;
  std::cout << "The lower quartile: " << std::endl;

  for (int i = 0; i < median; i++) {
    std::cout << nums[i] << ", ";
  }

  std::cout << std::endl
            << "-------------" << std::endl
            << "The upper quartile:" << std::endl;

  for (int i = median; i < nums.size(); i++) {
    std::cout << nums[i] << ", ";
  }

  std::cout << std::endl << "-------------" << std::endl;

  for (int i = 0; i < nums.size(); i++) {
    for (int j = i + 1; i < nums.size(); i++) {
      if (nums[i] == nums[j]) {
        std::cout << "The number: " << nums[i] << std::endl;
      }
    }
  }
}
