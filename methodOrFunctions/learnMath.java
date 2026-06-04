package methodOrFunctions;

public class learnMath {
    public static void main(String[] args) {
        int a=3 ;
    
        int b=-9;

        System.out.println(Math.min(a, b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.abs(b));
        // 3 power  8
        System.out.println(Math.pow(3,8));
        // use to get random number bw 1 to 7
        System.out.println(randomNumber());
        System.out.println(Math.floor(5.7));
        System.out.println(Math.ceil(7.8));
        System.out.println(Math.round(7.8));
        System.out.println(Math.round(7.4   ));


       

    }
     public static double randomNumber(){
        return Math.random()*7+1;
            
        }
}
