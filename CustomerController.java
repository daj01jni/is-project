

public class CustomerController {
  CustomerRegister customerRegister;
  
  public CustomerController(CustomerRegister customerRegister)
  {
    this.customerRegister = customerRegister;
  }

  public boolean createCustomer(String name, String address, String email) 
  {
    Customer customer = new Customer(name, address, email);
    customerRegister.add(customer);
    return true;
  }

  public boolean deleteCustomer(String name) 
  {
    if ( customerRegister.hasCustomer(name) )
    {
      customerRegister.remove(name);
      return true;
    } else {
      return false;
    }
  }

  public String printCustomer(String name) 
  {
    if ( customerRegister.hasCustomer(name) )
    {
      Customer customer = customerRegister.getCustomer(name);
      String customerString = customer.getEmail();
      return customerString;
    } else {
      return "";
    }
  }

} // end class
