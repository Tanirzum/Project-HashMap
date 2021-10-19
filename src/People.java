public class People {
    String name;
    String surName;
    int age;

    public People(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
