package com.mphasis.springaop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.mphasis.springaop"})
@EnableAspectJAutoProxy
public class SpringConfig {

}
