package io.github.andrefelipeos.santanderdevweek2023.service;

import io.github.andrefelipeos.santanderdevweek2023.domain.model.User;

public interface UserService {

    User create(User userToCreate);

    User findById(Long id);

}
