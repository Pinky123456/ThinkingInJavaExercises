package interfaceInner;

public interface ClassInterface {
	void howdy();
	class Test{

		public static void test(ClassInterface cinter) {
			// TODO Auto-generated method stub
			cinter.howdy();
			System.out.println("This is test()");
		} 
		
	}
}