package de.tum.jk.creational.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		BaradurTower t = BaradurTower.getInstance();
		BaradurTower t1 = BaradurTower.getInstance();

		System.out.println(t);
		System.out.println(t1);
		
		if (t1.equals(t1)) {
			System.out.println("Same memory reference");
		}
	}

}
