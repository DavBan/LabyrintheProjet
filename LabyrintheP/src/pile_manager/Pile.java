package pile_manager;

import java.util.Stack;

import case_manager.ICase;
/**
 * <h1>Classe Pile</h1>
 * <p>Classe repr�sentant une pile de case utilisable pour l'algoithme de 
 * parcours en profondeur du Labyrinthe.</p>
 * <p>Cette pile est impl�ment�e par un tableau dont on peut d�cider la taille maximale �
 * la construction. Elle implemente l'interface {@link pile_manager.IPile IPile} qui d�finit toutes 
 * les m�thode utilisable par cette classe.</p>
 * @author Bananier David
 */
public class Pile implements IPile<ICase> {

	private int nbElement;

	private ICase[] pile;
	/**
	 * <h1>Constructeur class Pile</h1>
	 * initialise la pile avec une taille par defaut
	 * @author Bananier David
	 */
	public Pile() {
		pile = new ICase[1000];
		nbElement = 0;
	}
	/**
	 * <h1>Constructeur class Pile</h1>
	 * initialise la pile avec une taille donn�e
	 * @param size taille de la pile a contruire
	 * @author Bananier David
	 */
	public Pile(int size){
		pile = new ICase[size];
		nbElement = 0;
	}


	/**
	 * @author Bananier David
	 * @see pile_manager.IPile#isVide()
	 */
	@Override
	public boolean isVide() {
		return nbElement == 0;
	}


	/**
	 * @author Bananier David
	 * @see pile_manager.IPile#isPlein()
	 */
	@Override
	public boolean isPlein() {
		return nbElement == pile.length;
	}


	/**
	 * @author Bananier David
	 * @see pile_manager.IPile#depiler()
	 */
	@Override
	public ICase depiler() {
		ICase c = pile[--nbElement];
		pile[nbElement]= null;
		return c;
	}

	/**
	 * @author Bananier David
	 * @see pile_manager.IPile#empiler(E)
	 */
	@Override
	public void empiler(ICase element) {
		pile[nbElement++] = element;
	}
	/**
	 * @author Bananier David
	 * @see pile_manager.IPile#hautDePile()
	 */
	@Override
	public ICase hautDePile() {
		return pile[nbElement-1];
	}
}
