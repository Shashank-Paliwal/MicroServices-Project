package com.microserviceproject.productservice.dto;

// It is a good practice to create a new class inside dto rather
// than working inside the same model class
// because we do not want to expose our field to the outside world.

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

    private String id;
    private String name;
    private String description;
    private BigDecimal price;

}
