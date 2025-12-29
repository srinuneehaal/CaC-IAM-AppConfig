package com.sample.azureappconfig;

import com.sample.azureappconfig.config.IamAdaptorProperties;
import com.sample.azureappconfig.config.props.CosmosStateProperties;
import com.sample.azureappconfig.config.props.FileLocationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@ConfigurationPropertiesScan
//@EnableConfigurationProperties({IamAdaptorProperties.class, CosmosStateProperties.class, FileLocationProperties.class})
public class AzureAppConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzureAppConfigApplication.class, args);
    }

}
