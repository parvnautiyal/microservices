package com.project.third.cards.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "cards")
@Getter
@Setter
@ToString
public class CardsServiceConfig {
    private String msg;
    private String buildVersion;
}
