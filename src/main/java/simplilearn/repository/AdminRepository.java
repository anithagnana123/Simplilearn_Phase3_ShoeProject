package simplilearn.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import simplilearn.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, String> {

}
