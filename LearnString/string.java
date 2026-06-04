package LearnString;

public class string {
    public static void main(String[] args) {
        // simple way 
        String name="Mohit";
        String samename= "Mohit";

        // using new keyword
        String newname= new String("Mohit khatak");

        System.out.println(name);
        System.out.println(newname);

        // direct  way

        System.out.println("Mohit khatak");

        // if (name==samename) {
        //     System.out.println("both string are same"); 
        // }


        // if (name==newname) {
        //     System.out.println("both string are same");
            
        // }
        // else{
        //     System.out.println("both stirng are not same");
        // }.


        // Equals case

        if(name.equals(samename)){
            System.out.println("new and new name has same values");
        }else{
            System.out.println("name and new name are not same");
        }

    }
}
