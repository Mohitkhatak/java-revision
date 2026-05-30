package loops;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //  for (int i = 0; i <20; i++) {
            // System.out.println("Hello world");
            
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter number for the desreving table:-");
         int n=sc.nextInt();
          
         for (int i = 1; i <=10; i++) {
            System.out.println(i*n);
            
         }

    }
}
