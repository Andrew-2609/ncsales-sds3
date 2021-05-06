package com.ndrewcoding.ncsales.repositories;

import com.ndrewcoding.ncsales.dto.SaleSuccessDTO;
import com.ndrewcoding.ncsales.dto.SaleSumDTO;
import com.ndrewcoding.ncsales.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
    @Query("SELECT new com.ndrewcoding.ncsales.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " +
            "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> salesAmountGroupedBySeller();

    @Query("SELECT new com.ndrewcoding.ncsales.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
            "FROM Sale as obj GROUP BY obj.seller")
    List<SaleSuccessDTO> salesSuccessGroupedBySeller();
}
