package Ch03.sub1;

/*
 * 날짜 : 2023/09/19
 * 이름 : 이성찬
 * 내용 : Proxy기반 AOP 실습
 * 
 * 
 */

public class ProxyTest {
	public static void main(String[] args) {
		
		Target target = new TargetImpl();
		Target proxy = new TargetProxy(target);
		
		proxy.doBusiness();
		
		
	}
}
