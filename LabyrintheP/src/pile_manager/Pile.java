package pile_manager;

import case_manager.ICase;

public class Pile implements IPile<ICase> {

	private int nbElement;

	private ICase[] pile;

	public Pile() {

	}


	/**
	 * @see pile_manager.IPile#isVide()
	 */
	public boolean isVide() {
		return false;
	}


	/**
	 * @see pile_manager.IPile#isPlein()
	 */
	public boolean isPlein() {
		return false;
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
