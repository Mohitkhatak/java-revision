package oops;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greeting();
        obj.greeting("Mohit");
    }
}

class Greet{
    void greeting(){
        System.out.println("Hello good morning");
    }

    void greeting(String name){
        System.out.println( name + " Good morning");
    }
}
