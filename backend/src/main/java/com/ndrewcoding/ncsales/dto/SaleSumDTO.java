package com.ndrewcoding.ncsales.dto;

import com.ndrewcoding.ncsales.entities.Seller;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class SaleSumDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String sellerName;
    private Double salesSum;

    public SaleSumDTO(Seller seller, Double salesSum) {
        this.sellerName = seller.getName();
        this.salesSum = salesSum;
    }
}
