package com.example.demo.service;

import com.example.demo.dao.ProductDao;
import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    private final ProductDao productDao;
    @Autowired
    public ProductService(@Qualifier("fakeDao") ProductDao productDao) {
        this.productDao = productDao;
    }

    /*public  persistNewProduct(Product product){
        //UUID productUUID = productId==null?UUID.randomUUID():productId;
        //product.setId(productUUID);
        return productDao.save(product);


   }

    public Product getProductById(UUID productId){
        return productDao.selectProductById(productId);
    }

   public List<Product> getAllProducts(){
        return productDao.selectAllProducts();
   }

   public int updateProductById(UUID productId, Product product){
        return productDao.updateStudentId(productId,product);
   }

  public int deleteProductById(UUID productId){
        return productDao.deleteStudentById(productId);
  }*/
}
