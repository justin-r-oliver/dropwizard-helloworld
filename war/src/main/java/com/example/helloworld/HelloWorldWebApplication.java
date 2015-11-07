package com.example.helloworld;

import be.fluid_it.tools.dropwizard.box.WebApplication;

import javax.servlet.annotation.WebListener;

@WebListener
public class HelloWorldWebApplication extends WebApplication<HelloWorldConfiguration> {
    public HelloWorldWebApplication() {
        super(new HelloWorldApplication(), "hello-world.yml");
    }
}
