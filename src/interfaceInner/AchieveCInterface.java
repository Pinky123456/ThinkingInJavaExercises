package interfaceInner;

public class AchieveCInterface implements ClassInterface{
	public void howdy(){
		System.out.println("This is howby()");
		
	}
	public static void acInterface_test(){
		ClassInterface c = new AchieveCInterface();
		Test.test(c);
	}
}

class TestAI{
	public void test(){
		ClassInterface c = new AchieveCInterface();
		ClassInterface.Test.test(c);
	}
}