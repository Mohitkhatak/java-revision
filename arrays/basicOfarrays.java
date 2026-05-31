package arrays;

public class basicOfarrays {
    public static void main(String[] args) {
    //     int age[];
    //     age = new int[20]; 
    // System.out.print(age);
    // int age[]= new int[5];
     

    // age[0]=9;
    // age[1]=7;
    // age[2]=5;
    // System.out.println(age[2]);
    // System.out.println(age[1]);
    // System.out.println(age[0]);
    // System.out.println(age.length);


    // int age[]={5,78,94,67,25,34,749,65,5,58};
    
    // System.out.println(age[5]);
    // System.out.println(age[9]);
    // System.out.println(age.length);
    String names[]={"mohit","khushi","chahat","aakash","anurag"};

    // System.out.println(names.length);
    // System.out.println(names[4]);
    for (int i = 0; i < names.length; i++) {
        System.out.println("name of student "+names[i]); 

    


        
    }for (String name : names) {
        System.out.println("for each "  + name);
            
    }

    }
}       
