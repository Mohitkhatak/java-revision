package oops3;

public class teacher {
    public int teachingclass;
     private int id;
    String Degree;//default or package private  and can be acces into same package not in another package
    protected int studentCount;


     public static void main(String[] args) {
       teacher obj =new teacher();
        obj.teachingclass=22;
        obj.id=586;
     }
}
