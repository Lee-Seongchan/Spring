package sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2023/09/18
 * 이름 : 이성찬
 * 내용 : Spring IoC 실습하기 
 * 
 * IoC 
 * - Inversion of Control(제어의 역전)의미로 객체의 생성, 소멸 등 관리를 컨테이너에서 담당
 * - 일반적인 컨테이너는 IoC 컨테이너 즉 Spring Container를 말함
 * 
 */
public class IocMain {
	public static void main(String[] args) {
		
	//스프링 컨텍스트(컨네이너) 객체 생성
	ApplicationContext ctx =  new GenericXmlApplicationContext("application.xml");
	
	LgTv lg = (LgTv)ctx.getBean("lg");
	lg.powerOn();
	lg.soundUp();
	lg.soundDown();
	lg.powerOff();

	
		
		
	}
}
