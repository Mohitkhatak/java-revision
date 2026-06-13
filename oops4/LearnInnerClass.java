package oops4;

public class LearnInnerClass {
    class Toy{
        int price;

    }
    public static void main(String[] args) {
        LearnInnerClass ln =new LearnInnerClass();
        Toy toy= ln.new Toy();
        toy.price=746;
        System.out.println(toy.price);

    }
}
