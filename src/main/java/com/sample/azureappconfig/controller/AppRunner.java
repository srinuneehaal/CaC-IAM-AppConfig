package com.sample.azureappconfig.controller;


import com.sample.azureappconfig.config.IamAdaptorProperties;
import com.sample.azureappconfig.config.PlanOrderingProperties;
import com.sample.azureappconfig.config.props.CosmosStateProperties;
import com.sample.azureappconfig.config.props.FileLocationProperties;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class AppRunner implements ApplicationRunner {

    private final ConfigurableApplicationContext context;
    private final IamAdaptorProperties iamAdaptorProperties;
    private final PlanOrderingProperties planOrderingProperties;

    private final FileLocationProperties fileLocationProperties;
    private final CosmosStateProperties cosmosStateProperties;

    public AppRunner(ConfigurableApplicationContext context, IamAdaptorProperties iamAdaptorProperties, PlanOrderingProperties planOrderingProperties, FileLocationProperties fileLocationProperties, CosmosStateProperties cosmosStateProperties) {
        this.context = context;
        this.iamAdaptorProperties = iamAdaptorProperties;
        this.planOrderingProperties = planOrderingProperties;
        this.fileLocationProperties = fileLocationProperties;
        this.cosmosStateProperties = cosmosStateProperties;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("UserControllerComponent initialized on startup.");
        System.out.println("iamAdaptor==>" + iamAdaptorProperties.toString());
        planOrderingProperties.getRules().forEach(rule ->
                System.out.println("PlanOrderingRule==> Category: " + rule.getCategory() + ", Actions: " + rule.getActions())


        );

        System.out.println("fileLocationProperties==>" + fileLocationProperties.toString());
        System.out.println("cosmosStateProperties==>" + cosmosStateProperties.toString());


    }


}
