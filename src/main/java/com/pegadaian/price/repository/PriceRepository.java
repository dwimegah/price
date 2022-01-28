package com.pegadaian.price.repository;

import com.pegadaian.price.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriceRepository extends JpaRepository<Price, String> {
    @Query("SELECT t FROM tbl_price t WHERE t.priceId like %:priceId%")
    List<Price> findByPriceId(@Param("priceId") String priceId);

    @Query("SELECT t FROM tbl_price t WHERE t.priceDate like %:priceDate%")
    List<Price> findByPriceDate(@Param("priceDate") String priceDate);
}
