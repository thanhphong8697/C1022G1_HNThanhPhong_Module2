package CaseStudy.services.Person.Interface;

import CaseStudy.services.Person.Employee;

public interface IEmployeeService extends IService {
    void deleteEmployee(Employee employee);
    void editEmployee(Employee employee);

}
