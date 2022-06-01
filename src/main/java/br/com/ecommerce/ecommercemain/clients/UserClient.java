package br.com.ecommerce.ecommercemain.clients;

import br.com.ecommerce.ecommercemain.dtos.UserLoginDTO;
import br.com.ecommerce.ecommercemain.dtos.UserResponseDTO;
import br.com.ecommerce.ecommercemain.dtos.UserSaveDTO;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="users")
@LoadBalancerClient(name = "users")
public interface UserClient {
    @PostMapping("/login")
    @CircuitBreaker(name = "servico")
    UserResponseDTO login(@RequestBody UserLoginDTO userLoginDTO);

    @PostMapping("/save")
    @CircuitBreaker(name = "servico")
    void save(@RequestBody UserSaveDTO userSaveDTO);
}
