package com.codewithmosh.store.dtos;

import java.math.BigDecimal;
import lombok.*;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private BigDecimal price;
    private String description;
    private Byte categoryId;
}
