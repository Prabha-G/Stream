package pack;


import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters (if needed)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class JavaExample {
    public static void main(String[] args) {
        List<Student> li = new ArrayList<Student>();

        li.add(new Student(11, "ramesh"));
        li.add(new Student(12, "ravi"));
        li.add(new Student(13, "rajesh"));

        // 1st way
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }

        // 2nd way
        for (Student s : li) {
            System.out.println(s);
        }

        // 3rd way
        li.forEach(s -> System.out.println(s));
    }
}
