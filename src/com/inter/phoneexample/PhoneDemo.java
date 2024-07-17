package com.inter.phoneexample;

public class PhoneDemo {

	public static void main(String[] args) {
		
		ISmartPhone iSmartPhone = new SmartPhone();
		iSmartPhone.call();
		iSmartPhone.message();
		iSmartPhone.watch();
		String[] apps = iSmartPhone.showApps();
		
		
		for(String app : apps)
		{
			System.out.println(app);
		}
		
//		IMobile mobile = new FeaturePhone();
//		mobile.call();
//		mobile.message();

	}

}
