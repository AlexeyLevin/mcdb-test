package ru.moex.api.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(basePackages = "ru.moex.api", includeFilters = @ComponentScan.Filter({Service.class, Repository.class}))
public class ApplicationContext {
}
