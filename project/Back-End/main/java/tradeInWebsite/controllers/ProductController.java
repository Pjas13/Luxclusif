package tradeInWebsite.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tradeInWebsite.dto.DtoAssembler;
import tradeInWebsite.dto.productdto.ProductsDto;
import tradeInWebsite.exceptions.CustomerNotFoundException;
import tradeInWebsite.models.products.Products;
import tradeInWebsite.services.ProductsService;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ProductController {

    @Autowired
    private ProductsService productsService;

    @Autowired
    private DtoAssembler<Products, ProductsDto> productsAssembler;

    private ProductsDto productsDtoById;

    public ProductsService getProductsService() {
        return productsService;
    }

    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }

    public DtoAssembler<Products, ProductsDto> getProductsAssembler() {
        return productsAssembler;
    }

    public void setProductsAssembler(DtoAssembler<Products, ProductsDto> productsAssembler) {
        this.productsAssembler = productsAssembler;
    }

    @GetMapping({"/list", "/"})
    private List<ProductsDto> getAllProducts(){
        return productsAssembler.convertToListOfDto(productsService.findAll());
    }

    @GetMapping("/(id)")
    private ProductsDto getProduct(@PathVariable Long id){
        return productsDtoById = productsAssembler.convertToDto(productsService.findById(id));
    }

    @PostMapping("/productdetails")
    private void createProduct(@RequestBody ProductsDto productsDto){

        Products products =productsService.save(productsAssembler.convertToModel(productsDto));
        System.out.println(productsDto.toString());
        System.out.println(products);
    }

    @PutMapping("/(id)/productDetails")
    private void updateProduct(){
        productsService.save(productsAssembler.convertToModel(productsDtoById));
    }

    @DeleteMapping("/(id)/productDetails")
    private void deleteProduct(@PathVariable Long id) throws CustomerNotFoundException {
        productsService.delete(id);
    }
}
