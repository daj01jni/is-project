import java.util.Scanner;
import java.util.ArrayList;

public class TestInput {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String in = "something";
    ArrayList<Customer> customerList = new ArrayList<Customer>();
    ArrayList<Product> productList = new ArrayList<Product>();

    System.out.println("What u want fool?");
    System.out.println("Hantera Kund (c), Produkt (p), Order (o):");

    while (!in.equals("q")) {
      in = scan.nextLine();

      if (in.equals("c")) {

        System.out.println("Handlez customaorz!");
        System.out.println("New (n), delete (d), list (l)");

        while (!in.equals("q")) {
          in = scan.nextLine();
          if (in.equals("n")) {
            // What do we need?
            // Customer(String name, String address, String email)
            String name, address, email;

            // Get info from user
            System.out.println("Enter name");
            name = scan.nextLine();
            System.out.println("Ender address");
            address = scan.nextLine();
            System.out.println("Enter email");
            email = scan.nextLine();

            // Create new customer
            Customer customer = new Customer(name, address, email);

            // Maybe add customer to a list?
            customerList.add(customer);
          } else if (in.equals("d")) {
            // delete customer
          } else if (in.equals("l")) {
            for (Customer customer : customerList) {
              System.out.println(customer.getName());
            }
          } else {
            // something else
          }
        } // end while

      } else if (in.equals("p")) {
        System.out.println("Handlez producxtz!");
        System.out.println("New(n), delete(d), list(l)");

        while (!in.equals("q")) {
          in = scan.nextLine();
          if (in.equals("n")) {
              
            String name;
            int productNbr, price; 
                
            System.out.println("Enter productname");
            name = scan.nextLine();
            System.out.println("Enter productnumber");
            productNbr = scan.nextInt();         
            System.out.println("Enter price");
            price = scan.nextInt();
            
            //Gör ny produkt
            Product product = new Product(name, productNbr, price);
            
            productList.add(product);
          } else if (in.equals("d")) {
            // delete product
          } else if (in.equals("l")) {
              for (Product product : productList) {
                  System.out.println(product.getName());
              }
          } else {
          }
        } // end while
      } else if (in.equals("o")) {
        System.out.println("Handlez ordeaaarz!");
        System.out.println("New(n), delete(d), list(l)");

        while (!in.equals("q")) {
          in = scan.nextLine();
          if (in.equals("n")) {
            System.out.println("Enter order");
          } else if (in.equals("d")) {
          } else if (in.equals("l")) {
          } else {
            System.out.println("RTFM");
          }
        } // end while
      } // end else if
    } // end while
  } // end main
} // end class
