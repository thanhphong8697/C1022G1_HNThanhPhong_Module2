package CaseStudy.controllers;

import CaseStudy.repository.interfaceRepo.IFacilityRepo;
import CaseStudy.models.Facility.Room;
import CaseStudy.models.Facility.Villa;
import CaseStudy.services.implService.FacilityService;
import CaseStudy.services.interfaceService.IFacilityService;
import CaseStudy.utils.RegexCode;

import java.util.Scanner;

public class FacilityController {
    void facilityDisplayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        IFacilityService iFacilitySer = new FacilityService();
        RegexCode regexCode = new RegexCode();
        int choiceThree = 0;
        do {
            System.out.println(
                    "Your option facility \n" +
                            "1. Display list facility. \n" +
                            "2. Add new facility. \n" +
                            "3. Display list facility maintenance. \n" +
                            "4. Return main menu");
            try {
                choiceThree = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            switch (choiceThree) {
                case 1:
                    iFacilitySer.maintenanceMap();
                    iFacilitySer.display();
                    break;
                case 2:
                    int choiceAddFacility = 0;
                    do {
                        System.out.println(
                                "Your choice \n" +
                                        "1. Add Room \n" +
                                        "2. Add Villa \n" +
                                        "3. Return facility menu");
                        try {
                            choiceAddFacility = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                        }
                        switch (choiceAddFacility) {
                            case 1:
                                /**
                                 * T??N D???CH V???
                                 */
                                String serviceName;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "T??n d???ch v??? ph???i vi???t hoa k?? t??? ?????u,\n" +
                                                    "c??c k?? t??? sau l?? k?? t??? b??nh th?????ng");
                                    System.out.println("Nh???p t??n ph??ng");
                                    serviceName = scanner.nextLine();
                                    if (!serviceName.matches(regexCode.getSERVICE_NAME_REGEX())) {
                                        System.out.println("Nh???p ch??a ????ng format vui l??ng nh???p l???i");
                                    }
                                } while (!serviceName.matches(regexCode.getSERVICE_NAME_REGEX()));
                                /**
                                 * DI???N T??CH PH??NG
                                 */
                                String usableArea;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Di???n t??ch s??? d???ng ph???i l?? s??? th???c l???n h??n 30m2");
                                    System.out.println("Nh???p di???n t??ch ph??ng");
                                    usableArea = scanner.nextLine();
                                    if (!usableArea.matches(regexCode.getUSABLE_AREA_REGEX())) {
                                        System.out.println("Nh???p ch??a ????ng format vui l??ng nh???p l???i.");
                                    }
                                } while (!usableArea.matches(regexCode.getUSABLE_AREA_REGEX()));
                                /**
                                 * CHI PH?? THU??
                                 */
                                String rentalCost;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Chi ph?? thu?? ph???i l?? s??? d????ng");
                                    System.out.println("Nh???p chi ph?? thu??");
                                    rentalCost = scanner.nextLine();
                                    if (!rentalCost.matches(regexCode.getRENTAL_COSTS_REGEX())) {
                                        System.out.println("Nh???p ch??a ????ng format vui l??ng nh???p l???i.");
                                    }
                                } while (!rentalCost.matches(regexCode.getRENTAL_COSTS_REGEX()));
                                /**
                                 * S??? NG?????I T???I ??A
                                 */
                                String maxiumNumbOfPeople;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "S??? l?????ng ng?????i t???i ??a ph???i >0 v?? nh??? h??n <20");
                                    System.out.println("Nh???p s??? ng?????i t???i ??a");
                                    maxiumNumbOfPeople = scanner.nextLine();
                                    if (!maxiumNumbOfPeople.matches(regexCode.getMAXIMUM_NUMBER_OF_PEOPLE())) {
                                        System.out.println("Nh???p ch??a ????ng format vui l??ng nh???p l???i.");
                                    }
                                } while (!maxiumNumbOfPeople.matches(regexCode.getMAXIMUM_NUMBER_OF_PEOPLE()));
                                /**
                                 * KI???U THU??
                                 */
                                String rentalType;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "T??n ki???u thu?? ph???i vi???t hoa k?? t??? ?????u,\n" +
                                                    "c??c k?? t??? sau l?? k?? t??? b??nh th?????ng");
                                    System.out.println("Ki???u thu??");
                                    rentalType = scanner.nextLine();
                                    if (!rentalType.matches(regexCode.getRENTAL_TYPE_REGEX())) {
                                        System.out.println("Nh???p ch??a ????ng format vui l??ng nh???p l???i.");
                                    }
                                } while (!rentalType.matches(regexCode.getRENTAL_TYPE_REGEX()));
                                /**
                                 * M?? D???CH V???
                                 */
                                String serviceCode;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "-M?? d???ch v??? ph???i ????ng ?????nh d???ng: SVXX-YYYY, \n " +
                                                    "v???i YYYY l?? c??c s??? t??? 0-9, XX l??: \n" +
                                                    "-N???u l?? Villa th?? XX s??? l?? VL.\n" +
                                                    "-N???u Room th?? XX s??? l?? RO.");
                                    System.out.println("Nh???p m?? ph??ng");
                                    serviceCode = scanner.nextLine();
                                    if (!serviceCode.matches(regexCode.getROOM_CODE_REGEX())) {
                                        System.out.println("Nh???p ch??a ????ng format room vui l??ng nh???p l???i.");
                                    }
                                } while (!serviceCode.matches(regexCode.getROOM_CODE_REGEX()));
                                System.out.println("Nh???p d???ch v??? cung c???p mi???n ph??");
                                String freeServiceIncluded = scanner.nextLine();
                                Room room = new Room(serviceName, usableArea,
                                        rentalCost, maxiumNumbOfPeople, rentalType,
                                        serviceCode, freeServiceIncluded);
                                iFacilitySer.addRoom(room);
                                break;
                            case 2:
                                /**
                                 * VILLA
                                 * T??N D???CH V???
                                 */
                                String serviceNameVilla;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "T??n d???ch v??? ph???i vi???t hoa k?? t??? ?????u,\n" +
                                                    "c??c k?? t??? sau l?? k?? t??? b??nh th?????ng");
                                    System.out.println("Nh???p t??n ph??ng");
                                    serviceNameVilla = scanner.nextLine();
                                    if (!serviceNameVilla.matches(regexCode.getSERVICE_NAME_REGEX())) {
                                        System.out.println("Nh???p ch??a ????ng format vui l??ng nh???p l???i.");
                                    }
                                } while (!serviceNameVilla.matches(regexCode.getSERVICE_NAME_REGEX()));
                                /**
                                 * DI???N T??CH PH??NG
                                 */
                                String usableAreaVilla;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Di???n t??ch s??? d???ng ph???i l?? s??? th???c l???n h??n 30m2");
                                    System.out.println("Nh???p di???n t??ch ph??ng");
                                    usableAreaVilla = scanner.nextLine();
                                    if (!usableAreaVilla.matches(regexCode.getUSABLE_AREA_REGEX())) {
                                        System.out.println("Nh???p ch??a ????ng format vui l??ng nh???p l???i.");
                                    }
                                } while (!usableAreaVilla.matches(regexCode.getUSABLE_AREA_REGEX()));
                                /**
                                 * CHI PH?? THU??
                                 */
                                String rentalCostVilla;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Chi ph?? thu?? ph???i l?? s??? d????ng");
                                    System.out.println("Nh???p chi ph?? thu??");
                                    rentalCostVilla = scanner.nextLine();
                                    if (!rentalCostVilla.matches(regexCode.getRENTAL_COSTS_REGEX())) {
                                        System.out.println("Nh???p ch??a ????ng format vui l??ng nh???p l???i.");
                                    }
                                } while (!rentalCostVilla.matches(regexCode.getRENTAL_COSTS_REGEX()));
                                /**
                                 * S??? NG?????I T???I ??A
                                 */
                                String maxiumNumbOfPeopleVilla;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "S??? l?????ng ng?????i t???i ??a ph???i >0 v?? nh??? h??n <20");
                                    System.out.println("Nh???p s??? ng?????i t???i ??a");
                                    maxiumNumbOfPeopleVilla = scanner.nextLine();
                                    if (!maxiumNumbOfPeopleVilla.matches(regexCode.getMAXIMUM_NUMBER_OF_PEOPLE())) {
                                        System.out.println("Nh???p ch??a ????ng format vui l??ng nh???p l???i.");
                                    }
                                } while (!maxiumNumbOfPeopleVilla.matches(regexCode.getMAXIMUM_NUMBER_OF_PEOPLE()));
                                /**
                                 * KI???U THU??
                                 */
                                String rentalTypeVilla;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Ki???u thu?? ph???i vi???t hoa k?? t??? ?????u,\n" +
                                                    "c??c k?? t??? sau l?? k?? t??? b??nh th?????ng");
                                    System.out.println("Ki???u thu??");
                                    rentalTypeVilla = scanner.nextLine();
                                    if (!rentalTypeVilla.matches(regexCode.getRENTAL_TYPE_REGEX())) {
                                        System.out.println("Nh???p ch??a ????ng format vui l??ng nh???p l???i.");
                                    }
                                } while (!rentalTypeVilla.matches(regexCode.getRENTAL_TYPE_REGEX()));
                                /**
                                 * M?? D???CH V???
                                 */
                                String serviceCodeVilla;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "-M?? d???ch v??? ph???i ????ng ?????nh d???ng: SVXX-YYYY, \n " +
                                                    "v???i YYYY l?? c??c s??? t??? 0-9, XX l??: \n" +
                                                    "-N???u l?? Villa th?? XX s??? l?? VL.\n" +
                                                    "-N???u Room th?? XX s??? l?? RO.");
                                    System.out.println("Nh???p m?? ph??ng");
                                    serviceCodeVilla = scanner.nextLine();
                                    if (!serviceCodeVilla.matches(regexCode.getVILLA_CODE_REGEX())) {
                                        System.out.println("Nh???p ch??a ????ng format villa vui l??ng nh???p l???i.");
                                    }
                                } while (!serviceCodeVilla.matches(regexCode.getVILLA_CODE_REGEX()));

                                /**
                                 * TI??U CHU???N PH??NG
                                 */
                                String roomStandard;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Ti??u chu???n ph??ng ph???i vi???t hoa k?? t??? ?????u,\n" +
                                                    "c??c k?? t??? sau l?? k?? t??? b??nh th?????ng");
                                    System.out.println("Nh???p ti??u chu???n ph??ng");
                                    roomStandard = scanner.nextLine();
                                    if (!roomStandard.matches(regexCode.getROOM_STANDARD_REGEX())) {
                                        System.out.println("Nh???p ch??a ????ng format vui l??ng nh???p l???i.");
                                    }
                                } while (!roomStandard.matches(regexCode.getROOM_STANDARD_REGEX()));
                                /**
                                 * DI???N T??CH H??? B??I
                                 */
                                String poolArea;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "Di???n t??ch s??? d???ng ph???i l?? s??? th???c l???n h??n 30m2");
                                    System.out.println("Nh???p di???n t??ch h??? b??i");
                                    poolArea = scanner.nextLine();
                                    if (!poolArea.matches(regexCode.getPOOL_AREA_REGEX())) {
                                        System.out.println("Nh???p ch??a ????ng format vui l??ng nh???p l???i.");
                                    }
                                } while (!poolArea.matches(regexCode.getPOOL_AREA_REGEX()));
                                /**
                                 * S??? T???NG
                                 */
                                String numbOfFloor;
                                do {
                                    System.out.println(
                                            "Follow format: \n" +
                                                    "S??? t???ng ph???i l?? s??? nguy??n d????ng.");
                                    System.out.println("Nh???p s??? t???ng");
                                    numbOfFloor = scanner.nextLine();
                                    if (!numbOfFloor.matches(regexCode.getFLOOR_NUMBER_REGEX())) {
                                        System.out.println("Nh???p ch??a ????ng format vui l??ng nh???p l???i.");
                                    }
                                } while (!numbOfFloor.matches(regexCode.getFLOOR_NUMBER_REGEX()));
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
