package br.com.ecommerce.ecommercemain.clients;

import br.com.ecommerce.ecommercemain.dtos.UserLoginDTO;
import br.com.ecommerce.ecommercemain.dtos.UserResponseDTO;
import br.com.ecommerce.ecommercemain.dtos.UserSaveDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="users")
//@LoadBalancerClient(name = "users")
public interface UserClient {
    @PostMapping("/v1/users/login")
//    @CircuitBreaker(name = "servico")
    UserResponseDTO login(@RequestBody UserLoginDTO userLoginDTO);

    @PostMapping("/v1/users")
//    @CircuitBreaker(name = "servico")
    void save(@RequestBody UserSaveDTO userSaveDTO);
}
