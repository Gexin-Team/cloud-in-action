package org.gexin.cloud.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;


/**
 * @see org.springframework.boot.autoconfigure.SpringBootApplication  Annotate SpringBoot Application
 * @see org.springframework.cloud.config.server.EnableConfigServer    Annotate ConfigServer Application
 *
 * Created by Rapharino on 2016/10/16.
 */
@SpringBootApplication
@EnableConfigServer
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext = SpringApplication
                .run(Application.class, args);
        Environment environment = configurableApplicationContext.getEnvironment();

        LOGGER.info("Server with active profiles:{} is running at http://{}:{}",environment.getActiveProfiles(),environment.getProperty("server.address"), environment.getProperty("server.port"));
    }
}
