package LearnString;

import java.util.Scanner;

public class learnstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// way to take string input via user
        System.out.println("Enter your first name");
        String firstName=sc.nextLine();
       

        System.out.println("Enter your Last name");
        String LastName=sc.next();
        // sc.next() use to take only first word of any line where sc.nextline() use to take full line 


        System.out.println("your Full name is "+firstName+" "+LastName);

    }
}
