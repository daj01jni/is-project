public class Customer {
  String name, address, email;

  public Customer(String name, String address, String email) {
    this.name = name;
    this.address = address;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public String getAdress() {
  return adress;
  }
  
  public void setAdress(String adress) {
  this.adress = adress;
  }
  
  public String getEmail() {
  return email;
  }
  
  public void set setEmail(String email) {
  this.email = email;
  }
}