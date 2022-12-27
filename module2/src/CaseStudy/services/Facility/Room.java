package CaseStudy.services.Facility;

import CaseStudy.services.Facility.Facility;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String serviceName, double usableArea, int rentalCost, int maxiumNumbOfPeople, String rentalType,
                String serviceCode, String freeServiceIncluded) {
        super(serviceName, usableArea, rentalCost, maxiumNumbOfPeople, rentalType, serviceCode);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxiumNumbOfPeople=" + maxiumNumbOfPeople +
                ", rentalType='" + rentalType + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                '}';
    }
}
