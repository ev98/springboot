package com.ev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/*
* 1.开启基于注解的缓存 @EnableCaching
* 2.标注缓存注解即可
*       @Cacheable
*       @CacheEvict
*       @CachePut
* */

@EnableCaching
@SpringBootApplication
public class Springboot08CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot08CacheApplication.class, args);
    }

}
