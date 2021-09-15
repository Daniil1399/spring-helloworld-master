import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanHell =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHell.getMessage());

        Cat beanCat = (Cat) applicationContext.getBean("Cat");
        System.out.println(beanCat.getMassage());

        Cat beanCat2 = (Cat) applicationContext.getBean("Cat");
        System.out.println(beanCat2.getMassage());

        System.out.println(bean == beanHell);
        System.out.println(beanCat == beanCat2);

    }
}