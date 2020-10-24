import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {

    public static void main(String[] args) {
        BeanFactory container = new ClassPathXmlApplicationContext("config.xml");
        Mentor mentor = (Mentor) container.getBean("fullTimeMentor");
        mentor.createAccount();

        Mentor mentor1 =(Mentor) container.getBean("partTimeMentor");
        mentor1.createAccount();

        //the same thing with application context and without down casting
        ApplicationContext container1 = new ClassPathXmlApplicationContext("config.xml");
        Mentor mentor2 =  container1.getBean("fullTimeMentor", Mentor.class);
        mentor2.createAccount();

    }
}
