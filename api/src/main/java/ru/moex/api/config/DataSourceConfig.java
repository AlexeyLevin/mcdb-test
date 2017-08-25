package ru.moex.api.config;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.yandex.qatools.embed.postgresql.EmbeddedPostgres;

import javax.sql.DataSource;

import java.io.File;
import java.util.Collections;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;
import static ru.yandex.qatools.embed.postgresql.EmbeddedPostgres.cachedRuntimeConfig;
import static ru.yandex.qatools.embed.postgresql.distribution.Version.Main.V9_6;

@Configuration
@PropertySource("classpath:hibernate.properties")
class DataSourceConfig {

    protected static final String HOST = "localhost";
    protected static final int PORT = 5432;
    protected static final String DB_NAME = "postgres";
    private final Environment environment;

    @Autowired
    public DataSourceConfig(Environment environment) {
        this.environment = environment;
    }

    @Scope(SCOPE_SINGLETON)
    @Bean(destroyMethod = "stop")
    @SneakyThrows
    public EmbeddedPostgres embeddedPostgres() {
        final String user = environment.getRequiredProperty("jdbc.username");
        final String password = environment.getRequiredProperty("jdbc.password");

        final EmbeddedPostgres postgres = new EmbeddedPostgres(V9_6);
        File file = new File("C:\\Users\\LevinAY\\.embedpostgresql");
        if (file.exists()) {
            postgres.start(cachedRuntimeConfig(file.toPath()),
                    HOST, PORT, DB_NAME, user, password, Collections.emptyList());
        } else {
            postgres.start(HOST, PORT, DB_NAME, user, password);
        }
        return postgres;
    }


    @Bean
    @DependsOn("embeddedPostgres")
    public DataSource dataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        return dataSource;
    }
}