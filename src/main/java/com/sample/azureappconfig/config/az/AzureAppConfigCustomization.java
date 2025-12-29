package com.sample.azureappconfig.config.az;

import com.azure.core.credential.TokenCredential;
import com.azure.data.appconfiguration.ConfigurationClientBuilder;
import com.azure.identity.AzureCliCredentialBuilder;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClientBuilder;
import com.azure.spring.cloud.config.ConfigurationClientBuilderSetup;
import com.azure.spring.cloud.config.SecretClientBuilderSetup;
import org.springframework.beans.factory.annotation.Value;

/**
 * Customizes App Configuration and Key Vault clients to use CLI locally and DefaultAzureCredential elsewhere.
 */
public class AzureAppConfigCustomization implements ConfigurationClientBuilderSetup, SecretClientBuilderSetup {

    @Value("${spring.profiles.active:local}")
    private String env;

    public AzureAppConfigCustomization() {
    }

    @Override
    public void setup(SecretClientBuilder builder, String endpoint) {
        builder.credential(this.getTokenCredential());
    }

    @Override
    public void setup(ConfigurationClientBuilder builder, String endpoint) {
        builder.credential(this.getTokenCredential());
    }

    private TokenCredential getTokenCredential() {
        return (TokenCredential) ("local".equalsIgnoreCase(this.env) ? (new AzureCliCredentialBuilder()).build() : (new DefaultAzureCredentialBuilder()).build());
    }
}
