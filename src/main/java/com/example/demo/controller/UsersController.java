package com.example.demo.controller;


import com.example.demo.dao.SalesDao;
import com.example.demo.dao.UsersDao;
import com.example.demo.model.Sale;
import com.example.demo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/users")
public class UsersController {
    @Autowired
    UsersDao usersDao;

    private Path path;

    @PostMapping()
    public Users insertProduct(@RequestBody Users user) {


        return usersDao.save(user);

    }



    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        usersDao.deleteById(id);

        return;
    }

    @PutMapping("/update/{id}")
    public void updateProduct(@PathVariable("id") Long id, @RequestBody Users users) {

        return;
    }


    @GetMapping()
    public List<Users> getAll() {
        return usersDao.findAll();
    }
}