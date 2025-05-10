package com.codewithmosh.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithmosh.store.entities.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
