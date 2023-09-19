package Ch03.sub1;

public class TargetProxy implements Target{

	private Target target;
	
	public TargetProxy(Target target) {
		this.target = target;
	}
	
	
	public void before() {
		System.out.println("cross-cutting before....");
	}
	
	public void after() {
		System.out.println("cross-cutting after....");
	}
	
	@Override
	public void doBusiness() {
		before();
		target.doBusiness();
		after();
	}
	
}
