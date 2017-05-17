package ru.moex.api.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import static ru.moex.api.config.ApplicationContext.BASE_PACKAGE;

@Configuration
@ComponentScan(basePackages = BASE_PACKAGE, includeFilters = @Filter({Service.class, Repository.class}))
public class ApplicationContext {
    public static final String BASE_PACKAGE = "ru.moex.api";
}
