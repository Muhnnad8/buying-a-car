
package delership;


public class Delership {

    
    public static void main(String[] args) {
        Vehicles h1 = new Vehicles();
        h1.make = "Toyota";
        h1.model = "Corolla";
        h1.color = "Black";
        h1.price = 40000;
        Employees e1= new Employees();
        
        Customers cust1 = new Customers();
        cust1.name = "Muhannad";
        cust1.address = "Makkah";
        cust1.cashInHand = 10000;
        cust1.purchaseCar(h1, e1, true);
    }
    
}
