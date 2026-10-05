package springwiring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springwiring.AccountRepImpl;
import springwiring.AccountServiceImpl;

@Configuration 
@ComponentScan(basePackages = "springwiring")
public class SpringConfig {


    @Bean //replacing <bean> tag in xml file 
    public AccountServiceImpl abcd(){
        return new AccountServiceImpl(); //this obj registered in spring container
    }   
   /* @Bean 
    public AccountRepImpl mmmmm(){
        return new AccountRepImpl(); //thi objs registered in spring container
    }*/

    }

