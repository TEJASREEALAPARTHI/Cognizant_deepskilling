package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        countryService = context.getBean(CountryService.class);

        LOGGER.info("Inside main");

        //testGetCountry();
        //testAddCountry();
        //testUpdateCountry();
        //testDeleteCountry();
        testSearchCountry();
    }

    private static void testGetCountry() {

        LOGGER.info("Start");

        Country country =
                countryService.getCountry("IN");

        LOGGER.debug("Country={}", country);

        LOGGER.info("End");
    }

    private static void testAddCountry() {

        Country country = new Country();

        country.setCode("NP");

        country.setName("Nepal");

        countryService.addCountry(country);

        LOGGER.info("Country Added");
    }

    private static void testUpdateCountry() {

        Country country =
                countryService.getCountry("IN");

        country.setName("Republic of India");

        countryService.updateCountry(country);

        LOGGER.info("Country Updated");
    }

    private static void testDeleteCountry() {

        countryService.deleteCountry("NP");

        LOGGER.info("Country Deleted");
    }

    private static void testSearchCountry() {

        List<Country> countries =
                countryService.searchCountries("Uni");

        LOGGER.debug("Countries={}", countries);
    }
}
