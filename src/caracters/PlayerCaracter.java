package caracters;

public class PlayerCaracter extends AbstractFightingCaracter {
	
	private String back;
	
	public String getBack() {
		return back;
	}
	
	PlayerCaracter(String name, String portrait) {
		this.name = name;
		this.portrait = portrait;
		
		level = 1;
		life = 20;
		
		equipement = new Equipement();
		inventory = new Inventory();
		
		defense = 10;
		attack = 10;
		dodging = 5;
		speed = 20;
		
	}
}
