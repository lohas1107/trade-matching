package cc.secondbrain.trade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class E2eApplication {
    public static void main(String[] args) {
        SpringApplication.run(E2eApplication.class, args);
    }
}
