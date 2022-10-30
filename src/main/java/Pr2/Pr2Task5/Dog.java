package Pr2.Pr2Task5;

public class Dog {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String  toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' + ", humanization of age=" + dogHumanization() +
                '}';
    }

    public int dogHumanization(){
        return this.age * 7;
    }
}
