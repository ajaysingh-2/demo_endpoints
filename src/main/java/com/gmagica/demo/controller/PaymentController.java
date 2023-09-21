package com.gmagica.demo.controller;

import com.gmagica.demo.entity.PaymentEntity;
import com.gmagica.demo.repository.PaymentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping(path = "/payment")
public class PaymentController {

    @Autowired
    private PaymentRespository paymentRespository;

        @PostMapping(path = "/payadd")
        public @ResponseBody String addNewSubs(@RequestParam String payname, @RequestParam String mode, @RequestParam String email, @RequestParam Date date) {

            PaymentEntity pays = new PaymentEntity();
            pays.setPayname(payname);
            pays.setPaymode(mode);
            pays.setEmail(email);
            pays.setDate(date);
            paymentRespository.save(pays);
            return "User Created";
        }

        @GetMapping(path = "/payall")
        public @ResponseBody Iterable <PaymentEntity> getAllUsers() {
            return paymentRespository.findAll();

        }

    }


