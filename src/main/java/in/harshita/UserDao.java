package in.harshita;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserDao implements InitializingBean, DisposableBean {
	public void afterPropertiesSet() {
		System.out.println("Class object Initializing");
	}

	public void destroy() {
		System.out.println("Class object destroying");
	}

	public void getData() {
		System.out.println("Getting Data");
	}

}
