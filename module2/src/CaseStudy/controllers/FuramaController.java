package CaseStudy.controllers;

import CaseStudy.services.Person.Employee;
import CaseStudy.services.Person.Impl.EmployeeServiceImpl;
import CaseStudy.services.Person.Interface.IEmployeeService;

import java.util.Scanner;

public class FuramaController {
    void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(
                    "Your choice \n" +
                            "1. Employee Management. \n" +
                            "2. Customer Management. \n" +
                            "3. Facility Management. \n" +
                            "4. Booking Management. \n" +
                            "5. Promotion Management. \n" +
                            "6. Exit.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    IEmployeeService iEmpSer = new EmployeeServiceImpl();
                    do {
                        System.out.println("Your option employees \n" +
                                "1. Display list employees. \n" +
                                "2. Add new employee. \n" +
                                "3. Delete employee. \n" +
                                "4. Edit employee. \n" +
                                "5. Return main menu");
                        int choiceOne = Integer.parseInt(scanner.nextLine());
                        switch (choiceOne) {
                            case 1:
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
                                        employeeGender,employeeIdentityNumb, employeePhoneNumb, employeeEmail,
                                        employeeId, employeeAcademyLevel, employeePosion, employeeSalary);
                                iEmpSer.add(employee);
                                break;
                            case 3:
                                System.out.println("c");
                                break;
                            case 4:
                                System.out.println("Nhập id để kiểm tra");
                                int idOld = Integer.parseInt(scanner.nextLine());
                                Employee employee1 = (Employee) iEmpSer.findID(idOld);
                                if (employee1 != null){
                                    int yourChoice;
                                    do {
                                        System.out.println("");
                                        switch (yourChoice= Integer.parseInt(scanner.nextLine())){
                                            case 1:
                                            System.out.println("Nhập tên");
                                            String employeeNewName = scanner.nextLine();
                                            employee1.setFullName(employeeNewName);
                                            break;
                                            case 2:
                                            System.out.println("Nhập ngày sinh");
                                            String employeeNewBirthday = scanner.nextLine();
                                            employee1.setBirthday(employeeNewBirthday);
                                            break;
                                            case 3:
                                            System.out.println("Nhập giới tính");
                                            String employeeNewGender = scanner.nextLine();
                                            employee1.setGender(employeeNewGender);
                                            break;
                                            case 4:
                                            System.out.println("Nhập CMND");
                                            String employeeNewIdentityNumb = scanner.nextLine();
                                            employee1.setIdentityNUmb(employeeNewIdentityNumb);
                                            break;
                                            case 5:
                                            System.out.println("Nhập SĐT");
                                            String employeeNewPhoneNumb = scanner.nextLine();
                                            employee1.setPhoneNumb(employeeNewPhoneNumb);
                                            break;
                                            case 6:
                                            System.out.println("Nhập mail");
                                            String employeeNewEmail = scanner.nextLine();
                                            employee1.setEmail(employeeNewEmail);
                                            break;
                                            case 7:
                                            System.out.println("Nhập trình độ");
                                            String employeeNewAcademyLevel = scanner.nextLine();
                                            employee1.setAcademyLevel(employeeNewAcademyLevel);
                                            break;
                                            case 8:
                                            System.out.println("Nhập chức vụ");
                                            String employeeNewPosion = scanner.nextLine();
                                            employee1.setPosion(employeeNewPosion);
                                            break;
                                            case 9:
                                            System.out.println("Nhập lương");
                                            int employeeNewSalary = Integer.parseInt(scanner.nextLine());
                                            employee1.setSalary(employeeNewSalary);
                                            break;
                                        }
                                    }while (yourChoice < 10);
                                    iEmpSer.editEmployee(employee1);
                                }
                                break;
                            case 5:
                                System.exit(1);
                        }
                    }while (true) ;
                case 2:
                    do {
                        System.out.println("Your option customers \n" +
                                "1. Display list customer. \n" +
                                "2. Add new customer. \n" +
                                "3. Edit employee. \n" +
                                "4. Return main menu");
                        int choiceTwo = Integer.parseInt(scanner.nextLine());
                        switch (choiceTwo) {
                            case 1:
                                System.out.println("a");
                                break;
                            case 2:
                                System.out.println("b");
                                break;
                            case 3:
                                System.out.println("c");
                                break;
                            case 4:
                                System.exit(1);
                        }
                    }while (true);
                case 3:
                    do {
                        System.out.println("Your option facility \n" +
                                "1. Display list facility. \n" +
                                "2. Add new facility. \n" +
                                "3. Display list facility maintenance. \n" +
                                "4. Return main menu");
                        int choiceThree = Integer.parseInt(scanner.nextLine());
                        switch (choiceThree) {
                            case 1:
                                System.out.println("a");
                                break;
                            case 2:
                                System.out.println("b");
                                break;
                            case 3:
                                System.out.println("c");
                                break;
                            case 4:
                                System.exit(1);
                        }
                    }while (true);
                case 4:
                    do {
                        System.out.println("Your option booking \n" +
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
                    }while (true);
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
                    }while (true);
                case 6:
                    System.exit(1);
            }
        } while (true);
    }
}
