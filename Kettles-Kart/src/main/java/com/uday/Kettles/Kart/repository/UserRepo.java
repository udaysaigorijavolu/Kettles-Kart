package com.uday.Kettles.Kart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uday.Kettles.Kart.model.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
