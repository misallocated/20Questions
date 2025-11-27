//Question 19
public class CD {
  private String title;
  private String artist;
  private double price;

  CD(String title, String artist, double price) {
    this.title = title;
    this.artist = artist;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public double getPrice() {
    return price;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String toString() {
    return "Title: " + title + ", Artist: " + artist + ", Price: " + price;
  }

}

// Question 20
public class Playlist {
  private CD[] cds;
  private int nextFreeItem = 0;

  Playlist(int size) {
    this.cds = new CD[size];
  }

  public void addCD(String title, String artist, double price) {
    cds[nextFreeItem] = new CD(title, artist, price);
    nextFreeItem++;
  }

  public String toString() {

    String songs = "";

    for (int i = 0; i < nextFreeItem; i++) {
      songs += "Artist: " + cds[i].getArtist() + ", Title: " + cds[i].getTitle() + ", Price: " + cds[i].getPrice()
          + "\n";
    }

    return songs;
  }

  public double totalPrice() {
    double sum = 0;

    for (int i = 0; i < nextFreeItem; i++) {
      sum += cds[i].getPrice();
    }

    return sum;
  }

}

public class Q19_20 {
  public static void main(String[] args) {
    Playlist cds = new Playlist(2);
    cds.addCD("Katy Song", "Red House Painters", 10.99);
    cds.addCD("Smokey", "Red House Painters", 10.99);
    System.out.println(cds.toString());
  }
}
