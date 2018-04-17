package innerClass;

interface Destination{
	String readLable();
}

interface Contents{
	int value();
}

public class Parcel5 {
	private String s = "s:dbscjdc";
	Parcel5(String s){
		this.s = s;
	}
	
	private class PContents implements Contents{
		private int value = 6;
		private PContents(int v){
			value = v;
		}
		@Override
		public int value() {
			// TODO Auto-generated method stub
			return value;
		}
	}
	
	public Contents getPrivateContents(int v){
		return new PContents(v);
	}
	
	public Contents getFuncContents(){
		class PContents implements Contents{
			private int value = 6;
			@Override
			public int value() {
				// TODO Auto-generated method stub
				return value;
			}
		}
		return new PContents();
	}

	public Destination destination(String dest, float price){
		return new Destination(){
			private int cost;
			{
				cost = Math.round(price);
				if(cost>100)
					System.out.println(price + " Over budge!");
			}
			private String lable = dest;
			@Override
			public String readLable() {
				return lable;
			}
		};
	}
	
	public static void parcel_test(){
		Parcel5 parcel = new Parcel5("dest");
		
		int i= parcel.getFuncContents().value();
		System.out.println(i);
		
		Parcel5Test.Parcel5T_test();
	}
}

class Parcel5Test{
	public static void Parcel5T_test(){
		Parcel5 parcel = new Parcel5("parcelTest");
		Contents c = parcel.getPrivateContents(520);
		System.out.println(c.value());
		Destination d = parcel.destination("Tanimas", 101.98f);
	}
}
