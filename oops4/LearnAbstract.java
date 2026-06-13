package oops4;

public class LearnAbstract {
    public static void main(String[] args) {
        // vehicle veh=new vehicle(); 
        // we cannot make objects of an abstract class but we
        // can make method
        car c1= new car();
        c1.accelrate();
        c1.breakes(8);

    }

}

abstract class vehicle {
    abstract void accelrate();

    abstract int breakes(int wheels);
     // abstract class methods doesnt have body
} 
class car extends vehicle{

    @Override
    void accelrate() {
        System.out.println("car is accelrate");
        // TODO Auto-generated method stub
        }
    @Override
    int breakes( int wheels) {
        System.out.println("car breakes pushed");
        return wheels;
        // TODO Auto-generated method stub
        
    }
    
}
