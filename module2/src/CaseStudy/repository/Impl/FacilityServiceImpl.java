package CaseStudy.repository.Impl;

import CaseStudy.services.Facility.Facility;
import CaseStudy.services.Facility.Room;
import CaseStudy.services.Facility.Villa;
import CaseStudy.repository.Interface.IFacilityService;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityServiceImpl implements IFacilityService {
    static Map<Facility, Integer> availableFacilityMap = new LinkedHashMap<>();
    static Map<Facility, Integer> maintenanceFacilityMap = new LinkedHashMap<>();

    static {
        Facility room1 = new Room("Thuê phòng", "40", "350000", "2",
                "Thuê ngày", "SVRO1111", "Bộ bàn ủi");
        Facility room2 = new Room("Thuê phòng", "40", "9000000", "2",
                "Thuê tháng", "SVRO1112", "Bộ bàn ủi");
        Facility room3 = new Room("Thuê phòng", "40", "90000000", "2",
                "Thuê năm", "SVRO1113", "Bộ bàn ủi");
        Facility villa1 = new Villa("Thuê villa", "75", "4000000", "6",
                "Thuê ngày", "SVVL1114", "Standard", "35.0", "1");
        Facility villa2 = new Villa("Thuê villa", "100", "120000000", "9",
                "Thuê tháng", "SVVL1115", "Sup", "45.0", "2");
        Facility villa3 = new Villa("Thuê villa", "200", "1440000000", "13"
                , "Thuê năm", "SVVL11116", "Vip", "55.0", "2");
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
        List<Facility> maintenanceList = new ArrayList<>();
        for (Map.Entry<Facility, Integer> facility : availableFacilityMap.entrySet()) {
            if (facility.getValue() >= 5) {
                maintenanceFacilityMap.put(facility.getKey(), facility.getValue());
                maintenanceList.add(facility.getKey());
            }
        }
        for (int i = 0; i < maintenanceList.size(); i++) {
            availableFacilityMap.remove(maintenanceList.get(i));
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
    public Object findID(String id) {
        return null;
    }


}
