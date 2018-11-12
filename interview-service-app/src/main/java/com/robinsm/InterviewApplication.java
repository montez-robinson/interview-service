package com.robinsm;

import com.robinsm.interview.DefaultInterviewService;
import com.robinsm.interview.InterviewService;
import com.robinsm.interview.exception.InterviewNotFoundExceptionMapper;
import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * The type Interview application.
 *
 * @author montez.robinson robinsm@live.com
 */
@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.robinsm")
public class InterviewApplication extends ResourceConfig {

    /**
     * Instantiates a new Interview application.
     */
    public InterviewApplication() {
        this.register(InterviewService.class);
        this.register(InterviewNotFoundExceptionMapper.class);
        this.register(ApiListingResource.class);
        this.register(SwaggerSerializers.class);
        BeanConfig config = new BeanConfig();
        config.setConfigId("interview-service");
        config.setTitle("Inteview Service - Jax RS Jersey Sample Service");
        config.setVersion("0.0.1");
        config.setBasePath("/services/rest");
        config.setResourcePackage("com.robinsm");
        config.setPrettyPrint(true);
        config.setScan(true);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(InterviewApplication.class, args);
    }

    /**
     * Interview service interview service.
     *
     * @return the interview service
     */
    @Bean
    public InterviewService interviewService() {
        return new DefaultInterviewService();
    }
}
