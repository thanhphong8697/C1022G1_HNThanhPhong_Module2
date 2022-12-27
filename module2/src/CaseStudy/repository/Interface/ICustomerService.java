package CaseStudy.repository.Interface;

import CaseStudy.services.Person.Customer;

public interface ICustomerService extends IService {
    void editCustomer(Customer customer);
}
