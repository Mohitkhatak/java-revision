package oops;

public class mainclass {
    public static void main(String[] args) {
        // dog d1=new dog();
        // d1.name="henry";
        // d1.bark();
        // // d1.walk();

        // dog d2=new dog();
        // d2.name="leo";
        // d2.walk();
        Complex num1 = new Complex();
        num1.a=5;
        num1.b=58;
        num1.print();
    }
    
}
class dog{
    int age;
    String color;
    String name;

    void walk(){
        System.out.println(name+" is walking");
    }

    void bark(){
        System.out.println(name+" is barking");
    }

}

class Complex {
    int a,b;
     
     void print(){
        System.out.println("the complex number is " +a+"+"+b+"i");
     }
}
