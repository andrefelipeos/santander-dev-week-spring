package io.github.andrefelipeos.santanderdevweek2023.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.andrefelipeos.santanderdevweek2023.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);

}
