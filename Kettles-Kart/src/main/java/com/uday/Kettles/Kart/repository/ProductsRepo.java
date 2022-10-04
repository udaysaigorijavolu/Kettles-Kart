package com.uday.Kettles.Kart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uday.Kettles.Kart.model.Products;
@Repository
public interface ProductsRepo extends JpaRepository<Products, Integer>{

}
