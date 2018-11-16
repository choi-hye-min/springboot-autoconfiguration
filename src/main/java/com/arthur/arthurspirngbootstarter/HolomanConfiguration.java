package com.arthur.arthurspirngbootstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({HolomanProperties.class, CatProperties.class})
public class HolomanConfiguration {

    @Bean
    @ConditionalOnMissingBean // 다른 빈이 없을시에만 빈으로 생성
    public Holoman holoman(HolomanProperties holomanProperties, CatProperties catProperties){

        Holoman holoman = new Holoman();
        holoman.setHowLong(holomanProperties.getHowLong());
        holoman.setName(holomanProperties.getName());

        holoman.setCatAge(catProperties.getAge());
        holoman.setCatName(catProperties.getName());

        return holoman;
    }
}
