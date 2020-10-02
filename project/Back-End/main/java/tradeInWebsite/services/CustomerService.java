package tradeInWebsite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tradeInWebsite.exceptions.CustomerNotFoundException;
import tradeInWebsite.models.customer.Customer;
import tradeInWebsite.presistence.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements Services<Customer>{

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    @Transactional
    public void delete(Long id) throws CustomerNotFoundException {

        Optional.ofNullable(customerRepository.findById(id)).orElseThrow(CustomerNotFoundException::new);

        customerRepository.deleteById(id);;
    }
}
