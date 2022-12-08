package ClassAndObjectInJava.Exercise.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Henry");
        student1.setClasses("C03");
        System.out.println(student1.toString());
    }
}
