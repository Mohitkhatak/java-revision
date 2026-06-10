package oops2;

public class car extends vehicle {
    void start(){
        super.start();
            System.out.println(this);
            System.out.println(this.model+"is starting");
        } 

    car(){
        System.out.println("car is created");
    }    
    public static void main(String[] args) {

        
        car obj = new car();
        obj.countwheels=5;
        obj.start();
        obj.name="AUDI234";
        obj.model="4847audi";

    }
}
