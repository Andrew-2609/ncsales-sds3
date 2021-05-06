package com.ndrewcoding.ncsales.services.impl;

import com.ndrewcoding.ncsales.dto.SellerDTO;
import com.ndrewcoding.ncsales.entities.Seller;
import com.ndrewcoding.ncsales.repositories.SellerRepository;
import com.ndrewcoding.ncsales.services.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SellerServiceImpl implements SellerService {

    private final SellerRepository sellerRepository;

    @Override
    public List<SellerDTO> findAll() {
        List<Seller> result = sellerRepository.findAll();
        return result.stream().map(SellerDTO::new).collect(Collectors.toList());
    }
}
