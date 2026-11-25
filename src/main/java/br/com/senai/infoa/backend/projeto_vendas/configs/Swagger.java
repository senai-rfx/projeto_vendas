package br.com.senai.infoa.backend.projeto_vendas.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
  info = @Info(
    title = "projeto-vendas",
    version = "1.0",
    description = "API para gerenciamento de vendas"
  )
)
public class Swagger {

}

