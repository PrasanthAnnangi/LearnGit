package com.prasanth.spdm2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prasanth.spdm2.entity.CourceMaterial;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourceMaterial, Long> {

}
