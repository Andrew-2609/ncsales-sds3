package com.ndrewcoding.ncsales.services;

import com.ndrewcoding.ncsales.dto.SellerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SellerService {
    List<SellerDTO> findAll();
}
