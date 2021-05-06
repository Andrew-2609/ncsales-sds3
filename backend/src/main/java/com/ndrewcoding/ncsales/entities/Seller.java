package com.ndrewcoding.ncsales.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_sellers")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Setter(AccessLevel.NONE)

    @OneToMany(mappedBy = "seller")
    private List<Sale> sales = new ArrayList<>();
}
