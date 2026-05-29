import java.util.Scanner;
public class userInputScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age: ");
        int age =sc.nextInt();
        
        System.out.println("your age is "+ age);
        if (age<18)
            System.out.println("you are a younger ");
        else
            System.out.println("you are mature");

        
    }
}
