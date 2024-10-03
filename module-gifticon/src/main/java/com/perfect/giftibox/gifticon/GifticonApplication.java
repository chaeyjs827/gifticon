package com.perfect.giftibox.gifticon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.perfect.giftibox.gifticon", "com.perfect.giftibox.infra"})
public class GifticonApplication {

    public static void main(String[] args) {
        SpringApplication.run(GifticonApplication.class, args);
    }

}
