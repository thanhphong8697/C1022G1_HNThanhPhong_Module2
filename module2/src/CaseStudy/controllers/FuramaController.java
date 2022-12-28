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
                            "5. Promotion Management. \n" +
                            "6. Exit.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    /**
                     * MENU EMPLOYEE
                     */
                    EmployeeController employeeController = new EmployeeController();
                    employeeController.employeeDisplayMainMenu();
                    break;
                case 2:
                    /**
                     *  MENU CUSTOMER
                     */
                    CustomerController customerController = new CustomerController();
                    customerController.customerDisplayMainMenu();
                    break;
                case 3:
                    /**
                     *  MENU FACILITY
                     */
                    FacilityController facilityController = new FacilityController();
                    facilityController.facilityDisplayMainMenu();
                    break;
                case 4:
                    /**
                     *  MENU BOOKING
                     */
                    BookingController bookingController = new BookingController();
                    bookingController.bookingDisplayMainMenu();
                    break;
                case 5:
                    /**
                     *  MENU PROMOTION
                     */
                    PromotionController promotionController = new PromotionController();
                    promotionController.promotionDisplayMainMenu();
                    break;
                case 6:
                    System.exit(1);
            }
        } while (true);
    }
}
