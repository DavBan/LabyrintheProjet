package case_manager;

/**
 * <h1>Classe Case</h1>
 * <p>Classe mod&eacutelisant une Case d'un {@link labyrinthe_manager.ILabyrinthe Labyrinthe}.</p>
 * <p>Une case est repr&eacutesent&eacutee par :
 * <ol>
 *	<li>Sa position dans le labyrinthe (ses coordonn&eacutees)</li>
 * 	<li>Si des murs la bordent &agrave ses fronti&egraveres (au nord, au sud &agrave l'est et &agrave l'ouest)</li>
 * 	<li>Si elle fait partie ou non du chemin de sortie</li>
 * 	<li>Quelle case la pr&eacutec&egravede dans le parcours en profondeur du {@link labyrinthe_manager.ILabyrinthe Labyrinthe}</li>
 * </ol>
 * La plupart des &eacutel&eacutements sit&eacute ci-dessus sont d&eacutefinis lors de la contruction du labyrinthe &agrave
 * partir {@link labyrinthe_manager.Labyrinthe#lireFichier(String) du fichier} ou lors du {@link labyrinthe_manager.Labyrinthe#parcoursLabyrinthe() parcours en profondeur}
 * </p>
 * @author Bananier David
 * @author Ba Mohamed
 * @see labyrinthe_manager.Labyrinthe
 * @see ICase
 */
public class Case implements ICase {

	private int x;

	private int y;

	private boolean cheminSortie;

	private boolean murN;

	private boolean murS;

	private boolean murE;

	private boolean murO;

	private ICase casePrec;
	/**
	 * <h1>Contructeur classe Case</h1>
	 * <p>Initialise la case en specifiant sa position dans le labyrinthe</p>
	 * @param i position de la case dans le labyrinthe sur l'axe des abscisses
	 * @param j position de la case dans le labyrinthe sur l'axe des ordonn&eacutees
	 */
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
	@Override
	public int getX() {
		return 0;
	}


	/**
	 * @see case_manager.ICase#getY()
	 */
	@Override
	public int getY() {
		return 0;
	}


	/**
	 * @see case_manager.ICase#setPrecedent(case_manager.ICase)
	 */
	@Override
	public void setPrecedent(ICase precedent) {

	}


	/**
	 * @see case_manager.ICase#getPrecedent()
	 */
	@Override
	public ICase getPrecedent() {
		return null;
	}


	/**
	 * @see case_manager.ICase#hasPrecedent()
	 */
	@Override
	public boolean hasPrecedent() {
		return false;
	}


	/**
	 * @see case_manager.ICase#isCheminSortie()
	 */
	@Override
	public boolean isCheminSortie() {
		return false;
	}


	/**
	 * @see case_manager.ICase#setCheminSortie(boolean)
	 */
	@Override
	public void setCheminSortie(boolean cheminSortie) {

	}


	/**
	 * @see case_manager.ICase#hasMurN()
	 */
	@Override
	public boolean hasMurN() {
		return false;
	}


	/**
	 * @see case_manager.ICase#hasMurS()
	 */
	@Override
	public boolean hasMurS() {
		return false;
	}


	/**
	 * @see case_manager.ICase#hasMurE()
	 */
	@Override
	public boolean hasMurE() {
		return false;
	}


	/**
	 * @see case_manager.ICase#hasMurO()
	 */
	@Override
	public boolean hasMurO() {
		return false;
	}

	/**
	 * @see case_manager.ICase#setMurN(boolean)
	 */
	@Override
	public boolean setMurN(boolean hasMur) {
		// TODO Auto-generated method stub
		return false;
	}


	/**
	 * @see case_manager.ICase#setMurS(boolean)
	 */
	@Override
	public boolean setMurS(boolean hasMur) {
		// TODO Auto-generated method stub
		return false;
	}


	/**
	 * @see case_manager.ICase#setMurE(boolean)
	 */
	@Override
	public boolean setMurE(boolean hasMur) {
		// TODO Auto-generated method stub
		return false;
	}



	/**
	 * @see case_manager.ICase#setMurO(boolean)
	 */
	@Override
	public boolean setMurO(boolean hasMur) {
		// TODO Auto-generated method stub
		return false;
	}

}
