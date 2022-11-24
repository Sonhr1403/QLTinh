package udqlkhtinh.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import udqlkhtinh.model.Customer;
import udqlkhtinh.model.Province;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
