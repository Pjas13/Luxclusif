package tradeInWebsite.dto.productdto;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import tradeInWebsite.dto.DtoAssembler;
import tradeInWebsite.models.products.Products;

@Component
public class ProductAssembler implements DtoAssembler<Products, ProductsDto> {
    @Override
    public ProductsDto convertToDto(Products product) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(product, ProductsDto.class);
    }

    @Override
    public Products convertToModel(ProductsDto dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, Products.class);
    }
}
