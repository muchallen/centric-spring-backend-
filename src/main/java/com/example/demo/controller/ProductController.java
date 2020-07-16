package com.example.demo.controller;

import com.example.demo.dao.ProductDao;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("api/v1/products")
public class ProductController {
    private final ProductService productService;
    private Path path;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @Autowired
    ProductDao productDao;


   @PostMapping()
    public  Product insertProduct(@RequestBody Product product){

       System.out.println("product ID" + product.getId());
     return productDao.save(product);

    }
    @PostMapping("/image")
    public String insertPicture(@RequestParam("file") MultipartFile userImage) throws IOException {

        File convertFile = new File("C:\\inetpub\\wwwroot\\centric_store\\imagess\\" + userImage.getOriginalFilename());
    //File convertFile = new File("C:\\Users\\lenovo\\3D Objects\\Projects\\Practicals\\React\\centricdata-online-store\\centricdata-online-store\\public\\imagess\\" + userImage.getOriginalFilename());
    convertFile.createNewFile();
    try (FileOutputStream fout = new FileOutputStream(convertFile)){
        fout.write(userImage.getBytes());
    }catch (Exception ex){
        ex.printStackTrace();
    }
    return "File has uploaded successfully";
    }

    @DeleteMapping("/delete/{id}")
    public  void deleteProduct(@PathVariable("id") Long id){
        productDao.deleteById(id);

         return;
    }
    @PutMapping("/update/{id}")
    public  void updateProduct(@PathVariable("id") Long id,@RequestBody Product product ){
         productDao.updateProduct(id,
                 product.getProductName(),
                 product.getProductDescription(),
                 product.getProductCategory(),
                 product.getImage(),
                 product.getProductPrice(),
                 product.getProductSerialNumber(),
                 product.getProductModelNumber()
                 );
    }

    @GetMapping()
    public  List<Product> getAll(){
       return productDao.findAll();
    }


}
