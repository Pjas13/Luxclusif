package tradeInWebsite.presistence;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import tradeInWebsite.models.products.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {
}
