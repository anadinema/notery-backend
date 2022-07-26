package org.bittybit.proj.backend;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.extensions.Extension;
import io.swagger.v3.oas.annotations.extensions.ExtensionProperty;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Notery Service", version = "2.0.1",
        extensions = @Extension(
        properties = {
                @ExtensionProperty(name = "x-attributes", value = "[{\"key\":\"Api\",\"value\":\"Idsgsal\"}," +
                        "{\"key\":\"Business Owner Name\",\"value\":\"safsaf\"}]", parseValue = true)
        })))
public class NoteryBackendService {
    public static void main(String[] args) {
        SpringApplication.run(NoteryBackendService.class, args);
    }
}
