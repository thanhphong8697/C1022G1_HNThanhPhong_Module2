package CaseStudy.services.Person.Impl;

import CaseStudy.services.Person.Employee;
import CaseStudy.services.Person.Interface.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    static List<Employee> iEmpSer = new ArrayList<>();

    static {
        iEmpSer.add(new Employee("Nguyễn Hà Anh Quốc", "12/03/2003", "Nam", "123", "123456789", "abc1@gmail.com", 1, "University", "Manager", 500000));
        iEmpSer.add(new Employee("Nguyễn Thanh Tú", "13/03/2003", "Nam", "124", "123456799", "abc2@gmail.com", 2, "Graduate school", "Director", 600000));
        iEmpSer.add(new Employee("Dương Minh Trường", "14/03/2003", "Nam", "125", "123456999", "abc3@gmail.com", 3, "College", "Supervisor", 400000));
        iEmpSer.add(new Employee("Trần Thuận Kỳ", "15/03/2003", "Nữ", "126", "123459999", "abc4@gmail.com", 4, "High school", "Specialist", 300000));
        iEmpSer.add(new Employee("Hoàng Thị Như Quỳnh", "19/03/2003", "Nữ", "127", "123456779", "abc5@gmail.com", 5, "Graduate school", "Receptionist", 200000));
        iEmpSer.add(new Employee("Lê Tá Anh Đào", "16/03/2003", "Nam", "128", "123496799", "abc6@gmail.com", 6, "University", "staff", 200000));
    }


    @Override
    public void deleteEmployee(Employee employee) {
        for (int i = 0; i < iEmpSer.size(); i++) {
            if (iEmpSer.get(i).getEmployeeId() == employee.getEmployeeId()) {
                iEmpSer.remove(i);
                break;
            }
        }
    }

    @Override
    public void editEmployee(Employee employee) {
        for (int i = 0; i < iEmpSer.size(); i++){
            if (iEmpSer.get(i).getEmployeeId() == employee.getEmployeeId()){
                iEmpSer.set(i,employee);
            }
        }
    }


    @Override
    public void display() {
        for (Employee employee : iEmpSer) {
            System.out.println(employee);
        }

    }

    @Override
    public void add(Object object) {
        iEmpSer.add((Employee) object);
    }

    @Override
    public Employee findID(int id) {
        for (Employee employee : iEmpSer) {
            if (employee.getEmployeeId() == id) {
                return employee;
            }
        }
        return null;
    }
}
