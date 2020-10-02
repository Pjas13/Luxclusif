package tradeInWebsite.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tradeInWebsite.dto.DtoAssembler;
import tradeInWebsite.dto.customerDto.CustomerDto;
import tradeInWebsite.exceptions.CustomerNotFoundException;
import tradeInWebsite.models.customer.Customer;
import tradeInWebsite.services.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "*", maxAge = 3600)
public class CustomerController {

    private CustomerService customerService;
    private DtoAssembler<Customer, CustomerDto> customerAssembler;
    private CustomerDto customerDtoById;


    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Autowired
    public void setCustomerAssembler(DtoAssembler<Customer, CustomerDto> customerAssembler) {
        this.customerAssembler = customerAssembler;
    }

    @GetMapping({"/list", "/"})
    public List<CustomerDto> getAllCustomers(){

        return customerAssembler.convertToListOfDto(customerService.findAll());
    }

    @GetMapping("/{id}")
    private CustomerDto getCustomer(@PathVariable Long id){
        return customerDtoById = customerAssembler.convertToDto(customerService.findById(id));
    }

    @PostMapping("/customerdetails")
    public void createCustomer(@RequestBody CustomerDto customerDto){
        Customer customer = customerService.save(customerAssembler.convertToModel(customerDto));
        System.out.println(customerDto);
        System.out.println(customer);
    }

    @PutMapping("/{id}/customerdetails")
    private void updateCustomer(@RequestBody CustomerDto customerDto, @PathVariable Long id){

        customerDto.setId(id);

        customerService.save(customerAssembler.convertToModel(customerDtoById));
    }

    @DeleteMapping("/{id}/customerdetails")
    private void deleteCustomer(@PathVariable Long id) throws CustomerNotFoundException {
        customerService.delete(id);
    }
}
