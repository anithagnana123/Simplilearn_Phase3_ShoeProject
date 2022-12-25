package simplilearn.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import simplilearn.model.Purchase;


public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

}
