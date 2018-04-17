package innerClass;

public class Parcel {
	private String s = "s:dbscjdc";
	
	private void privateFunc(){
		System.out.println("Parcel.privateFunc");
	}
	
	class ChangeStr{
		void changeStr_test(){
			s = "s:s has changed!";
			privateFunc();
		}
	}
	
	public static void parcel_test(){
		Parcel p = new Parcel("s:fwenkwe");
		p.ship("Tasmania");
//		Parcel.Contents c = p.contents();
		Contents c = new Contents();
		Parcel.Destination d = p.to("ChongQin");
		System.out.println(d.readLable());
		
//		Parcel.Inner inner = p.getInner();
		Parcel.Inner inner = p.new Inner();
		System.out.println(inner);
		
		Parcel.ChangeStr cs = p.new ChangeStr();
		cs.changeStr_test();
		System.out.println(inner);
	}
	
	Parcel(String s){
		this.s = s;
	}
	
	static class Contents{
		private int i = 11;
		public int value() {
			return i;
		}
		static class ContentsInner{
			
		}
	}
	
	class Inner{
		@Override
		public String toString(){
			return s;
		}
	}
	
	class Destination{
		private String lable;
		Destination(String whereTo){
			lable = whereTo;
		}
		String readLable(){
			return lable;
		}
	}
	
	public Inner getInner(){
		return new Inner();
	}
	
	public Destination to(String s){
		return new Destination(s);
	}
	
	public Contents contents(){
		return new Contents();
	}
	
	public void ship(String dest){
		Destination d = to(dest);
		Contents c = contents();
		System.out.println(d.readLable());
	}
}
