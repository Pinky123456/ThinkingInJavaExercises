package innerClass;

import static net.mylocal.util.Print.print;

public class Factory {
	public static void fctories_test(){
		seviceConsumer(Implementation1.factory);
		seviceConsumer(Implementation2.factory);
	}
	
	public static void seviceConsumer(ServiceFactory factory){
		Service s = factory.getService();
		s.method1();
		s.method2();
	}
}

interface Service{
	void method1();
	void method2();
}

interface ServiceFactory{
	Service getService();
}

class Implementation1 implements Service{
	private Implementation1(){};
	@Override
	public void method1() {
		print("Implementation1 method1");
	}

	@Override
	public void method2() {
		print("Implementation1 method2");
	}
	
	public static ServiceFactory factory = 
			new ServiceFactory(){

				@Override
				public Service getService() {
					// TODO Auto-generated method stub
					return new Implementation1();
				}
			};
}

class Implementation2 implements Service{
	private Implementation2(){};
	@Override
	public void method1() {
		print("Implementation2 method1");
	}

	@Override
	public void method2() {
		print("Implementation2 method2");
	}
	
	public static ServiceFactory factory = 
			new ServiceFactory(){

				@Override
				public Service getService() {
					// TODO Auto-generated method stub
					return new Implementation2();
				}
			};
}