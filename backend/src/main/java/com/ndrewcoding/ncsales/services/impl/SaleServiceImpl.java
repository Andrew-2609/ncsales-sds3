package com.ndrewcoding.ncsales.services.impl;

import com.ndrewcoding.ncsales.dto.SaleDTO;
import com.ndrewcoding.ncsales.entities.Sale;
import com.ndrewcoding.ncsales.repositories.SaleRepository;
import com.ndrewcoding.ncsales.repositories.SellerRepository;
import com.ndrewcoding.ncsales.services.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SaleServiceImpl implements SaleService {

    private final SaleRepository saleRepository;
    private final SellerRepository sellerRepository;

    @Override
    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> salesPage = saleRepository.findAll(pageable);
        return salesPage.map(SaleDTO::new);
    }
}
