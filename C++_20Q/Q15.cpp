#include <iostream>

int *bubble_sort(int *array) {

  int temp;

  for (int i = 0; i < 4; i++) {

    bool flag = false;

    for (int j = 0; j < 5 - i - 1; j++) {

      if (array[j] > array[j + 1]) {
        temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
        flag = 1;
      }
    }
  }

  return array;
}

int main() {
  int *array = new int[5];
  int value;

  for (int i = 0; i < 5; i++) {
    std::cout << "Enter " << "[" << i << "] value: " << std::endl;
    std::cin >> value;
    array[i] = value;
    std::cout << "-------" << std::endl
              << "Current Index: " << i << std::endl
              << "Current Value: " << value << std::endl
              << "------" << std::endl;
  }

  for (int i = 0; i < 5; i++) {
    std::cout << "DEBUG: " << array[i] << std::endl;
  }

  int *new_array = bubble_sort(array);

  for (int i = 0; i < 5; i++) {
    std::cout << new_array[i] << std::endl;
  }
}
