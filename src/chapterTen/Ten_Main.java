package chapterTen;

import innerClass.CallBacks;
import innerClass.Factory;
import innerClass.Parcel;
import innerClass.Parcel5;
import innerClass.Parcel8;
import innerClass.Sequence;
import interfaceInner.AchieveCInterface;

import static net.mylocal.util.Print.*;

import controlClasses.GreenHouseControler;

public class Ten_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("——————————————Parcel：");
		Parcel.parcel_test();
		
		print("——————————————Sequence：");
		Sequence.sequence_test();
		
		print();
		print("——————————————Parcel5：");
		Parcel5.parcel_test();
		
		print("——————————————Parcel8：");
		Parcel8.Parcel8_test();
		
		print("——————————————Factory：");
		Factory.fctories_test();
		
		print("——————————————Factory：");
		AchieveCInterface.acInterface_test();
		
		print("——————————————CallBacks：");
		CallBacks.callBacks_test();
		
		print("——————————————GreenHouseControler：");
		GreenHouseControler.greenHC_test(args);
	}
}
