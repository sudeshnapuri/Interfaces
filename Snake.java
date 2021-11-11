package com.qa.qacommunity4;

public class Snake implements Reptiles, Animals {

	@Override
	public void coldBlooded() {	
		System.out.println("I am cold blooded");
	}

	@Override
	public void hasScales() {
		System.out.println("I have scales");
	}

	@Override
	public void layEggs() {	
		System.out.println("I lay eggs");
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
