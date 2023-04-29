package dev.jlkeesh.springadvanced.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Override
    long count();
}