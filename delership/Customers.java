
package delership;


public class Customers {
    String name;
    String address;
    double cashInHand;
    
    
    
    public void purchaseCar(Vehicles vehicle, Employees employee, boolean finance){
        employee.handleCustomer(this, finance, vehicle);
        
    }

    
    }
    
    

