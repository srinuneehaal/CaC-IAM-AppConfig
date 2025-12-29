package com.sample.azureappconfig.controller;


import com.sample.azureappconfig.config.IamAdaptorProperties;
import com.sample.azureappconfig.config.PlanOrderingProperties;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class AppRunner implements ApplicationRunner {

    private final ConfigurableApplicationContext context;
    private final IamAdaptorProperties iamAdaptorProperties;
    private final PlanOrderingProperties planOrderingProperties;


    public AppRunner(ConfigurableApplicationContext context, IamAdaptorProperties iamAdaptorProperties, PlanOrderingProperties planOrderingProperties) {
        this.context = context;
        this.iamAdaptorProperties = iamAdaptorProperties;
        this.planOrderingProperties = planOrderingProperties;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("UserControllerComponent initialized on startup.");
        System.out.println("iamAdaptor==>" + iamAdaptorProperties.toString());
        planOrderingProperties.getRules().forEach(rule ->
                System.out.println("PlanOrderingRule==> Category: " + rule.getCategory() + ", Actions: " + rule.getActions())


        );

    }


}
