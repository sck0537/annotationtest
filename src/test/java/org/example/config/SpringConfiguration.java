package org.example.config;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan( basePackages = "org.example")
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {


}
