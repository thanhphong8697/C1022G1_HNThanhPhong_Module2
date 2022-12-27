package CaseStudy.controllers;

import CaseStudy.repository.Impl.FacilityServiceImpl;
import CaseStudy.repository.Interface.IFacilityService;
import CaseStudy.services.Facility.Facility;
import CaseStudy.services.Facility.Room;
import CaseStudy.services.Facility.Villa;
import CaseStudy.services.Person.Customer;
import CaseStudy.services.Person.Employee;
import CaseStudy.repository.Impl.CustomerServiceImpl;
import CaseStudy.repository.Impl.EmployeeServiceImpl;
import CaseStudy.repository.Interface.ICustomerService;
import CaseStudy.repository.Interface.IEmployeeService;

import java.util.Map;
import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(
                    "Your choice \n" +
                            "1. Employee Management. \n" +
                            "2. Customer Management. \n" +
                            "3. Facility Management. \n" +
                            "4. Booking Management. \n" +
                            "5. Promotion Management. " +
                            "\n" +
                            "6. Exit.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    /**
                     * MENU EMPLOYEE
                     */
                    IEmployeeService iEmpSer = new EmployeeServiceImpl();
                    int choiceOne;
                    do {
                        System.out.println("Your option employees \n" +
                                "1. Display list employees. \n" +
                                "2. Add new employee. \n" +
                                "3. Delete employee. \n" +
                                "4. Edit employee. \n" +
                                "5. Return main menu");
                        choiceOne = Integer.parseInt(scanner.nextLine());
                        switch (choiceOne) {
                            case 1:
                                iEmpSer.display();
                                break;
                            case 2:
                                System.out.println("Nhập tên");
                                String employeeName = scanner.nextLine();
                                System.out.println("Nhập ngày sinh");
                                String employeeBirthday = scanner.nextLine();
                                System.out.println("Nhập giới tính");
                                String employeeGender = scanner.nextLine();
                                System.out.println("Nhập CMND");
                                String employeeIdentityNumb = scanner.nextLine();
                                System.out.println("Nhập SĐT");
                                String employeePhoneNumb = scanner.nextLine();
                                System.out.println("Nhập mail");
                                String employeeEmail = scanner.nextLine();
                                System.out.println("Nhập id");
                                int employeeId = Integer.parseInt(scanner.nextLine());
                                System.out.println("Nhập trình độ");
                                String employeeAcademyLevel = scanner.nextLine();
                                System.out.println("Nhập chức vụ");
                                String employeePosion = scanner.nextLine();
                                System.out.println("Nhập lương");
                                int employeeSalary = Integer.parseInt(scanner.nextLine());
                                Employee employee = new Employee(employeeName, employeeBirthday,
                                        employeeGender, employeeIdentityNumb, employeePhoneNumb, employeeEmail,
                                        employeeId, employeeAcademyLevel, employeePosion, employeeSalary);
                                iEmpSer.add(employee);
                                break;
                            case 3:
                                System.out.println("Nhập id để kiểm tra");
                                int idToCheckEmpDelete = Integer.parseInt(scanner.nextLine());
                                Employee employee1 = (Employee) iEmpSer.findID(idToCheckEmpDelete);
                                if (employee1 != null) {
                                    iEmpSer.deleteEmployee(employee1);
                                }
                                break;
                            case 4:
                                System.out.println("Nhập id để kiểm tra");
                                int idToCheckEmpEdit = Integer.parseInt(scanner.nextLine());
                                Employee employee2 = (Employee) iEmpSer.findID(idToCheckEmpEdit);
                                if (employee2 != null) {
                                    int yourChoiceEmp;
                                    do {
                                        System.out.println(
                                                "Your choice: \n" +
                                                        "1. Cập nhật lại tên. \n" +
                                                        "2. Cập nhật lại ngày sinh. \n" +
                                                        "3. Cập nhật lại giới tính. \n" +
                                                        "4. Cập nhật lại CMND. \n" +
                                                        "5. Cập nhật lại SĐT. \n" +
                                                        "6. Cập nhật lại Email. \n" +
                                                        "7. Cập nhật lại trình độ. \n" +
                                                        "8. Cập nhật lại chức vụ. \n" +
                                                        "9. Cập nhật lại lương. \n" +
                                                        "10. quay lại menu nhân viên");
                                        switch (yourChoiceEmp = Integer.parseInt(scanner.nextLine())) {
                                            case 1:
                                                System.out.println("Nhập tên");
                                                String employeeNewName = scanner.nextLine();
                                                employee2.setFullName(employeeNewName);
                                                break;
                                            case 2:
                                                System.out.println("Nhập ngày sinh");
                                                String employeeNewBirthday = scanner.nextLine();
                                                employee2.setBirthday(employeeNewBirthday);
                                                break;
                                            case 3:
                                                System.out.println("Nhập giới tính");
                                                String employeeNewGender = scanner.nextLine();
                                                employee2.setGender(employeeNewGender);
                                                break;
                                            case 4:
                                                System.out.println("Nhập CMND");
                                                String employeeNewIdentityNumb = scanner.nextLine();
                                                employee2.setIdentityNUmb(employeeNewIdentityNumb);
                                                break;
                                            case 5:
                                                System.out.println("Nhập SĐT");
                                                String employeeNewPhoneNumb = scanner.nextLine();
                                                employee2.setPhoneNumb(employeeNewPhoneNumb);
                                                break;
                                            case 6:
                                                System.out.println("Nhập mail");
                                                String employeeNewEmail = scanner.nextLine();
                                                employee2.setEmail(employeeNewEmail);
                                                break;
                                            case 7:
                                                System.out.println("Nhập trình độ");
                                                String employeeNewAcademyLevel = scanner.nextLine();
                                                employee2.setAcademyLevel(employeeNewAcademyLevel);
                                                break;
                                            case 8:
                                                System.out.println("Nhập chức vụ");
                                                String employeeNewPosion = scanner.nextLine();
                                                employee2.setPosion(employeeNewPosion);
                                                break;
                                            case 9:
                                                System.out.println("Nhập lương");
                                                int employeeNewSalary = Integer.parseInt(scanner.nextLine());
                                                employee2.setSalary(employeeNewSalary);
                                                break;
                                        }
                                    } while (yourChoiceEmp != 10);
                                    iEmpSer.editEmployee(employee2);
                                } else {
                                    System.out.println("id nhân viên không tồn tại");
                                }
                                break;
                        }
                    } while (choiceOne != 5);
                    break;
                case 2:
                    /**
                     *  MENU CUSTOMER
                     */
                    ICustomerService iCustomerSer = new CustomerServiceImpl();
                    int choiceTwo;
                    do {
                        System.out.println("Your option customers \n" +
                                "1. Display list customer. \n" +
                                "2. Add new customer. \n" +
                                "3. Edit customer. \n" +
                                "4. Return main menu");
                        choiceTwo = Integer.parseInt(scanner.nextLine());
                        switch (choiceTwo) {
                            case 1:
                                iCustomerSer.display();
                                break;
                            case 2:
                                System.out.println("Nhập tên");
                                String customerName = scanner.nextLine();
                                System.out.println("Nhập ngày sinh");
                                String customerBirthday = scanner.nextLine();
                                System.out.println("Nhập giới tính");
                                String customerGender = scanner.nextLine();
                                System.out.println("Nhập CMND");
                                String customerIdentityNumb = scanner.nextLine();
                                System.out.println("Nhập SĐT");
                                String customerPhoneNumb = scanner.nextLine();
                                System.out.println("Nhập mail");
                                String customerEmail = scanner.nextLine();
                                System.out.println("Nhập id");
                                int customerId = Integer.parseInt(scanner.nextLine());
                                System.out.println("Nhập hạn mức khách hàng");
                                String customerType = scanner.nextLine();
                                System.out.println("Nhập địa chỉ");
                                String customerAddress = scanner.nextLine();
                                Customer customer = new Customer(customerName, customerBirthday, customerGender,
                                        customerIdentityNumb, customerPhoneNumb, customerEmail, customerId, customerType,
                                        customerAddress);
                                iCustomerSer.add(customer);
                                break;
                            case 3:
                                System.out.println("Nhập id để kiểm tra");
                                int idToCheckCusEdit = Integer.parseInt(scanner.nextLine());
                                Customer customer1 = (Customer) iCustomerSer.findID(idToCheckCusEdit);
                                if (customer1 != null) {
                                    int yourChoiceCus;
                                    do {
                                        System.out.println(
                                                "Your choice: \n" +
                                                        "1. Cập nhật lại tên khách hàng. \n" +
                                                        "2. Cập nhật lại ngày sinh kh. \n" +
                                                        "3. Cập nhật lại giới tính kh. \n" +
                                                        "4. Cập nhật lại CMND kh. \n" +
                                                        "5. Cập nhật lại SĐT kh. \n" +
                                                        "6. Cập nhật lại Email kh. \n" +
                                                        "7. Cập nhật lại hạn mức kh. \n" +
                                                        "8. Cập nhật lại địa chỉ kh. \n" +
                                                        "9. quay lại menu kh");
                                        switch (yourChoiceCus = Integer.parseInt(scanner.nextLine())) {
                                            case 1:
                                                System.out.println("Nhập tên kh");
                                                String customerNewName = scanner.nextLine();
                                                customer1.setFullName(customerNewName);
                                                break;
                                            case 2:
                                                System.out.println("Nhập ngày sinh kh");
                                                String customerNewBirthday = scanner.nextLine();
                                                customer1.setBirthday(customerNewBirthday);
                                                break;
                                            case 3:
                                                System.out.println("Nhập giới tính kh");
                                                String customerNewGender = scanner.nextLine();
                                                customer1.setGender(customerNewGender);
                                                break;
                                            case 4:
                                                System.out.println("Nhập CMND kh");
                                                String customerNewIdentityNumb = scanner.nextLine();
                                                customer1.setIdentityNUmb(customerNewIdentityNumb);
                                                break;
                                            case 5:
                                                System.out.println("Nhập SĐT kh");
                                                String customerNewPhoneNumb = scanner.nextLine();
                                                customer1.setPhoneNumb(customerNewPhoneNumb);
                                                break;
                                            case 6:
                                                System.out.println("Nhập mail kh");
                                                String customerNewEmail = scanner.nextLine();
                                                customer1.setEmail(customerNewEmail);
                                                break;
                                            case 7:
                                                System.out.println("Nhập hạn mức kh");
                                                String customerNewType = scanner.nextLine();
                                                customer1.setCustomerType(customerNewType);
                                                break;
                                            case 8:
                                                System.out.println("Nhập địa chỉ kh");
                                                String customerNewAddress = scanner.nextLine();
                                                customer1.setAddress(customerNewAddress);
                                                break;
                                        }
                                    } while (yourChoiceCus != 9);
                                    iCustomerSer.editCustomer(customer1);
                                } else {
                                    System.out.println("id kh không tồn tại");
                                }
                                break;
                        }
                    } while (choiceTwo != 4);
                    break;
                case 3:
                    /**
                     *  MENU FACILITY
                     */
                    IFacilityService iFacilitySer = new FacilityServiceImpl();
                    int choiceThree;
                    do {
                        System.out.println(
                                "Your option facility \n" +
                                        "1. Display list facility. \n" +
                                        "2. Add new facility. \n" +
                                        "3. Display list facility maintenance. \n" +
                                        "4. Return main menu");
                        choiceThree = Integer.parseInt(scanner.nextLine());
                        switch (choiceThree) {
                            case 1:
                                iFacilitySer.display();
                                break;
                            case 2:
                                int choiceAddFacility;
                                do {
                                    System.out.println(
                                            "Your choice \n" +
                                                    "1. Add Room \n" +
                                                    "2. Add Villa \n" +
                                                    "3. Return facility menu");
                                    switch (choiceAddFacility = Integer.parseInt(scanner.nextLine())){
                                        case 1:
                                            System.out.println("Nhập tên phòng");
                                            String serviceName = scanner.nextLine();
                                            System.out.println("Nhập diện tích phòng");
                                            double usableArea = Integer.parseInt(scanner.nextLine());
                                            System.out.println("Nhập chi phí thuê");
                                            int rentalCost = Integer.parseInt(scanner.nextLine());
                                            System.out.println("Nhập số người tối đa");
                                            int maxiumNumbOfPeople = Integer.parseInt(scanner.nextLine());
                                            System.out.println("Kiểu thuê");
                                            String rentalType = scanner.nextLine();
                                            System.out.println("Nhập mã phòng");
                                            String serviceCode = scanner.nextLine();
                                            System.out.println("Nhập dịch vụ cung cấp miễn phí");
                                            String freeServiceIncluded = scanner.nextLine();
                                            Room room = new Room(serviceName,usableArea,
                                                    rentalCost,maxiumNumbOfPeople,rentalType,
                                                    serviceCode,freeServiceIncluded);
                                            iFacilitySer.add(room);
                                            break;
                                        case 2:
                                            System.out.println("Nhập tên phòng");
                                            String serviceNameVilla = scanner.nextLine();
                                            System.out.println("Nhập diện tích phòng");
                                            double usableAreaVilla = Integer.parseInt(scanner.nextLine());
                                            System.out.println("Nhập chi phí thuê");
                                            int rentalCostVilla = Integer.parseInt(scanner.nextLine());
                                            System.out.println("Nhập số người tối đa");
                                            int maxiumNumbOfPeopleVilla = Integer.parseInt(scanner.nextLine());
                                            System.out.println("Kiểu thuê");
                                            String rentalTypeVilla = scanner.nextLine();
                                            System.out.println("Nhập mã phòng");
                                            String serviceCodeVilla = scanner.nextLine();
                                            System.out.println("Nhập tiêu chuẩn phòng");
                                            String roomStandard = scanner.nextLine();
                                            System.out.println("Nhập diện tích hồ bơi");
                                            double poolArea = Integer.parseInt(scanner.nextLine());
                                            System.out.println("Nhập số tầng");
                                            int numbOfFloor = Integer.parseInt(scanner.nextLine());
                                            Villa villa = new Villa(serviceNameVilla,usableAreaVilla,
                                            rentalCostVilla,maxiumNumbOfPeopleVilla,rentalTypeVilla,
                                                    serviceCodeVilla,roomStandard,poolArea,numbOfFloor);
                                            iFacilitySer.addVilla(villa);
                                            break;
                                    }
                                } while (choiceAddFacility != 3);
                                break;
                            case 3:
                                iFacilitySer.displayMaintenance();
                                break;
                        }
                    } while (choiceThree != 4);
                case 4:
                    do {
                        System.out.println(
                                "Your option booking \n" +
                                        "1. Add new booking. \n" +
                                        "2. Display list booking. \n" +
                                        "3. Return main menu");
                        int choiceFour = Integer.parseInt(scanner.nextLine());
                        switch (choiceFour) {
                            case 1:
                                System.out.println("a");
                                break;
                            case 2:
                                System.out.println("b");
                                break;
                            case 3:
                                System.exit(1);
                        }
                    } while (true);
                case 5:
                    do {
                        System.out.println("Your option promotion \n" +
                                "1. Display list customers use service. \n" +
                                "2. Display list customers get voucher. \n" +
                                "3. Return main menu");
                        int choiceFine = Integer.parseInt(scanner.nextLine());
                        switch (choiceFine) {
                            case 1:
                                System.out.println("a");
                                break;
                            case 2:
                                System.out.println("b");
                                break;
                            case 3:
                                System.exit(1);
                        }
                    } while (true);
                case 6:
                    System.exit(1);
            }
        } while (true);
    }
}
