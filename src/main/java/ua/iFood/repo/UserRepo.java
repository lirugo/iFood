package ua.iFood.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.iFood.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
}
