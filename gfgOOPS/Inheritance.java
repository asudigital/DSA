package gfgOOPS;

public class Inheritance {

	public static void main(String[] args) {		
      sum();
	}
	static void sum() {
		
	}
}

class Inheritance2 extends Inheritance{
   Inheritance In = new Inheritance();
	static void sum() {}
}
class Inheritance3 extends Inheritance2{
	static void sum() {}
}
