package com.project.second.loans.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "loans")
@Getter
@Setter
@ToString
public class LoansServiceConfig {
    private String msg;
    private String buildVersion;
}
