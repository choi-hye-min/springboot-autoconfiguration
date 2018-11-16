package com.arthur.arthurspirngbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HolomanReunner implements ApplicationRunner {

    @Autowired
    Holoman holoman;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(holoman);

    }
}
