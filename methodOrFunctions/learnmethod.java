package methodOrFunctions;

public class learnmethod {
    public static void main(String[] args) {
        greet();
        average(8, 7);
    }
    static void greet(){
        System.out.println("hello world");
    }
    public static void average(int a , int b){
      double avg=(a+b)/2;

      System.out.println("average is "+ avg);
    }
}
