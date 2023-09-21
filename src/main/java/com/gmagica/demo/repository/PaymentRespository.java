package com.gmagica.demo.repository;

import com.gmagica.demo.entity.PaymentEntity;
import com.gmagica.demo.entity.SubsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRespository extends JpaRepository <PaymentEntity,Long> {

    PaymentEntity findByEmail(String email);
}
