package sberJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sberJPA.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
