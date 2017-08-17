package ru.moex.api.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import static ru.moex.api.config.ApplicationContext.BASE_PACKAGE;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = BASE_PACKAGE, includeFilters = @Filter(RestController.class))
public class WebConfig extends WebMvcConfigurerAdapter {
}
