package com.ndrewcoding.ncsales.services;

import com.ndrewcoding.ncsales.dto.SaleDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SaleService {
    Page<SaleDTO> findAll(Pageable pageable);
}
