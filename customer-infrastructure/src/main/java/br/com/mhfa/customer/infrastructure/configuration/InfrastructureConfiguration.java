package br.com.mhfa.customer.infrastructure.configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "br.com.mhfa.customer.infrastructure.service.client")
public class InfrastructureConfiguration {
}
