package com.mircurio.electronicsStore.product.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductResponse (
    UUID id,
    String description,
    BigDecimal cost,
    int returns
) {}
