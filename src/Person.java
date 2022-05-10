public class Person {

    private String name;
    private int age;

    public Person(String name_, int age_){

        this.name = name_;
        this.age = age_;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "(" + this.name + ", " + this.age + ")";
    }

    public String work(){
        return "None";
    }
}

