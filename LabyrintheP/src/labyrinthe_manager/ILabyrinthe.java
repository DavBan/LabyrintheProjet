package labyrinthe_manager;

import java.io.FileNotFoundException;

import case_manager.Case;
import exception_manager.NoBeginEndException;
import exception_manager.WrongSizeException;

/**
 * <h1>Interface ILabyrinthe</h1>
 * <p>Interface d&eacutecrivant les principales op&eacuterations possible pour un labyrinthe. Il y en a trois :
 * <ol>
 * 	<li>Lecture du fichier pour contruire le labyrinthe</li>
 * 	<li>Affichage du Labyrinthe</li>
 * 	<li>Parcours en profondeur du Labyrinthe pour trouver la sortie</li>
 * </ol>
 * </p>
 * <p>
 * Documentation &eacutecrite par Bananier David<br>
 * Code g&eacuten&eacuter&eacute par Bananier David via le logiciel Astah&copy
 * </p>
 * @author Bananier David
 * @see case_manager.ICase
 */
public interface ILabyrinthe {
	/**
	 * <h1>M&eacutethode lireFichier()</h1>
	 * <p>Construit le labyrinthe a partir d'un fichier formatt&eacute</p>
	 * @throws FileNotFoundException si le fichier <code>nomFichier</code> n'&eacutexiste pas
	 * @throws WrongSizeException Exceptions g&eacuterant les erreurs de taille du labyrinthe
	 * @throws NoBeginEndException Exception g&eacuterant l'absence de case d&eacutepart ou arriv&eacutee dans le fichier
	 * @param nomFichier nom du fichier dans lequel est stock&eacute le Labyrinthe.
	 */
	public abstract void lireFichier(String nomFichier) throws FileNotFoundException, WrongSizeException, NoBeginEndException;
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
	public abstract boolean parcoursLabyrinthe();

}
