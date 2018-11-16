package com.arthur.arthurspirngbootstarter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HolomanConfiguration {

    @Bean
    public Holoman holoman(){
        Holoman holoman = new Holoman();
        holoman.setHowLong(5);
        holoman.setName("Arthur");
        return holoman;
    }
}
