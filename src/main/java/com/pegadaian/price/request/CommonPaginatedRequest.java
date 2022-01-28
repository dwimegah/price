package com.pegadaian.price.request;

import com.pegadaian.price.model.PagingInfo;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ApiModel("findAllPaginatedRequest")
@Getter
@Setter
public class CommonPaginatedRequest implements Serializable {
    private PagingInfo pagingInfo;
}
