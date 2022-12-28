package CaseStudy.controllers;

import CaseStudy.repository.Impl.FacilityServiceImpl;
import CaseStudy.repository.Interface.IFacilityService;
import CaseStudy.services.Facility.Room;
import CaseStudy.services.Facility.Villa;
import CaseStudy.services.RegexCode;

import java.util.Scanner;

public class FacilityController {
    void facilityDisplayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        IFacilityService iFacilitySer = new FacilityServiceImpl();
        RegexCode regexCode = new RegexCode();
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
                    iFacilitySer.maintenanceMap();
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
                        switch (choiceAddFacility = Integer.parseInt(scanner.nextLine())) {
                            case 1:
                                /**
                                 * TÊN DỊCH VỤ
                                 */
                                String serviceName;
                                do {
                                    System.out.println("Nhập tên phòng");
                                    serviceName = scanner.nextLine();
                                    if (!serviceName.matches(regexCode.getSERVICE_NAME_REGEX())){
                                        System.out.println("Nhập chưa đúng format");
                                    }
                                }while (!serviceName.matches(regexCode.getSERVICE_NAME_REGEX()));
                                /**
                                 * DIỆN TÍCH PHÒNG
                                 */
                                String usableArea;
                                do {
                                    System.out.println("Nhập diện tích phòng");
                                    usableArea = scanner.nextLine();
                                    if (!usableArea.matches(regexCode.getUSABLE_AREA_REGEX())){
                                        System.out.println("Nhập chưa đúng format");
                                    }
                                }while (!usableArea.matches(regexCode.getUSABLE_AREA_REGEX()));
                                /**
                                 * CHI PHÍ THUÊ
                                 */
                                String rentalCost;
                                do {
                                    System.out.println("Nhập chi phí thuê");
                                    rentalCost = scanner.nextLine();
                                    if (!rentalCost.matches(regexCode.getRENTAL_COSTS_REGEX())){
                                        System.out.println("Nhập chưa đúng format");
                                    }
                                }while (!rentalCost.matches(regexCode.getRENTAL_COSTS_REGEX()));
                                /**
                                 * SỐ NGƯỜI TỐI ĐA
                                 */
                                String maxiumNumbOfPeople;
                                do {
                                    System.out.println("Nhập số người tối đa");
                                    maxiumNumbOfPeople = scanner.nextLine();
                                    if (!maxiumNumbOfPeople.matches(regexCode.getMAXIMUM_NUMBER_OF_PEOPLE())){
                                        System.out.println("Nhập chưa đúng format");
                                    }
                                }while (!maxiumNumbOfPeople.matches(regexCode.getMAXIMUM_NUMBER_OF_PEOPLE()));
                                /**
                                 * KIỂU THUÊ
                                 */
                                String rentalType;
                                do {
                                    System.out.println("Kiểu thuê");
                                    rentalType = scanner.nextLine();
                                    if (!rentalType.matches(regexCode.getRENTAL_TYPE_REGEX())){
                                        System.out.println("Nhập chưa đúng format");
                                    }
                                }while (!rentalType.matches(regexCode.getRENTAL_TYPE_REGEX()));
                                System.out.println("Nhập mã phòng");
                                String serviceCode = scanner.nextLine();
                                System.out.println("Nhập dịch vụ cung cấp miễn phí");
                                String freeServiceIncluded = scanner.nextLine();
                                Room room = new Room(serviceName, usableArea,
                                        rentalCost, maxiumNumbOfPeople, rentalType,
                                        serviceCode, freeServiceIncluded);
                                iFacilitySer.add(room);
                                break;
                            case 2:
                                /**
                                 * TÊN DỊCH VỤ
                                 */
                                String serviceNameVilla;
                                do {
                                    System.out.println("Nhập tên phòng");
                                    serviceNameVilla = scanner.nextLine();
                                    if (!serviceNameVilla.matches(regexCode.getSERVICE_NAME_REGEX())){
                                        System.out.println("Nhập chưa đúng format");
                                    }
                                }while (!serviceNameVilla.matches(regexCode.getSERVICE_NAME_REGEX()));
                                /**
                                 * DIỆN TÍCH PHÒNG
                                 */
                                String usableAreaVilla;
                                do {
                                    System.out.println("Nhập diện tích phòng");
                                    usableAreaVilla = scanner.nextLine();
                                    if (!usableAreaVilla.matches(regexCode.getUSABLE_AREA_REGEX())){
                                        System.out.println("Nhập chưa đúng format");
                                    }
                                }while (!usableAreaVilla.matches(regexCode.getUSABLE_AREA_REGEX()));
                                /**
                                 * CHI PHÍ THUÊ
                                 */
                                String rentalCostVilla;
                                do {
                                    System.out.println("Nhập chi phí thuê");
                                    rentalCostVilla = scanner.nextLine();
                                    if (!rentalCostVilla.matches(regexCode.getRENTAL_COSTS_REGEX())){
                                        System.out.println("Nhập chưa đúng format");
                                    }
                                }while (!rentalCostVilla.matches(regexCode.getRENTAL_COSTS_REGEX()));
                                /**
                                 * SỐ NGƯỜI TỐI ĐA
                                 */
                                String maxiumNumbOfPeopleVilla;
                                do {
                                    System.out.println("Nhập số người tối đa");
                                    maxiumNumbOfPeopleVilla = scanner.nextLine();
                                    if (!maxiumNumbOfPeopleVilla.matches(regexCode.getMAXIMUM_NUMBER_OF_PEOPLE())){
                                        System.out.println("Nhập chưa đúng format");
                                    }
                                }while (!maxiumNumbOfPeopleVilla.matches(regexCode.getMAXIMUM_NUMBER_OF_PEOPLE()));
                                /**
                                 * KIỂU THUÊ
                                 */
                                String rentalTypeVilla;
                                do {
                                    System.out.println("Kiểu thuê");
                                    rentalTypeVilla = scanner.nextLine();
                                    if (!rentalTypeVilla.matches(regexCode.getRENTAL_TYPE_REGEX())){
                                        System.out.println("Nhập chưa đúng format");
                                    }
                                }while (!rentalTypeVilla.matches(regexCode.getRENTAL_TYPE_REGEX()));
                                System.out.println("Nhập mã phòng");
                                String serviceCodeVilla = scanner.nextLine();
                                /**
                                 * TIÊU CHUẨN PHÒNG
                                 */
                                String roomStandard;
                                do {
                                    System.out.println("Nhập tiêu chuẩn phòng");
                                    roomStandard = scanner.nextLine();
                                    if (!roomStandard.matches(regexCode.getROOM_STANDARD_REGEX())){
                                        System.out.println("Nhập chưa đúng format");
                                    }
                                }while (!roomStandard.matches(regexCode.getROOM_STANDARD_REGEX()));
                                /**
                                 * DIỆN TÍCH HỒ BƠI
                                 */
                                String poolArea;
                                do {
                                    System.out.println("Nhập diện tích hồ bơi");
                                    poolArea = scanner.nextLine();
                                    if (!poolArea.matches(regexCode.getPOOL_AREA_REGEX())){
                                        System.out.println("Nhập chưa đúng format");
                                    }
                                }while (!poolArea.matches(regexCode.getPOOL_AREA_REGEX()));
                                /**
                                 * SỐ TẦNG
                                 */
                                String numbOfFloor;
                                do {
                                    System.out.println("Nhập số tầng");
                                    numbOfFloor = scanner.nextLine();
                                    if (!numbOfFloor.matches(regexCode.getFLOOR_NUMBER_REGEX())){
                                        System.out.println("Nhập chưa đúng format");
                                    }
                                }while (!numbOfFloor.matches(regexCode.getFLOOR_NUMBER_REGEX()));
                                Villa villa = new Villa(serviceNameVilla, usableAreaVilla,
                                        rentalCostVilla, maxiumNumbOfPeopleVilla, rentalTypeVilla,
                                        serviceCodeVilla, roomStandard, poolArea, numbOfFloor);
                                iFacilitySer.addVilla(villa);
                                break;
                        }
                    } while (choiceAddFacility != 3);
                    break;
                case 3:
                    iFacilitySer.maintenanceMap();
                    iFacilitySer.displayMaintenance();
                    break;
            }
        } while (choiceThree != 4);
    }
}
