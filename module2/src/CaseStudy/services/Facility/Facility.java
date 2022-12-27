package CaseStudy.services.Facility;

public class Facility {
    public String serviceName;
    public double usableArea;
    public int rentalCost;
    public int maxiumNumbOfPeople;
    public String rentalType;
    public String serviceCode;

    public Facility() {
    }

    public Facility(String serviceName, double usableArea, int rentalCost, int maxiumNumbOfPeople, String rentalType, String serviceCode) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxiumNumbOfPeople = maxiumNumbOfPeople;
        this.rentalType = rentalType;
        this.serviceCode = serviceCode;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxiumNumbOfPeople() {
        return maxiumNumbOfPeople;
    }

    public void setMaxiumNumbOfPeople(int maxiumNumbOfPeople) {
        this.maxiumNumbOfPeople = maxiumNumbOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maxiumNumbOfPeople=" + maxiumNumbOfPeople +
                ", rentalType='" + rentalType + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                '}';
    }
}
