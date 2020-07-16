package com.example.demo.dao;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;
@Repository
public interface ProductDao extends JpaRepository<Product, Long>{
    @Modifying(clearAutomatically = true)
    @Query(
            "UPDATE Product SET "+"productDescription=:productDescription,productNamel=:productName," +
                    "productCategory=:productCategory,productImage=:productImage," +
                    "productPrice=:productPrice,productModelNumber=:productModelNumber,productSerialNumber=:productSerial WHERE id=:id"
    )
    @Transactional
    void updateProduct (@Param("id") Long id,
                        @Param("productName") String productName,
                        @Param("productDescription") String productDescription,
                        @Param("productCategory") String productCategory,
                        @Param("productImage") String productImage,
                        @Param("productPrice") Double productPrice,
                        @Param("productSerial") String productSerial,
                        @Param("productModelNumber") String productModelNumber

    );
}
