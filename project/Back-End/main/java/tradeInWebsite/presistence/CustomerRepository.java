package tradeInWebsite.presistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tradeInWebsite.models.customer.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
