package com.pegadaian.price.controller;

import com.pegadaian.price.entity.Price;
import com.pegadaian.price.repository.PriceRepository;
import com.pegadaian.price.request.CommonPaginatedRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/price")
@Api("Price API")
public class PriceController {

    Logger LOGGER = LoggerFactory.getLogger(PriceController.class);

    @Autowired
    PriceRepository priceRepository;

    @ApiOperation(value = "Find All Price")
    @PostMapping(value="",
            consumes = {"*/*"},
            produces = "application/json; charset=UTF-8")
    public ResponseEntity<List<Price>> findAllPaginated() {
        try {
            List<Price> priceList = priceRepository.findAll();

            return new ResponseEntity<>(priceList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "Get By Price Id")
    @PostMapping(value = "/findById/{id}",consumes = {"*/*"},
            produces = "application/json; charset=UTF-8")
    public ResponseEntity<List<Price>> findById(
            @PathVariable(value = "id") String id) {
        try {
            List<Price> priceList = priceRepository.findByPriceId(id);

            return new ResponseEntity<>(priceList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "Find by Price Date")
    @PostMapping(value = "/findByDate/{price_date}",
            consumes = {"*/*"},
            produces = "application/json; charset=UTF-8")
    public ResponseEntity<List<Price>> findByPriceDate(
            @PathVariable(value = "price_date") String price_date) {
        try {
            List<Price> priceList = priceRepository.findByPriceDate(price_date);

            return new ResponseEntity<>(priceList   , HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
