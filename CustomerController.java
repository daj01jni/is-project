

public class CustomerController {
  CustomerRegister customerRegister;
  
  public CustomerController(CustomerRegister customerRegister)
  {
    this.customerRegister = customerRegister;
  }

  public boolean createCustomer(String name, String address, String email) {}

  public boolean deleteCustomer(String nameOrEmail) {}

  public Customer getCustomer(String nameOrEmail) {}

  public String printCustomer(String nameOrEmail) {}

} // end class
