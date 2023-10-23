package me.dio.SantanderBootcamp2023.domain.repository;

import me.dio.SantanderBootcamp2023.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
