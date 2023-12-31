package uk.co.gamma.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class AddressLookupApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddressLookupApplication.class, args);
    }
}
