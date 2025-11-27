#include <iostream>

class LLNode {

public:
  std::string payload;
  LLNode *next;

  LLNode(std::string payload, LLNode *next) {
    this->payload = payload;
    this->next = next;
  }
};

int main() {
  LLNode *base = nullptr;
  LLNode *temp;

  // Insert 0 node
  temp = new LLNode("Zero", base);
  base = temp;

  // Head Insert First
  temp = new LLNode("First", base);
  base = temp;

  // Head Insert Second
  temp = new LLNode("Second", base);
  base = temp;

  LLNode *current = base;
  while (current) {
    std::cout << current->payload << std::endl;
    current = current->next;
  }
}
