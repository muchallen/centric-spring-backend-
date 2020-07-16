package com.example.demo.controller;

import com.example.demo.dao.SalesDao;
import com.example.demo.model.Product;
import com.example.demo.model.Reciept;
import com.example.demo.model.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zw.co.paynow.constants.MobileMoneyMethod;
import zw.co.paynow.core.*;
import zw.co.paynow.core.Payment;
import zw.co.paynow.core.Paynow;
import zw.co.paynow.responses.MobileInitResponse;

import java.util.List;
import java.util.UUID;

import static java.util.UUID.randomUUID;

@RestController
@CrossOrigin
@RequestMapping("api/v1/sales")
public class SalesController {
@Autowired
    SalesDao salesDao;

    @PostMapping()
    public boolean pay(@RequestBody Reciept [] reciepts){

        try {
            Paynow paynow = new Paynow("10177", "b5aa679e-1513-4bc7-948c-20e2070ae4a6");
            Payment payment = paynow.createPayment("Invoice 32", "tarisai@centricdata.net");
            if (reciepts != null) {
                for (Reciept reciept : reciepts
                ) {
                    payment.add(reciept.getProduct().getProductName() + "X " + reciept.getQuantity(), reciept.getProduct().getProductPrice() * reciept.getQuantity());
                }
                MobileInitResponse response = paynow.sendMobile(payment, "0771111111", MobileMoneyMethod.ECOCASH);
                if (response.success()) {
                    // Get the instructions to show to the user
                    String instructions = response.instructions();
                    System.out.println(response.getPaynowReference() + response.getStatus());
                    // Get the poll URL of the transaction
                    String pollUrl = response.pollUrl();

                    return true;
                } else {

                    System.out.println("failed" + response.errors());
                    return false;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            }
        return false;
    }



    @DeleteMapping("/delete/{id}")
    public  void deleteProduct(@PathVariable("id") Long id){
        salesDao.deleteById(id);

        return;
    }
    @PutMapping("/update/{id}")
    public  void updateProduct(@PathVariable("id") Long id,@RequestBody Sale product ){

        return;
    }


    @GetMapping()
    public List<Sale> getAll(){
        return salesDao.findAll();
    }



}
