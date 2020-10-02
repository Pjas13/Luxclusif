package tradeInWebsite.dto.customerDto;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import tradeInWebsite.dto.DtoAssembler;
import tradeInWebsite.models.customer.Customer;

@Component
public class CustomerAssembler implements DtoAssembler<Customer, CustomerDto> {
    @Override
    public CustomerDto convertToDto(Customer customer) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(customer, CustomerDto.class);
    }

    @Override
    public Customer convertToModel(CustomerDto dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, Customer.class);
    }
}
