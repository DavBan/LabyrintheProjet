package case_manager;

public class Case implements ICase {

	private int x;

	private int y;

	private boolean cheminSortie;

	private boolean murN;

	private boolean murS;

	private boolean murE;

	private boolean murO;

	private ICase casePrec;

	public Case(int i, int j) {
		x = i;
		y = j;
		cheminSortie = false;
		murN =false;
		murS = false;
		murE = false;
		murO = false;
		casePrec = null;
	}


	/**
	 * @see case_manager.ICase#getX()
	 */
	public int getX() {
		return 0;
	}


	/**
	 * @see case_manager.ICase#getY()
	 */
	public int getY() {
		return 0;
	}


	/**
	 * @see case_manager.ICase#setPrecedent(case_manager.ICase)
	 */
	public void setPrecedent(ICase precedent) {

	}


	/**
	 * @see case_manager.ICase#getPrecedent()
	 */
	public ICase getPrecedent() {
		return null;
	}


	/**
	 * @see case_manager.ICase#hasPrecedent()
	 */
	public boolean hasPrecedent() {
		return false;
	}


	/**
	 * @see case_manager.ICase#isCheminSortie()
	 */
	public boolean isCheminSortie() {
		return false;
	}


	/**
	 * @see case_manager.ICase#setCheminSortie(boolean)
	 */
	public void setCheminSortie(boolean cheminSortie) {

	}


	/**
	 * @see case_manager.ICase#hasMurN()
	 */
	public boolean hasMurN() {
		return false;
	}


	/**
	 * @see case_manager.ICase#hasMurS()
	 */
	public boolean hasMurS() {
		return false;
	}


	/**
	 * @see case_manager.ICase#hasMurE()
	 */
	public boolean hasMurE() {
		return false;
	}


	/**
	 * @see case_manager.ICase#hasMurO()
	 */
	public boolean hasMurO() {
		return false;
	}

}
