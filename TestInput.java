import java.util.Scanner;

public class TestInput {
  String choice;
  Scanner reader;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String in = "something";

    System.out.println("What u want fool?");
    System.out.println("Hantera Kund (c), Produkt (p), Order (o):");

    while (!in.equals("q")) {
      in = scan.nextLine();

      if (in.equals("c")) {
        System.out.println("Handlez customaorz!");
      } else if (in.equals("p")) {
        System.out.println("Handlez producxtz!");
      } else if (in.equals("o")) {
        System.out.println("Handlez ordeaaarz!");
      } else {
        System.out.println("RTFM");
      }
    }
  }
}
