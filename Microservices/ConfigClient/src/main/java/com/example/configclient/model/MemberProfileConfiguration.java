package com.example.configclient.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MemberProfileConfiguration {

    @Autowired
    Environment environment;

    public String getDefaultModel() {
        return environment.getProperty("report.export.type");
    }

    public String getRentPeriod() {
        return environment.getProperty("report.page.color");
    }

}
