package io.github.andrefelipeos.santanderdevweek2023.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import io.github.andrefelipeos.santanderdevweek2023.domain.model.User;
import io.github.andrefelipeos.santanderdevweek2023.domain.repository.UserRepository;
import io.github.andrefelipeos.santanderdevweek2023.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(User userToCreate) {
        if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())) {
            throw new IllegalArgumentException("This User ID already exists.");
        }
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account Number already exists.");
        }
        return userRepository.save(userToCreate);
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

}
