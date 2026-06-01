package arrays;

public class multidimensional {
    public static void main(String[] args) {

//  row  roll no and column is marks of students

// simple way of allocation in two multidimensional array

        // int marks[][]= new int[4][3];
         
        // marks[0][0]=23;
        // marks[0][1]=43;
        // marks[0][2]=73;


        // marks[1][0]=23;
        // marks[1][1]=43;
        // marks[1][2]=73;

        // marks[2][0]=23;
        // marks[2][1]=43;
        // marks[2][2]=73;

        // marks[3][0]=23;
        // marks[3][1]=43;
        // marks[3][2]=73;

        // another way of allocation in multidimensional array

        int stdmarks[][]={
            {54,97,87},
            {64,37,67},
            {94,87,77},
            {82,47,57}
        };
        System.out.println(stdmarks[2][0]);
        System.out.println(stdmarks[2][2]);
        System.out.println(stdmarks[3][1]);
        System.out.println(stdmarks[1][2]);
    }
}
