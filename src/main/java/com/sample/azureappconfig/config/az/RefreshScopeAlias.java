package com.sample.azureappconfig.config.az;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.annotation.AliasFor;

/**
 * Replacement for {@code @RefreshScope} that uses explicit aliasing to avoid
 * the Spring Framework 6.2 deprecation around convention-based overrides.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Scope("refresh")
public @interface RefreshScopeAlias {

    @AliasFor(annotation = Scope.class, attribute = "proxyMode")
    ScopedProxyMode proxyMode() default ScopedProxyMode.TARGET_CLASS;
}
