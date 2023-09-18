package sub2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 *	날짜 : 2023/09/18
 *	이름 : 이성찬
 *	내용 : Spring IoC 실습하기
 * 
 *  DI
 *  - DI : Dependency Injection 의존성 주입 의미로 객체를 생성하는 방식이 아닌 컨테이너로 부터 주입 받는 방식
 *  - 생성자, 세터, 필드 3가지 주입 방식
 *  - @Component 선언으로 객체를 컨테이너에 관리/등록
 *  - @Component @Controller, @Service, @Repository로 세분화
 */

public class SpringContainerTest {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
		
		Computer com = (Computer)ctx.getBean("com");
		com.show();
	
	}
}
