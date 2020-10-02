package tradeInWebsite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tradeInWebsite.exceptions.CustomerNotFoundException;
import tradeInWebsite.models.products.Products;
import tradeInWebsite.presistence.ProductsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsService implements Services<Products> {

    @Autowired
    private ProductsRepository productsRepository;

    public ProductsRepository getProductsRepository() {
        return productsRepository;
    }

    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public List<Products> findAll() {
        return productsRepository.findAll();
    }

    @Override
    public Products findById(Long id) {
        return productsRepository.findById(id).get();
    }

    @Override
    public Products save(Products products) {
        return productsRepository.save(products);
    }

    @Override
    public void delete(Long id) throws CustomerNotFoundException {
        Optional.ofNullable(productsRepository.findById(id)).orElseThrow(CustomerNotFoundException::new);

        productsRepository.deleteById(id);
    }

}
