#include <iostream>
#include <vector>

int main() {

  std::string expression;
  std::string first;
  std::string second;
  int index;
  int op;

  std::cout << "Enter expression: " << std::endl;
  std::getline(std::cin, expression);

  for (int i = 0; i < expression.length(); i++) {
    if (expression[i] == '+') {
      op = 1;
      index = i;
    }

    if (expression[i] == '-') {
      op = 2;
      index = i;
    }

    if (expression[i] == '/') {
      op = 3;
      index = i;
    }

    if (expression[i] == '*') {
      op = 4;
      index = i;
    }
  }

  if (index && op) {
    std::cout << "[INFO] -> Operator Found!" << std::endl;
  }

  for (int i = 0; i < index; i++) {
    first += expression[i];
  }

  for (int i = index + 2; i < expression.length(); i++) {
    second += expression[i];
  }

  switch (op) {
  case 1:
    std::cout << std::stoi(first) + std::stoi(second) << std::endl;
    break;
  case 2:
    std::cout << std::stoi(first) - std::stoi(second) << std::endl;
    break;
  case 3:
    std::cout << std::stoi(first) / std::stoi(second) << std::endl;
    break;
  case 4:
    std::cout << std::stoi(first) * std::stoi(second) << std::endl;
    break;
  default:
    std::cout << "[ERROR] -> No operator found" << std::endl;
  }
}
