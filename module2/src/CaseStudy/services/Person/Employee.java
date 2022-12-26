package CaseStudy.services.Person;

public class Employee extends Person{
    private int employeeId;
    private String academyLevel;
    private String posion;
    private int salary;

    public Employee() {
    }
    public Employee(String fullName, String birthday, String gender, String identityNUmb, String phoneNumb, String email, int employeeId, String academyLevel, String posion, int salary) {
        super(fullName, birthday, gender, identityNUmb, phoneNumb, email);
        employeeId = employeeId;
        this.academyLevel = academyLevel;
        this.posion = posion;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        employeeId = employeeId;
    }

    public String getAcademyLevel() {
        return academyLevel;
    }

    public void setAcademyLevel(String academyLevel) {
        this.academyLevel = academyLevel;
    }

    public String getPosion() {
        return posion;
    }

    public void setPosion(String posion) {
        this.posion = posion;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + employeeId +
                ", academyLevel='" + academyLevel + '\'' +
                ", posion='" + posion + '\'' +
                ", salary=" + salary +
                ", fullName='" + fullName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", identityNUmb=" + identityNUmb +
                ", phoneNumb='" + phoneNumb + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
