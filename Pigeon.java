package com.qa.qacommunity4;

public class Pigeon implements Birds, Animals {

	@Override
	public void hasWings() {
		System.out.println("I have wings");
	}

	@Override
	public void hasBeaks() {	
		System.out.println("I have a beak");
	}

	@Override
	public void hasFeathers() {	
		System.out.println("I have feathers");
	}

	@Override
	public void internalDisgestion() {
		System.out.println("I have an internal digestion");
	}

	@Override
	public void sensoryOrgans() {
		System.out.println("I have sensory organs");
	}

	@Override
	public void eukaryotes() {
		System.out.println("I am an eukaryote");
	}

}
