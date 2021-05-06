package com.ndrewcoding.ncsales.repositories;

import com.ndrewcoding.ncsales.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {
}
