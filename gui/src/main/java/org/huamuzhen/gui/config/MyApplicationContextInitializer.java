package org.huamuzhen.gui.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;


public class MyApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {


    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("just a test!!!!");

    }
}
