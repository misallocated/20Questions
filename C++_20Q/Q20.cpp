#include <iostream>
#include <vector>

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

class Playlist {
private:
  std::vector<CD> items;
  int nextFreeItem;
  int size;

public:
  Playlist(int size) {
    this->size = size;
    items.reserve(size);
  }

  void addCD(std::string title, std::string artist, int price) {
    items.push_back(CD(title, artist, price));
  }

  std::string toString() {

    std::string information;

    for (int i = 0; i < size; i++) {
      information += "Artist: " + items[i].GetArtist() + "\n";
      information += "Title:  " + items[i].GetTitle() + "\n";
    }

    return information;
  }

  int totalPrice() {

    int totalPrice;

    for (int i = 0; i < size; i++) {
      totalPrice += items[i].GetPrice();
    }

    return totalPrice;
  }
};

int main() {
  Playlist play(2);
  play.addCD("Snowy Arms", "YAAMC", 4);
  play.addCD("Illionios/Metamorphisis", "YAAMC", 5);
  play.addCD("Snowy Arms", "YAAMC", 4);
  std::cout << play.toString() << std::endl;
}
