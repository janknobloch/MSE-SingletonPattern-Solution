package de.tum.jk.creational.singleton;

public class BaradurTower {

	private static BaradurTower INSTANCE ;

	private BaradurTower() {

	}

	public static BaradurTower getInstance() {
		// NO INSTANCE YET
		if (INSTANCE == null) {
			INSTANCE = new BaradurTower();
			
		}
		return INSTANCE;
	}
	
	
}
