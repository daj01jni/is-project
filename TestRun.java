import java.util.*;

public class TestRun {
  public static void main(String[] args) {
    Customer customer = new Customer("Namn", "Adress", "Email");


    Order order = new Order(111, customer, product, 10);
    
    customer.setName("Jakob");
    System.out.println(customer.getName());
    System.out.println(product.getName());
    System.out.println(order.toString());

    Product product = new Product("kniv", 666, 50);
  }
}
