package com.ndrewcoding.ncsales.dto;

import com.ndrewcoding.ncsales.entities.Seller;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class SaleSuccessDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
        this.sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }
}
