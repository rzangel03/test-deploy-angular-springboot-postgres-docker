package com.sb.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.example.demo.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}