package simplilearn.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import simplilearn.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
