package com.pegadaian.price.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity(name = "tbl_price")
@Table(name = "tbl_price")
public class Price {
    @Id
    private String priceId;

    @Column(precision=10, scale=2)
    private Double priceSell;

    @Column(precision=10, scale=2)
    private Double priceBuy;

    @Column(length = 32)
    private String priceDate;

    @Column(length = 10)
    private String createdDate;

    @Column(length = 100)
    private String createdBy;

    @Column(length = 10)
    private String modifiedDate;

    @Column(length = 100)
    private String modifiedBy;
}
