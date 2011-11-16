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
        Customer customer = new Customer("", "", "");

        System.out.println("Handlez customaorz!");
        System.out.println("New (n), delete (d), list (l)");
        while (!in.equals("q")) {
          in = scan.nextLine();
          if (in.equals("n")) {
            // create new customer
            System.out.println("Enter name");
            String customerName = scan.nextLine();
            // change the fucking name
            customer.setName(customerName);
          } else if (in.equals("d")) {
            // delete customer
          } else if (in.equals("l")) {
            System.out.println(customer.getName());
          } else {
            // something else
          }
        }
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
