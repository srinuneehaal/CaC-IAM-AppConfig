package com.sample.azureappconfig.config.props;

@FunctionalInterface
public interface EnvironmentLookup {

    String lookup(String key);
}
