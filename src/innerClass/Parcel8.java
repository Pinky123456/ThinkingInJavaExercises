package innerClass;

public class Parcel8 {
	public Wrapping wrapping(int x){
		return new Wrapping(x){
			@Override
			public int value(){
				return super.value()*2;
			}
		};
	}
	
	public static void Parcel8_test(){
		Parcel8 p = new Parcel8();
		System.out.println(p.wrapping(5).value());
	}
}

class Wrapping{
	private int i;
	public Wrapping(int x){
		i = x;
	}
	public int value(){
		return i;
	}
}

class Pwrap extends Wrapping{
	Pwrap(int x){
		super(x);
	}
}