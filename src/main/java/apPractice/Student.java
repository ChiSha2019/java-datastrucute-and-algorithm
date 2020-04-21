package apPractice;

public class Student {
    int id;
    String name ;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayName(){
        System.out.println(name);
    }
}
