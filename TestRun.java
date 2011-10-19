import java.util.*;

public class TestRun {
  public static void main(String[] args) {
    Customer customer = new Customer("Namn", "Adress", "Email");

    Product product = new Product("kniv", 666, 50);

    ArrayList<Product> products = new ArrayList<Product>();
    products.add(product);

    Order order = new Order(111, customer, products);
  }
}
