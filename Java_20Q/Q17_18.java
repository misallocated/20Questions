// Question 17:
public class Country {

  private String name;
  private String capital;
  private int population;

  Country(String name, String capital, int population) {
    this.name = name;
    this.capital = capital;
    this.population = population;
  }

  public String getName() {
    return name;
  }

  public String getCapital() {
    return capital;
  }

  public int getPop() {
    return population;
  }

  public String toString() {
    return "Name: " + name + ", Capital: " + capital + ", Population: " + population;
  }

}

// Question 18:

public class Countries {
  private Country[] count;
  private int nextFreeCountry = 0;

  Countries(int size) {
    this.count = new Country[size];
  }

  public void addCountry(String name, String capital, int population) {
    count[nextFreeCountry] = new Country(name, capital, population);
    nextFreeCountry++;
  }

  public Country[] getCountries() {
    return count;
  }

}

public class Q17_18 {
  public static void main(String[] args) {

    Country c = new Country("England", "London", 1000000);
    String test = c.toString();
    System.out.println("Test: " + test);

    Countries multi = new Countries(2);
    multi.addCountry("America", "Washington", 2130918);
    Country[] testing = multi.getCountries();
    System.out.println(testing[0]);

  }
}
