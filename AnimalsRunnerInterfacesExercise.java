package com.qa.qacommunity4;

public class AnimalsRunnerInterfacesExercise {
	
	public static void main(String[] args) {
		
	Pigeon pigeon = new Pigeon();
	System.out.println("==========Pigeon==========");
	pigeon.eukaryotes();
	pigeon.hasBeaks();
	pigeon.hasWings();
	
	Snake snake = new Snake();
	System.out.println("==========Snake==========");
	snake.coldBlooded();
	snake.hasScales();
	snake.sensoryOrgans();
	
	Animals animalSnake = new Snake();
	animalSnake.eukaryotes();
	
	
	
		
	}

}
