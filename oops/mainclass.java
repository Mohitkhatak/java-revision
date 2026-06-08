package oops;

public class mainclass {
    public static void main(String[] args) {
        dog d1=new dog();
        d1.name="henry";
        d1.bark();
        // d1.walk();

        dog d2=new dog();
        d2.name="leo";
        d2.walk();
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
