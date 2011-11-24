import java.util.*;
public class CustomerReg {
  private Customer customer;
	private HashMap<String, Customer> customers = new HashMap();
	
	
	public CustomerReg(){
	}
	
	public Customer findCustomer(String nbr){
		return customers.get(nbr);
	}
	
	public void addCustomer(Customer customer){
		customers.put(customer.getNbr(), customer);
	}
	
	public void removeCustomer(String nbr){
		customers.remove(nbr);
	}
	
	public Iterator iterator(){
		return customers.values().iterator();
	}

}