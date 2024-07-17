package com.inter.phoneexample;

public class SmartPhone extends FeaturePhone implements ISmartPhone {

	@Override
	public String[] showApps() {
	 return new String[]{"WhatsApp","FB","Instagram"};
	}
	

	@Override
	public void watch() {
		System.out.println("Watch movies and youtube in Smartphone");

	}


	@Override
	public void call() {
		System.out.println("Calling using touchScreen");
	}


	@Override
	public void message() {
		System.out.println("Message using WhatsApp");
	}

}
