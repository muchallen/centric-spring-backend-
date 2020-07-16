package com.example.demo.dao;

import com.example.demo.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

/*
@Repository("fakeDao")
public class FakeProductDaoImpl implements ProductDao {

    private final Map<UUID,Product> database;

    public FakeProductDaoImpl() {
        database = new HashMap<>();
    }

    @Override
    public int insertNewProduct(UUID productId, Product product) {
        database.put(productId,product);
        return 1;
    }

    @Override
    public Product selectProductById(UUID productId) {
       return database.get(productId);

    }

    @Override
    public List<Product> selectAllProducts() {
        return new ArrayList<>(database.values());
    }

    @Override
    public int updateStudentId(UUID productId, Product product) {
        database.put(productId,product);
        return 1;
    }

    @Override
    public int deleteStudentById(UUID productId) {
       database.remove(productId);
        return 1;
    }
}*/
