package com.sample.azureappconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AzureBootConfig {

    @Bean
    public AzureAppConfigCustomization getAzureAppConfigCustomization() {
        return new AzureAppConfigCustomization();
    }
}