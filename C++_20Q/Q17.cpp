#include <iostream>

#include <iostream>

class Country {
private:
  std::string name;
  std::string capital;
  int population;

public:
  Country(std::string name, std::string capital, int population)
      : name(name), capital(capital), population(population) {}

  std::string getName() { return name; }
  std::string getCapital() { return capital; }
  int getPop() { return population; }
  void toString() {
    std::cout << "Name: " << name << ", Capital: " << capital
              << ", Population: " << population << std::endl;
  }
};

int main() {
  Country country("England", "London", 62000000);
  country.toString();
}
