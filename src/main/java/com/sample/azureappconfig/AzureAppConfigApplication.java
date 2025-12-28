package com.sample.azureappconfig;

import com.sample.azureappconfig.config.IamAdaptorProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({IamAdaptorProperties.class})
public class AzureAppConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzureAppConfigApplication.class, args);
    }

}
