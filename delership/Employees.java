
package delership;

import java.util.Scanner;


public class Employees {
    
    
    public void handleCustomer(Customers customer , boolean finance , Vehicles vehicle){
        if (finance==true) {
            boolean history = getCreditHistory( customer , vehicle.getPrice() - customer.cashInHand);
            if (history==true) {
                
                prcocessTransaction(customer , vehicle);
            }
        }else{
            if (customer.cashInHand > vehicle.price) {
                prcocessTransaction(customer , vehicle);
            }else {
                System.out.println("bring more cashmethpd");
            }
    }
       
    }

    public void prcocessTransaction(Customers customer, Vehicles vehicle) {
        System.out.println("the customer name" +customer.name+"\n the customer address"+customer.address
                +"\n purch"+vehicle.getPrice());
        
    }
    public void runCreditHistory(){
        System.out.println("good approved");
    }
    public boolean getCreditHistory(Customers customer , double loanAmount){
        Scanner key=new Scanner(System.in);
        System.out.println("enter salary");
        double salary=key.nextDouble();
        if ( (loanAmount *20)/100<=salary) {
            runCreditHistory();
            
            return true;
        }else{
            System.out.println("bring cash");
            return false;
        }
    }


    
   
}

