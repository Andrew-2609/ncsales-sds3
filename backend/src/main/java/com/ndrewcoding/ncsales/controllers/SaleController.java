package com.ndrewcoding.ncsales.controllers;

import com.ndrewcoding.ncsales.dto.SaleDTO;
import com.ndrewcoding.ncsales.dto.SaleSuccessDTO;
import com.ndrewcoding.ncsales.dto.SaleSumDTO;
import com.ndrewcoding.ncsales.services.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
@RequiredArgsConstructor
public class SaleController {
    private final SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> getAllSales(Pageable pageable) {
        Page<SaleDTO> saleDTOPage = saleService.findAll(pageable);
        return ResponseEntity.ok(saleDTOPage);
    }

    @GetMapping(value = "amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> getSalesAmountGroupedBySeller() {
        List<SaleSumDTO> salesAmountGroupedBySeller = saleService.salesAmountGroupedBySeller();
        return ResponseEntity.ok(salesAmountGroupedBySeller);
    }

    @GetMapping(value = "success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> getSalesSuccessGroupedBySeller() {
        List<SaleSuccessDTO> salesSuccessGroupedBySeller = saleService.salesSuccessGroupedBySeller();
        return ResponseEntity.ok(salesSuccessGroupedBySeller);
    }

}
