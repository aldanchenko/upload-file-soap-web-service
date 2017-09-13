package ua.examples.cxf.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBoot application.
 */
@ComponentScan("ua.examples.cxf.server")
@SpringBootApplication
public class SpringCxfApplication {

    /**
     * Main entry method.
     *
     * @param args  -   console arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringCxfApplication.class, args);
    }
}
