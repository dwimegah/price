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

    private Long priceSell;

    private Long priceBuy;

    @Column(length = 32)
    private String priceDate;

    private Long createdDate;

    @Column(length = 100)
    private String createdBy;

    private Long modifiedDate;

    @Column(length = 100)
    private String modifiedBy;
}
