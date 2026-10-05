
package springwiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springwiring.config.SpringConfig;

public class App {
      public static void main(String[] args) {
       // ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext ctx=
        new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService service= (AccountService)ctx.getBean("abcd");
        System.out.println(service.creditService(50000));
    }
}
