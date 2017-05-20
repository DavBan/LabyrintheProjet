package pile_manager;

import java.util.Stack;

import case_manager.ICase;
import labyrinthe_manager.Labyrinthe;
/**
 * <h1>Classe Pile</h1>
 * <p>Classe repr&eacutesentant une pile de {@link ICase ICase} utilisable pour l'algoithme de 
 * parcours en profondeur d'un {@link labyrinthe_manager.ILabyrinthe Labyrinthe}.</p>
 * <p>Cette pile est impl&eacutement&eacutee par un tableau dont on peut d&eacutecider la taille maximale &agrave
 * la construction. Elle implemente l'interface {@link pile_manager.IPile IPile} qui d&eacutefinit toutes 
 * les m&eacutethode utilisable par cette classe.</p>
 * @author Bananier David
 */
public class Pile implements IPile<ICase> {

	private int nbElement;

	private ICase[] pile;
	/**
	 * <h1>Constructeur class Pile</h1>
	 * initialise la pile avec une taille par defaut
	 */
	public Pile() {
		pile = new ICase[1000];
		nbElement = 0;
	}
	/**
	 * <h1>Constructeur class Pile</h1>
	 * initialise la pile avec une taille donn&eacutee
	 * @param size taille de la pile a contruire
	 */
	public Pile(int size){
		pile = new ICase[size];
		nbElement = 0;
	}


	/**
	 * @see pile_manager.IPile#isVide()
	 */
	@Override
	public boolean isVide() {
		return nbElement == 0;
	}


	/**
	 * @see pile_manager.IPile#isPlein()
	 */
	@Override
	public boolean isPlein() {
		return nbElement == pile.length;
	}


	/**
	 * @see pile_manager.IPile#depiler()
	 */
	@Override
	public ICase depiler() {
		ICase c = pile[--nbElement];
		pile[nbElement]= null;
		return c;
	}

	/**
	 * @see pile_manager.IPile#empiler(Object)
	 */
	@Override
	public void empiler(ICase element) {
		pile[nbElement++] = element;
	}
	/**
	 * @see pile_manager.IPile#hautDePile()
	 */
	@Override
	public ICase hautDePile() {
		return pile[nbElement-1];
	}
}
