package oops4;

import oops.mainclass;

public class LearnInterface {
    public static void main(String[] args) {
         Monkey m1 =new Monkey();
         m1.eats();
         m1.run();
         m1.sing();
         m1.drink();
    
    }
   // in an interface a single class can implements  the multiple interface togather

}
interface pet{
    void sing();
    void drink();
}
interface Animals{
    void eats();
    void run();
     void drink();
}



class Monkey implements Animals,pet{

    @Override
    public void eats() {
        System.out.println("monkey is eating");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void run() {
        System.out.println("monkey is running");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void sing() {
        System.out.println("monkey can sing");
        // TODO Auto-generated method stub
        
    }
    public void drink(){
        System.out.println("monkey can drink");
    }

}

