public class Product {
  String name;
  int productNbr;
  int price;

  public Product(String name, int productNbr, int price) {
    this.name = name;
    this.productNbr = productNbr;
    this.price = price;
  }
 
 public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public int getproductNbr() {
  return productNbr;
  }
  
  public void setproductNbr(int productNbr) {
	this.productNbr = productNbr;
  }
  
  public int getPrice() {
	return price;
  }
  
  piblic void setPrice(int price) {
	this.price = price;
  }
}
