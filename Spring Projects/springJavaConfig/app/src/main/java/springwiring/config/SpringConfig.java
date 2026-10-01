package springwiring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springwiring.AccountRepImpl;
import springwiring.AccountServiceImpl;

@Configuration 
public class SpringConfig {


    @Bean("service") //replacing <bean> tag in xml file 
    public AccountServiceImpl abcd(){
        return new AccountServiceImpl(); //thi obj registered in spring container
    }
    @Bean 
    public AccountRepImpl mmmmm(){
        return new AccountRepImpl(); //thi obj registered in spring container
    }
    }

