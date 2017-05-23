
package case_manager;

import labyrinthe_manager.ILabyrinthe;

/**
 * <h1>Interface ICase</h1>
 * <p>Interface qui r&eacuteunit toutes les op&eacuterations de base d'une case du labyrinthe.</p>
 * <p>Cette interface va d&eacutecrire les op&eacuterations qui pourront &ecirctre utilis&eacutees sur une case. On a ainsi :
 * <ul>
 * 	<li>les accesseurs &agrave la position de la case.</li>
 * 	<li>les modifieurs et accesseurs aux diff&eacuterents murs </li>
 * 	<li>le modifieur et l'accesseur &agrave la case pr&eacutec&eacutedemment visit&eacutee lors du parcours en profondeur du labyrinthe</li>
 * 	<li>les tests pour savoir : 
 * 	<ol>
 * 		<li>si la case est sur le chemin de sortie</li>
 * 		<li>si la case &agrave un pr&eacutec&eacutedent dans le parcours en profondeur</li>
 * 	</ol>
 * 	</li>
 * </ul>
 * </p>
 * <p>
 * Documentation &eacutecrite par Bananier David<br>
 * Code g&eacuten&eacuter&eacute par Bananier David via le logiciel Astah&copy
 * </p>
 * @author Bananier David
 */
public interface ICase {
	/**
	 * <h1>M&eacutethode getX()</h1>
	 * <p>permet d'acceder &agrave l'abscisse de la case dans le labyrinthe</p>
	 * @return <strong>x</strong> - l'abscisse de la case
	 */
	public abstract int getX();
	/**
	 * <h1>M&eacutethode getY()</h1>
	 * <p>permet d'acceder &agrave l'ordonn&eacutee de la case dans le labyrinthe</p>
	 * @return <strong>y</strong> - l'ordonn&eacutee de la case
	 */
	public abstract int getY();
	/**
	 * <h1>M&eacutethode setPrecedent(ICase precedent)</h1>
	 * <p>permet de sp&eacutecifier la case pr&eacutec&eacutedemment visit&eacutee dans le parcours en profondeur du labyrinthe</p>
	 * @param precedent - case pr&eacutec&eacutedemment visit&eacutee
	 * @see ICase#getPrecedent()
	 * @see ICase#hasPrecedent()
	 * @see ILabyrinthe#parcoursLabyrinthe()
	 */
	public abstract void setPrecedent(ICase precedent);
	/**
	 * 
	 * <h1>M&eacutethode getPrecedent()</h1>
	 * <p>permet de recuperer la case pr&eacutec&eacutedemment visit&eacutee dans le parcours en profondeur du labyrinthe</p>
	 * <p>retourne <code>null</code> si la case n'a pas encore eacuteteacute visiteacutee</p>
	 * @return <strong>precedent</strong> - case pr&eacutec&eacutedemment visit&eacutee
	 * @see ICase#setPrecedent(ICase)
	 * @see ICase#hasPrecedent()
	 * @see ILabyrinthe#parcoursLabyrinthe()
	 */
	public abstract ICase getPrecedent();
	/**
	 * 
	 * <h1>M&eacutethode hasPrecedent()</h1>
	 * <p>Test Pour savoir si la case &agrave un pr&eacutec&eacutedent dans le parcours en profondeur du labyrinthe</p>
	 * @return le r&eacutesultat du test
	 * @see ICase#setPrecedent(ICase)
	 * @see ICase#getPrecedent()
	 * @see ILabyrinthe#parcoursLabyrinthe()
	 */
	public abstract boolean hasPrecedent();
	/**
	 * <h1>M&eacutethode isCheminSortie()</h1>
	 * <p>Test pour savoir si la case est sur le chemin de la sortie</p>
	 * @return resultat du test
	 * @see ICase#setCheminSortie(boolean)
	 * @see ILabyrinthe#parcoursLabyrinthe()
	 */
	public abstract boolean isCheminSortie();
	/**
	 * <h1>M&eacutethode setCheminSortie()</h1>
	 * <p>D&eacutecide si la case est sur le chemin de sortie ou non</p>
	 * @param cheminSortie - variable bool&eacuteenne qui va decider si il s'agit bien du chemin de sortie.
	 * @see ICase#isCheminSortie()
	 * @see ILabyrinthe#parcoursLabyrinthe()
	 */
	public abstract void setCheminSortie(boolean cheminSortie);
	/**
	 * <h1>M&eacutethode hasMurN()</h1>
	 * <p>test s'il y a un mur au nord</p>
	 * @return r&eacutesultat du test
	 * @see ICase#setMurN(boolean)
	 * @see ILabyrinthe#parcoursLabyrinthe()
	 */
	public abstract boolean hasMurN();
	/**
	 * <h1>M&eacutethode hasMurS()</h1>
	 * <p>test s'il y a un mur au sud</p>
	 * @return r&eacutesultat du test
	 * @see ICase#setMurS(boolean)
	 * @see ILabyrinthe#parcoursLabyrinthe()
	 */
	public abstract boolean hasMurS();
	/**
	 * <h1>M&eacutethode hasMurE()</h1>
	 * <p>test s'il y a un mur &agrave l'est</p>
	 * @return r&eacutesultat du test
	 * @see ICase#setMurE(boolean)
	 * @see ILabyrinthe#parcoursLabyrinthe()
	 */
	public abstract boolean hasMurE();
	/**
	 * <h1>M&eacutethode hasMurO()</h1>
	 * <p>test s'il y a un mur &agrave l'ouest</p>
	 * @return r&eacutesultat du test
	 * @see ICase#setMurO(boolean)
	 * @see ILabyrinthe#parcoursLabyrinthe()
	 */
	public abstract boolean hasMurO();
	/**
	 * <h1>M&eacutethode setMurN()</h1>
	 * <p>D&eacutefinit s'il y a un mur au nord de cette case ou non</p>
	 * <p>Elle est notamment utilis&eacutee par la fonction 
	 * {@link ILabyrinthe#lireFichier(String) lireFichier} du labyrinthe 
	 * qui va reconstituer un labyrinthe &agrave partir du fichier</p>
	 * @param hasMur variable indiquant s'il y a un mur ou non
	 * @see ICase#hasMurN()
	 * @see ILabyrinthe#lireFichier(String)
	 */
	public abstract boolean setMurN(boolean hasMur);
	/**
	 * <h1>M&eacutethode setMurS()</h1>
	 * <p>D&eacutefinit s'il y a un mur au sud de cette case ou non</p>
	 * <p>Elle est notamment utilis&eacutee par la fonction 
	 * {@link ILabyrinthe#lireFichier(String) lireFichier} du labyrinthe 
	 * qui va reconstituer un labyrinthe &agrave partir du fichier</p>
	 * @param hasMur variable indiquant s'il y a un mur ou non
	 * @see ICase#hasMurS()
	 * @see ILabyrinthe#lireFichier(String)
	 */
	public abstract boolean setMurS(boolean hasMur);
	/**
	 * <h1>M&eacutethode setMurE()</h1>
	 * <p>D&eacutefinit s'il y a un mur &agrave l'est de cette case ou non</p>
	 * <p>Elle est notamment utilis&eacutee par la fonction 
	 * {@link ILabyrinthe#lireFichier(String) lireFichier} du labyrinthe 
	 * qui va reconstituer un labyrinthe &agrave partir du fichier</p>
	 * @param hasMur variable indiquant s'il y a un mur ou non
	 * @see ICase#hasMurE()
	 * @see ILabyrinthe#lireFichier(String)
	 */
	public abstract boolean setMurE(boolean hasMur);
	/**
	 * <h1>M&eacutethode setMurO()</h1>
	 * <p>D&eacutefinit s'il y a un mur &agrave l'ouest de cette case ou non</p>
	 * <p>Elle est notamment utilis&eacutee par la fonction 
	 * {@link ILabyrinthe#lireFichier(String) lireFichier} du labyrinthe 
	 * qui va reconstituer un labyrinthe &agrave partir du fichier</p>
	 * @param hasMur variable indiquant s'il y a un mur ou non
	 * @see ICase#hasMurO()
	 * @see ILabyrinthe#lireFichier(String)
	 */
	public abstract boolean setMurO(boolean hasMur);

}
