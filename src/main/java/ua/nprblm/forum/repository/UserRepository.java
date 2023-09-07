package ua.nprblm.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.nprblm.forum.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
