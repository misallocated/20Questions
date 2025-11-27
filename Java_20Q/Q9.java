import java.util.Scanner;
import java.io.*;

public class Q9 {
  public static void main(String[] args) throws IOException {

    Scanner num = new Scanner(new FileReader("integers.txt"));
    int numOfLines = 0;

    while (num.hasNextLine()) {
      numOfLines++;
      num.nextLine();
    }

    num.close();

    Scanner in = new Scanner(new FileReader("integers.txt"));
    int[] integers = new int[numOfLines];

    int index = 0;

    while (in.hasNextLine()) {
      integers[index] = Integer.parseInt(in.nextLine());
      index++;
    }

    in.close();

    // Sum

    int sum = 0;

    for (int i = 0; i < numOfLines; i++) {
      sum += integers[i];
    }

    System.out.println("The Sum: " + sum);

    // Mean
    int mean = sum / numOfLines;

    System.out.println("The Mean: " + mean);

    // Median
    int median_index = numOfLines / 2;
    int median = integers[median_index];

    System.out.println("The Median Value: " + median);

    // Lower Quartile

    System.out.println("-----Lower Quartile-----");

    for (int i = 0; i < median_index; i++) {
      if (i != median_index)
        System.out.println(integers[i]);
    }

    // Upper Quartile

    System.out.println("-----Upper Quartile-----");

    for (int i = median_index; i < numOfLines; i++) {
      if (i != median_index)
        System.out.println(integers[i]);
    }

    // Appears Again

    System.out.println("-----Appears Twice-------");

    for (int i = 0; i < numOfLines; i++) {
      for (int j = i + 1; j < numOfLines; j++) {
        if (integers[i] == integers[j])
          System.out.println("The Number: " + integers[i] + " was found twice!");
      }
    }
  }
}
