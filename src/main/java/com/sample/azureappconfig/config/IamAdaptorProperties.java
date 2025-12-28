package com.sample.azureappconfig.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
//@ConfigurationProperties(prefix = "iamadaptor")
@RefreshScope
@ConfigurationProperties
public class IamAdaptorProperties {


    @Value( "${azure.cosmos.container}")
    private String azureCosmosContainer;
    @Value( "${azure.cosmos.database}")
    private String azureCosmosDatabase;
    @Value( "${azure.cosmos.key}")
    private String azureCosmosKey;
    @Value( "${azure.cosmos.partitionkey}")
    private String azureCosmosPartitionKey;
    @Value( "${azure.cosmos.uri}")
    private String azureCosmosUri;
@Value( "${cacex.paths.changed-files-dir}")
    private String changedFilesDir;
    @Value( "${cacex.paths.master-plan-file}")
    private String masterPlanFile;
    @Value( "${cacex.report.master-plan-report-enabled}")
    private boolean masterPlanReportEnabled;
    private String message;
    @Value( "${cacex.paths.plan-dir}")
    private String planDir;

    @Override
    public String toString() {

        return "IamAdaptorProperties{" +
                "azureCosmosContainer='" + azureCosmosContainer + '\'' +
                ", azureCosmosDatabase='" + azureCosmosDatabase + '\'' +
                ", azureCosmosKey='" + azureCosmosKey + '\'' +
                ", azureCosmosPartitionKey='" + azureCosmosPartitionKey + '\'' +
                ", azureCosmosUri='" + azureCosmosUri + '\'' +
                ", changedFilesDir='" + changedFilesDir + '\'' +
                ", masterPlanFile='" + masterPlanFile + '\'' +
                ", masterPlanReportEnabled=" + masterPlanReportEnabled +
                ", message='" + message + '\'' +
                ", planDir='" + planDir + '\'' +
                '}';

     }
}
