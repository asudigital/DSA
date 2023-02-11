package gfgOOPS;

public class StaticMembersInJava {

	public static void main(String[] args) {
		
   Player p=new Player("asu");
   
   p.PrintDetails();
   System.out.println("playercount is " + Player.playerCount);

  System.out.println(p.playerCount);
  
	}

}
class Player{
	String name;
	int id;
	static int playerCount =0;
	
	Player(String name){
		this.name= name;
		id = ++playerCount;
	}
	void PrintDetails() {
		System.out.println(name + ":" + id);
	}
}
