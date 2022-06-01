package br.com.ecommerce.ecommercemain.clients;

import br.com.ecommerce.ecommercemain.dtos.UserLoginDTO;
import br.com.ecommerce.ecommercemain.dtos.UserResponseDTO;
import br.com.ecommerce.ecommercemain.dtos.UserSaveDTO;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="users")
public interface UserClient {
    @PostMapping("/login")
    @CircuitBreaker(name = "servico")
    UserResponseDTO login(UserLoginDTO userLoginDTO);

    @PostMapping("/save")
    @CircuitBreaker(name = "servico")
    void save(UserSaveDTO userSaveDTO);
}
