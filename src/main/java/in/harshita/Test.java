package in.harshita;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("Bean.xml");
		UserDao dao = cxt.getBean(UserDao.class);
		dao.getData();
		ConfigurableApplicationContext ccxt = (ConfigurableApplicationContext) cxt;
		ccxt.close();
	}

}
