package simplilearn.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import simplilearn.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
