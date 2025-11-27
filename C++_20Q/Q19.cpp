#include <iostream>

class CD {
private:
  std::string title;
  std::string artist;
  double price;

public:
  CD(std::string title, std::string artist, double price)
      : title(title), artist(artist), price(price) {}

  // Getters

  std::string GetTitle() { return title; }

  std::string GetArtist() { return artist; }

  double GetPrice() { return price; }

  // Setters

  void SetTitle(std::string title) { this->title = title; }

  void SettArtist(std::string artist) { this->artist = artist; }

  void SetPrice(double price) { this->price = price; }

  // toString

  void toString() {
    std::cout << "Title: " << title << std::endl
              << "Artist: " << artist << std::endl
              << "Price: " << price;
  }
};

int main() {
  std::string title = "Snowy Arms";
  std::string artist = "YARMC";
  double price = 2.00;
  CD cd(title, artist, price);
  std::cout << cd.GetTitle() << std::endl;
}
