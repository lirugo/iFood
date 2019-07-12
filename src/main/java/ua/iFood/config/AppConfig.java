package ua.iFood.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
@ComponentScan("ua.iFood.*")
@Import(RepositoryRestMvcConfiguration.class)
public class AppConfig {
}