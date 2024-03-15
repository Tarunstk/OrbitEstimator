package com.example.src.main.java.orbittracker;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
@Repository
public interface satelliteDB extends JpaRepository<satellite,String> {
}
