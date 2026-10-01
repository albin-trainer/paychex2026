
package springwiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  

    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathxmlApplicationContext("beans.xml");
        AccountService service= (AccountService)ctx.getBean("service");
        System.out.println(service.creditService(50000));
    }
}
