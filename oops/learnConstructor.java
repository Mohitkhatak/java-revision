package oops;

public class learnConstructor {
    public static void main(String[] args) {
        Complex num1=new Complex(2,7);
        Complex num2=new Complex(4,8);
        
        num1.print();
         
        num2.print();
    }
}
class Complex {
    int a,b;

    // public Complex(){
    //     a=5;
    //     b=87;
    //     System.out.println("creating a new objects");
    // }
    public Complex(int real, int imaginary){
        a=real;
        b=imaginary;


    }

    
     void print(){
        System.out.println("the complex number is " +a+"+"+b+"i");
     }
}