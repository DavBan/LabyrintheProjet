package labyrinthe_manager;

import case_manager.Case;

/**
 * <h1>Interface ILabyrinthe</h1>
 * <p>Interface d&eacutecrivant les principales op&eacuterations possible pour un labyrinthe. Il y en a trois :
 * <ol>
 * 	<li>Lecture du fichier pour contruire le labyrinthe</li>
 * 	<li>Affichage du Labyrinthe</li>
 * 	<li>Parcours en profondeur du Labyrinthe pour trouver la sortie</li>
 * </ol>
 * </p>
 * @author Bananier David
 * @see case_manager.ICase
 */
public interface ILabyrinthe {
	/**
	 * <h1>M&eacutethode lireFichier()</h1>
	 * <p>Construit le labyrinthe a partir d'un fichier formatt&eacute</p>
	 * @param nomFichier nom du fichier dans lequel est stock&eacute le Labyrinthe.
	 */
	public abstract void lireFichier(String nomFichier);
	/**
	 * <h1>M&eacutethode afficherLabyrinthe()</h1>
	 * <p>Affiche le Labyrinthe selon le m&ecircme format que dans le {@link ILabyrinthe#lireFichier(String) fichier} avec la possibilit&ecaute
	 * d'afficher le chemin de sortie</p>
	 * @param afficherSolution permet d'afficher ou non le chemin de sortie qui a &eacutet&eacute trouv&eacute lors du parcours en profondeur
	 * @see ILabyrinthe#parcoursLabyrinthe()
	 */
	public abstract void afficherLabyrinthe(boolean afficherSolution);
	/**
	 * <h1>M&eacutethode parcoursLabyrinthe()</h1>
	 * <p>Parcours le Labyrinthe en profondeur pour trouver la sortie.</p>
	 */
	public abstract void parcoursLabyrinthe();

}
