package com.myproject.resource_server.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class DiscountDTO {

    private Integer discountPercent;

    private Integer status;

}
