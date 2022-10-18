package com.springbootMySQL.SpringbootMysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootMySQL.SpringbootMysql.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
