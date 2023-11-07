package com.example.resto.Repository;

import com.example.resto.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByEmailAndAndPassword(String email , String password);
}
