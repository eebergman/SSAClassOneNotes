package com.ssa1.assignment1;

public class TestBaltimoreAquariumAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaltimoreAquariumAnimals p = new BaltimoreAquariumAnimals();
		BaltimoreAquariumAnimals p2 = new BaltimoreAquariumAnimals();
		BaltimoreAquariumAnimals p3 = new BaltimoreAquariumAnimals();
		
		p2.chondrichthyes = "Short Fin Mako Shark";
		p2.boney = "Grouper";
		p2.mammal = "Otter";
		
		p3.chondrichthyes = "Lemon Shark";
		p3.boney = "Mola Mola";
		p3.mammal = "California Sea Lion";
		
	System.out.println(p.theWholeShebang());
	System.out.println(p2.theWholeShebang());
	System.out.println(p3.theWholeShebang());
	
	
	}
}
