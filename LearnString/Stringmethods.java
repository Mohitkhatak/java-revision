package LearnString;

public class Stringmethods {
    public static void main(String[] args) {
        String name="     MoHit4587             ";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name.trim());
        // trim is use to remove extra space

        System.out.println("blinkit".startsWith("bl"));
        System.out.println("blinkit".endsWith("bl"));

        System.out.println("Mohitkkhtatak".charAt(6));
        // use to know which number have which latter

        int age =574;
        String Stringage = String.valueOf(age);
        System.out.println(age+2);   //576
        System.out.println(Stringage+2);// 5742

        String sentence="I like java and like to play programming in java ";
        String Strnigsentence=sentence.replace("like", "love");//use to replace words in string sentence
        System.out.println(sentence);
        System.out.println(Strnigsentence);
        System.out.println(sentence.contains("Mohit"));

        String subString=sentence.substring(5,15);
        System.out.println(subString);  //use to cut the string in the middle



    }

}
