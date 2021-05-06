package com.ndrewcoding.ncsales.controllers;

import com.ndrewcoding.ncsales.dto.SaleDTO;
import com.ndrewcoding.ncsales.services.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
