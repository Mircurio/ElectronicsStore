package com.mircurio.electronicsStore.product;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false, columnDefinition = "uuid")
    private UUID id;

    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(name = "cost", nullable = false)
    private BigDecimal cost;

    @Column(name = "returns", nullable = false)
    private int returns;

    public Product() {}

    // Геттеры
    public UUID getId() { return id; }
    public String getDescription() { return description; }
    public BigDecimal getCost() { return cost; }
    public int getReturns() { return returns; }

    // Сеттеры
    public void setId(UUID id) { this.id = id; }
    public void setDescription(String description) { this.description = description; }
    public void setCost(BigDecimal cost) { this.cost = cost; }
    public void setReturns(int returns) { this.returns = returns; }

}
