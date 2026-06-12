package oops3.package2;

public class person {
    private int age;
    private String name;
    boolean canbeChange = true;

    public void setAge(int age) {
        if (canbeChange) {
            if (age > 0) {
                this.age = age;

            }

        }

    }

    public int getAge() {
        return age;
    }

}
