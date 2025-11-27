#include <iostream>
#include <iterator>
#include <vector>

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

class Countries {
private:
  std::vector<Country> countries;
  int nextFreeCountry = 0;

public:
  Countries(int size) { countries.reserve(size); }

  void addCountry(std::string name, std::string capital, int population) {

    // Can't implement runtime `nextFreeCountry` without vector :(
    countries.push_back(Country(name, capital, population));
    nextFreeCountry += 1;
  }

  std::vector<Country> getCountries() { return countries; }
};

int main() {

  Countries newCountry(2);

  newCountry.addCountry("England", "London", 60000000);
  newCountry.addCountry("United States", "Washington", 100000000);

  std::vector<Country> country = newCountry.getCountries();

  country[0].toString();
}
