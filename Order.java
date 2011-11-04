import java.util.*;

public class Order {
  int orderNbr;
  Customer customer;
  ArrayList<Product> products;

  public Order(int orderNbr, Customer customer, ArrayList<Product> products) {
    this.orderNbr = orderNbr;
    this.customer = customer;
    this.products = products;
  }
  
  public int getorderNbr() {
  return orderNbr;
  }
  
  public void setorderNbr(int orderNbr) {
	this.orderNbr = orderNbr;
  }
 
 // Lite osäker på hur jag ska hantera Cutstomer klassen här i "Order"
  public class customer getCustomer() {
	return Customer
  }
  
  public void setCustomer (customer) {
	this.customer = customer;
  }
  
 // Samma här med arraylisten som hanterar products
  public ArrayList<Product> getProduct() {
	return Product;
  }
  
  public void setProduct(products) {
	this.products = products
  }
}

/*
public class Order {
  private String OrderNr;
  private String OrderDestination;
  private String OrderDatum;
  private String OrderProdukt;

  public Order(String nyttOrderNr, String nyttOrderDestination, String nyttOrderDatum, String OrderProdukt) {
      sättOrderNr (nyttOrderNr);
      sättOrderDestination (nyttOrderDestination);
      sättOrderDatum (nyttOrderDatum);
      sättOrderProdukt (nyttOrderProdukt);
  }
  public void sättOrderNr (String nyttOrderNr) {
      OrderNr = nyttOrderNr;
  }
  public String avläsOrderNr () {
      return OrderNr;
  }
  public void sättOrderDestination (String nyttOrderDestination) {
      OrderDestination = nyttOrderDestination;
  }
  public String avläsOrderDestination () {
      return OrderDestination;
  }
  public void sättOrderDatum (String nyttOrderDatum) {
      OrderDatum = nyttOrderDatum;
  }
  public String avläsOrderDatum () {
      return OrderDatum;
  }
  public void sättOrderProdukt (String nyttOrderProdukt) {
      OrderProdukt = nyttOrderProdukt;
  }
  public String avläsOrderProdukt () {
      return OrderProdukt;
  }
}
*/
