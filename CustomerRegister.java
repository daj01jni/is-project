import java.util.*;

public class CustomerRegister {
	private HashMap<String, Customer> customers;
	
	public CustomerRegister() {
    this.customers = new HashMap<String, Customer>();
	}
	
	public Customer getCustomer(String name){
		return customers.get(name);
	}

  public boolean hasCustomer(String name)
  {
    return customers.containsKey(name);
  }
	
	public void add(Customer customer){
		customers.put(customer.getName(), customer);
	}

  public void remove (String name) 
  {
    if ( customers.containsKey(name) )
    {
      customers.remove(name);
    }
  }
	
	public Iterator iterator(){
		return customers.values().iterator();
	}

}
