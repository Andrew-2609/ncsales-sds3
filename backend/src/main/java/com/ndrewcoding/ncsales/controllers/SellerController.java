package com.ndrewcoding.ncsales.controllers;

import com.ndrewcoding.ncsales.dto.SellerDTO;
import com.ndrewcoding.ncsales.services.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
@RequiredArgsConstructor
public class SellerController {
    private final SellerService sellerService;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> getAllSellers() {
        List<SellerDTO> sellerDTOList = sellerService.findAll();
        return ResponseEntity.ok(sellerDTOList);
    }
}
