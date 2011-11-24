import java.util.*;
public class ProductReg {
  private Product product;
private HashMap<String, Product> products = new HashMap();


public ProductReg(){
}

public Product findProduct(String name){
return products.get(name);
}

public void addProduct(Product product){
products.put(product.getname(), product);  //getname(), är fel! wai?
}

public void removeProduct(String name){
products.remove(name);
}

public Iterator iterator(){
return products.values().iterator();
}

}