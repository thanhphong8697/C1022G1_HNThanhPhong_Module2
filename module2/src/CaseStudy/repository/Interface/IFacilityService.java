package CaseStudy.repository.Interface;

import CaseStudy.services.Facility.Facility;
import CaseStudy.services.Facility.Villa;

import java.util.Map;

public interface IFacilityService extends IService {
    void displayMaintenance();

    void addVilla(Villa villa);

    void maintenanceMap();
}
