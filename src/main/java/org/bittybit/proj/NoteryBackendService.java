package org.bittybit.proj;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Notery Service", version = "2.0.1"))
public class NoteryBackendService {
    public static void main(String[] args) {
        SpringApplication.run(NoteryBackendService.class, args);
    }
}
