package lcn29.github.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServe {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServe.class, args);
    }
}
