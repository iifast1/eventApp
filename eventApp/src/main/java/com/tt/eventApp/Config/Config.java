package com.tt.eventApp.Config;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EnableJpaRepositories(basePackages="com.tt.eventApp.Repository")
public class Config  {



}

