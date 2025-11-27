#include <iostream>

std::string *bubble_sort(std::string *array) {
  for (int i = 0; i < 5 - 1; i++) {
    for (int j = 0; j < 5 - i - 1; j++) {
      if (array[j] > array[j + 1]) {
        std::string temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
      }
    }
  }

  return array;
}

int main() {
  std::string *array = new std::string[5];
  std::string value;

  for (int i = 0; i < 5; i++) {
    std::cout << std::endl;
    std::cout << "Enter [" << i << "] Value: ";
    std::cin >> value;
    array[i] = value;
  }

  std::string *sorted = bubble_sort(array);

  for (int i = 0; i < 5; i++) {
    std::cout << sorted[i] << std::endl;
  }
}
