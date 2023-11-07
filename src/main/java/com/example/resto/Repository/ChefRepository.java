package com.example.resto.Repository;

import com.example.resto.Entity.Chef;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChefRepository extends JpaRepository<Chef,Integer> {
}
