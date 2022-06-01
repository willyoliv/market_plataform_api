package br.com.ecommerce.ecommercemain.dtos;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductDTO(
                         UUID productCode,
                         String name,
                         String description,
                         String category,
                         BigDecimal price,
                         Integer quantity) {
}
