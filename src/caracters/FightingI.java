package caracters;

public interface FightingI {

	/**
	 * Return Caracter speed
	 * @return
	 */
	int getSpeed();
	
	/**
	 * Return Caracter defense
	 * @return
	 */
	int getDefense();
	
	/**
	 * Return Caracter attack
	 * @return
	 */
	int getAttack();
	
	/**
	 * Return Caracter dodging
	 * @return
	 */
	int getDodging();
	
	/**
	 * Return Caracter level
	 * @return
	 */
	 int getLevel();
	
	/**
	 * Return Caracter life
	 * @return
	 */
	int getLife();
	
	/**
	 * Attack other Caracter
	 * @param c
	 */
	public void attack(AbstractFightingCaracter c);
}
