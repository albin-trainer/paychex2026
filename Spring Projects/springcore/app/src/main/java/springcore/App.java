package springcore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.beans.HelloBean;
public class App {
      public static void main(String[] args) {
        // initialize the spring container
        ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Spring container initialized ...");
        
        HelloBean bean=(HelloBean)ctx.getBean("h");
        System.out.println(bean.sayHello("Albin"));
        HelloBean bean2=(HelloBean)ctx.getBean("h");
        System.out.println(bean==bean2); //chks the reference

    }
}
