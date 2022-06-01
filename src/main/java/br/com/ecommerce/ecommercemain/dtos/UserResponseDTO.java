package br.com.ecommerce.ecommercemain.dtos;

import java.util.UUID;

public record UserResponseDTO(UUID userCode, String email, String fullName, String role){
}
