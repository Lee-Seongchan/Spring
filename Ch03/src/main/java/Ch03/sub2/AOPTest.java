package Ch03.sub2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2023/09/19
 * 이름 : 이성찬
 * 내용 : 스프링 XML기반 AOP 실습하기 
 * 
 */
public class AOPTest {
	public static void main(String[] args) {
		
		//스프링 컨텍스트 객체 생성(컨테이너)
		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
		
		//Service 객체 가져오기
		Service service = (Service)ctx.getBean("service1");		
		
		//핵심 관심 실행 
		service.insert();
		service.select();
		service.update(1);
		service.delete(1, "홍길동");
	}
}
