package com.henry.springsecurityoauth2keycloak.repository;

import com.henry.springsecurityoauth2keycloak.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
