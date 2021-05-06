package com.ndrewcoding.ncsales.dto;

import com.ndrewcoding.ncsales.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SellerDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;

    public SellerDTO(Seller seller) {
        this.id = seller.getId();
        this.name = seller.getName();
    }
}
