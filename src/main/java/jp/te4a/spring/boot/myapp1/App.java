package jp.te4a.spring.boot.myapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class App 
{
    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }
}
