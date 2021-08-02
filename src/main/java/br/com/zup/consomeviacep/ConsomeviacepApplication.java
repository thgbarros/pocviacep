package br.com.zup.consomeviacep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ConsomeviacepApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsomeviacepApplication.class, args);
    }

}
