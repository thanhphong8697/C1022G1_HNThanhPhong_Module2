package CaseStudy.services.Facility;

import CaseStudy.services.Facility.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numbOfFloor;

    public Villa() {
    }

    public Villa(String serviceName, double usableArea, int rentalCost, int maxiumNumbOfPeople, String rentalType,
                 String serviceCode, String roomStandard, double poolArea, int numbOfFloor) {
        super(serviceName, usableArea, rentalCost, maxiumNumbOfPeople, rentalType, serviceCode);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numbOfFloor = numbOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumbOfFloor() {
        return numbOfFloor;
    }

    public void setNumbOfFloor(int numbOfFloor) {
        this.numbOfFloor = numbOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numbOfFloor=" + numbOfFloor +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxiumNumbOfPeople=" + maxiumNumbOfPeople +
                ", rentalType='" + rentalType + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                '}';
    }
}
