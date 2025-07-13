package com.cognizant.spring2_country;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring2CountryApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(Spring2CountryApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(Spring2CountryApplication.class, args);
        displayCountry();
    }

    public static void displayCountry() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        LOGGER.debug("Country details loaded from XML: {}", country);
    }
}
