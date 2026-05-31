package arrays;

public class problemOnArray {
    public static void main(String[] args) {
        int numbers[]={12,5,8152,512,54,68,8,1,6,7,9,565,};

        // For the sum of array
        int sum=0;
        
        for (int number : numbers) {
            sum+=number;   
        }
         System.out.println("sum is "+ sum);


        //  For the minimum number from the array



        int min=Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < min) {
                min = number; 
            }  
        }
        System.out.println("minimum number is " + min);

        //  For the Maximum number from the array
         int max=Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > min) {
                max = number; 
            }  
        }
        System.out.println("minimum number is " + max);


    }
}
