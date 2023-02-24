package com.jwt.security.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    //email 이 고유 키이기 때문 이를 통해 사용자를 탐색함

    Optional<User> findByEmail(String email);
}
