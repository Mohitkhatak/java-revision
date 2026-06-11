package oops3.package2;

import oops3.teacher;

public class mainclass2 extends teacher {
    public static void main(String[] args) {
        teacher obj=new teacher();
        obj.teachingclass=78;
        // obj.Degree="phd";// cant be access bcs it is default
        mainclass2 mainclass2=new mainclass2();
        mainclass2.studentCount=47;// it can access the protected class as it extends the teacher class from another package
        

    }
}
