package com.sample.azureappconfig.controller;


import com.sample.azureappconfig.config.IamAdaptorProperties;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class AppRunner implements ApplicationRunner {

    private final ConfigurableApplicationContext context;
    private final IamAdaptorProperties iamAdaptorProperties;


    public AppRunner(ConfigurableApplicationContext context, IamAdaptorProperties iamAdaptorProperties) {
        this.context = context;
        this.iamAdaptorProperties = iamAdaptorProperties;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("UserControllerComponent initialized on startup.");
        System.out.println("iamAdaptor==>" + iamAdaptorProperties.toString());
    }


}
