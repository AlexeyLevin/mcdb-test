package ru.moex.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
//import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EntityScan(basePackages = "ru.moex.api.**.model"/*, basePackageClasses = Jsr310JpaConverters.class*/)
//@EnableSwagger2
//@Import(SpringDataRestConfiguration.class)
public class Api {
    public static void main(String[] args) {
        SpringApplication.run(Api.class, args);
    }
}
