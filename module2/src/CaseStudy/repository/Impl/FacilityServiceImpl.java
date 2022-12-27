package CaseStudy.repository.Impl;

import CaseStudy.services.Facility.Facility;
import CaseStudy.services.Facility.Room;
import CaseStudy.services.Facility.Villa;
import CaseStudy.repository.Interface.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityServiceImpl implements IFacilityService {
    static Map<Facility, Integer> availableFacilityMap = new LinkedHashMap<>();
    static Map<Facility, Integer> maintenanceFacilityMap = new LinkedHashMap<>();

    static {
        Facility room1 = new Room("Thuê phòng", 21, 350000, 2,
                "Thuê theo ngày", "123", "Bộ bàn ủi");
        Facility room2 = new Room("Thuê phòng", 21, 9000000, 2,
                "Thuê theo tháng", "124", "Bộ bàn ủi");
        Facility room3 = new Room("Thuê phòng", 21, 90000000, 2,
                "Thuê theo năm", "125", "Bộ bàn ủi");
        Facility villa1 = new Villa("Thuê villa", 75, 4000000, 6,
                "Thuê ngày", "456", "Standard", 20, 1);
        Facility villa2 = new Villa("Thuê villa", 100, 120000000, 9,
                "Thuê tháng", "457", "Sup", 30, 2);
        Facility villa3 = new Villa("Thuê villa", 200, 1440000000, 13
                , "Thuê năm", "458", "VIP", 40, 2);
        availableFacilityMap.put(room1, 1);
        availableFacilityMap.put(room2, 2);
        availableFacilityMap.put(room3, 5);
        availableFacilityMap.put(villa1, 1);
        availableFacilityMap.put(villa2, 2);
        availableFacilityMap.put(villa3, 5);
    }

    @Override
    public void displayMaintenance() {
        for (Map.Entry<Facility, Integer> facilityMaintenance : maintenanceFacilityMap.entrySet()) {
            System.out.println(facilityMaintenance.getKey() + " - " + facilityMaintenance.getValue());
        }
    }

    @Override
    public void addVilla(Villa villa) {
        availableFacilityMap.put(villa, 0);
    }

    @Override
    public void maintenanceMap() {
        for (Map.Entry<Facility, Integer> facility : availableFacilityMap.entrySet()) {
            if (facility.getValue() >= 5) {
                maintenanceFacilityMap.put((Facility) facility, 0);
            }
        }
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> facility : availableFacilityMap.entrySet()) {
            System.out.println(facility.getKey() + " - " + facility.getValue());
        }

    }

    @Override
    public void add(Object object) {
        Room room = (Room) object;
        availableFacilityMap.put(room, 0);
    }

    @Override
    public Object findID(int id) {
        return null;
    }
}
