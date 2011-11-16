import java.util.*;

public class Order {
  int orderNbr;
  Customer customer;
  Product product;
  String orderString;
  int amount;
  int totalPrice;

  public Order(int orderNbr, Customer customer, Product product, int amount) {
    this.orderNbr = orderNbr;
    this.customer = customer;
    this.product = product;
    this.amount = amount;
  }
  
  public int getOrderNbr() {
    return orderNbr;
  }
  
  public void setOrderNbr(int orderNbr) {
	this.orderNbr = orderNbr;
  }
 
  public Customer getCustomer() {
	  return customer;
  }
  
  public void setCustomer(Customer customer) {
	  this.customer = customer;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
	  this.product = product;
  }

  private int getTotalPrice() {
    return product.getPrice() * amount;
  }

  public String toString() {
    orderString = "Order number: " + orderNbr + "\n" +
                  "Customer: " + customer.getName() + "\n" +
                  "Product: " + product.getName() + "\n" +
                  "Product price: " + product.getPrice() + "\n" +
                  "Amount: " + amount + "\n" +
                  "Total price: " + getTotalPrice();
    return orderString;
  }
}
