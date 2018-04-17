package innerClass;
import static net.mylocal.util.Print.*;

public class CallBacks {
	public static void callBacks_test(){
		Callee_one c1 = new Callee_one();
		Callee_two c2 = new Callee_two();
		MyIncrement.f(c2);
		Caller caller1 = new Caller(c1);
		Caller caller2 = new Caller(c2.getCallbackReference());
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();
	}
}

interface Incrementable{
	void increment();
}

class Callee_one implements Incrementable{
	private int i = 0;
	@Override
	public void increment() {
		i++;
		print(i);
	}
}

class MyIncrement{
	public void increment(){
		print("Other operation");
	}
	static void f(MyIncrement mi){
		mi.increment();
	}
}

class Callee_two extends MyIncrement{
	private int i = 0;
	
	@Override
	public void increment(){
		super.increment();
		i++;
		print(i);
	}
	
	private class Closure implements Incrementable{
		@Override
		public void increment() {
			// TODO Auto-generated method stub
			Callee_two.this.increment();
		}
	}
	
	Incrementable getCallbackReference(){
		return new Closure();
	}
}

class Caller{
	private Incrementable callbackReference;
	Caller(Incrementable call){
		callbackReference = call;
	}
	void go(){
		callbackReference.increment();
	}
}