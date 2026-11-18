package com.mircurio.electronicsStore.product.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record ProductRequest (

    @NotBlank(message = "Decription must be not blank")
    String description,

    @NotNull(message = "Cost must not be null")
    @PositiveOrZero(message = "Cost must be zero or positive")
    BigDecimal cost,

    @NotNull(message = "Returns must be not null")
    @PositiveOrZero(message = "Returns must be zero or positive")
    Integer returns
) {}
