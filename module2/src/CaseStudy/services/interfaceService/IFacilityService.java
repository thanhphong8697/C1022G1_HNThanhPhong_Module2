package CaseStudy.services.interfaceService;

import CaseStudy.models.Facility.Villa;

public interface IFacilityService extends IService {
    void displayMaintenance();

    void addVilla(Villa villa);

    void maintenanceMap();
}
