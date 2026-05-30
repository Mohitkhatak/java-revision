public class ifElse {
    public static void main(String[] args) {
        int a=32;
        int b=7;
        int c=95;
        int max=0;
        // if(a>b){
        //     System.out.println("a is bigger than b");
        //     if (a>c) {
        //         System.out.println("a is also bigger than c");
                
        //     }
        //     else
        //         System.out.println("c is bigger than a");
        // }
        // else 
        //     System.out.println("b is bigger than a");

        max=a > b ? a > c ? a : c : b > c ? b : c;

        System.out.println("value of max"+ max);
        
    }
}
