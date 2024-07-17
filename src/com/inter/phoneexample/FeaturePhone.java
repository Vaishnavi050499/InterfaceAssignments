package com.inter.phoneexample;

public class FeaturePhone implements IMobile {

	@Override
	public void call() {
		System.out.println("Calling the user using buttons");

	}

	@Override
	public void message() {
		System.out.println("SMS Messaging services");

	}

}
