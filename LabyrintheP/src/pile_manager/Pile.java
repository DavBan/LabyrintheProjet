package pile_manager;

import case_manager.ICase;

public class Pile implements IPile<ICase> {

	private int nbElement;

	private ICase[] pile;

	public Pile() {
		pile = new ICase[1000];
		nbElement = 0;
	}
	
	public Pile(int size){
		pile = new ICase[size];
		nbElement = 0;
	}


	/**
	 * @see pile_manager.IPile#isVide()
	 */
	public boolean isVide() {
		return nbElement == 0;
	}


	/**
	 * @see pile_manager.IPile#isPlein()
	 */
	public boolean isPlein() {
		return nbElement == pile.length;
	}


	/**
	 * @see pile_manager.IPile#depiler()
	 */
	public void depiler() {

	}


	@Override
	public void empiler(ICase element) {
		
	}
	
	@Override
	public ICase hautDePile() {
		return null;
	}
}
