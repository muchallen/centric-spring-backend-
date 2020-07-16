package com.example.demo.dao;

import com.example.demo.model.Product;
import com.example.demo.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesDao extends JpaRepository<Sale, Long> {
}
