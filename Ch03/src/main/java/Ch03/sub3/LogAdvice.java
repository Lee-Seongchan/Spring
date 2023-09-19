package Ch03.sub3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component("log")
public class LogAdvice {
	
	@Pointcut("execution(void Ch03.sub3.Service.insert())")
	public void insertPointcut() {} //내용이 없는 참조 메서드
	
	@Pointcut("execution(void Ch03.sub3.Service.select(..))")
	public void selectPointcut() {} //내용이 없는 참조 메서드
	
	@Pointcut("execution(void Ch03.sub3.Service.update(*))")
	public void updatePointcut() {} //내용이 없는 참조 메서드
	
	@Pointcut("execution(void Ch03.sub3.Service.delete(*,*))")
	public void deletePointcut() {} //내용이 없는 참조 메서드
	
	@Before("insertPointcut() || selectPointcut() || updatePointcut() || deletePointcut() ")
	public void beforeLog(){
		System.out.println("-------------------------------");
		System.out.println("cross-cutting - beforeLog...");
	}
	
	@After("insertPointcut() || selectPointcut() || updatePointcut() || deletePointcut() ")
	public void afterLog() {
		System.out.println("cross-cutting - afterLog...");
		System.out.println("-------------------------------");
	}
}
