package com.gmagica.demo.repository;

import com.gmagica.demo.entity.SubsEntity;
import com.gmagica.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubsRepository extends JpaRepository<SubsEntity,Long > {
    SubsEntity findByEmail(String email);
}
