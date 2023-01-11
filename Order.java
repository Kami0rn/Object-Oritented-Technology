package week05.lab.lab2;

public class Order {
    Customer customer = new Customer();
    Food[] food = new Food[10];
    int count = 0;
    double sum = 0 ;
    public Order(){
    }

    public Order(Customer c){
        customer = c ;
    }

    public void cart(Food f){
        food[count] = f ;
        System.out.printf("%s ordered %s: %.1f Bath\n",customer.getCname(),f.getFname(),f.getPrice());
        sum += f.getPrice();
        count++;
    }

    public double getDiscount(){
        if(customer.getCtype().equals("Diamond")){
            return sum*0.2;
        }
        else if(customer.getCtype().equals("Gold")){
            return sum*0.1;
        }
        else if(customer.getCtype().equals("Student")){
            if(sum*0.3>300){
                return 300.0;
            }
            else{
                return sum*0.3;
            }
        }
        return 0;
    }

    public double getTotalPrice(){
        return sum-getDiscount();
    }
}
