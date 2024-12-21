package ru.kata.spring.boot_security.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.kata.spring.boot_security.demo.model.Role;

public interface RoleDao extends JpaRepository<Role, Long> {

    @Query("select r from Role r where r.name =:name")
    public Role findByName(String name);
}
