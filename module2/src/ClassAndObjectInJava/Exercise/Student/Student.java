package ClassAndObjectInJava.Exercise.Student;

public class Student {
    private String name = "Jonh";
    private String Classes = "C02";

    public Student() {
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        Classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Classes='" + Classes + '\'' +
                '}';
    }
}
