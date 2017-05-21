package labyrinthe_manager;

import case_manager.ICase;
import case_manager.Case;
/**
 * <h1>Classe Labyrinthe</h1>
 * <p>Classe repr&eacutesentant un labyrinthe sous la forme d'une matrice de {@link case_manager.ICase cases}</p>
 * <p>Un labyrinthe peut &ecirctre d&eacutecrit par un tableau &agrave double entr&eacutee (une matrice) ou chaque case contient une
 * instance de la classe {@link case_manager.ICase ICase}. On peut construire un labyrinthe vide dans un premier temps puis le remplir
 * en r&eacutecup&eacuterant les donn&eacutees {@link Labyrinthe#lireFichier(String) dans un fichier texte} ou directement construire
 * le labyrinthe &agrave l'aide du fichier</p>
 * @author Bananier David
 * @author Ba Mohamed
 */
public class Labyrinthe implements ILabyrinthe {

	private ICase[][] labyrinthe = new ICase[10][10];
	private int sizeX = 0;
	private int sizeY = 0;
	/**
	 * <h1>Constructeur de la classe Labyrinthe </h1>
	 * <p>Construit le Labyrinthe &agrave partir du fichier nomFichier.</p>
	 * <p>Utilise la m&eacutethode {@link Labyrinthe#lireFichier(String) lireFichier} pour construire le labyrinthe &agrave partir
	 * d'un fichier.</p>
	 * @param nomFichier chemin vers le fichier qui contient les donn&eacutees.
	 * @see Labyrinthe#lireFichier(String)
	 */
	public Labyrinthe(String nomFichier) {
		lireFichier(nomFichier);
	}
	/**
	 * <h1>Constructeur de la classe Labyrinthe </h1>
	 * <p>Construit un Labyrinthe vide. pour pouvoir cr&eacuteer le labyrinthe, il va falloir utiliser la m&eacutethode 
	 * {@link Labyrinthe#lireFichier(String) lireFichier}.</p>
	 * @see Labyrinthe#lireFichier(String) 
	 */
	public Labyrinthe() {

	}


	/**
	 * <h1>M&eacutethode lireFichier()</h1>
	 * <p>Construit le labyrinthe a partir d'un fichier formatt&eacute</p>
	 * <p>Chaque Labyrinthe est stock&eacute dans un fichier texte formatt&eacute qui contient sa taille et les informations
	 * sur chacune de ses cases. On peut par exemple avoir le contenu de fichier suivant :
	 * <code>
	 * <br>
	 * 2<br>
	 * 3<br>
	 * +-+-+-+<br>
	 * |. . .|<br>
	 * + +-+ +<br>
	 * |A|. T|<br>
	 * + +-+-+<br>
	 * </code>
	 * Les deux permi&egraveres lignes vont correspondres respectivement au nombre de ligne et de colonnes du labyrinthe. Les
	 * lignes suivantes d&eacutecrivent chaque case du labyrinthe ainsi que la case de d&eacutepart (symbolis&eacutee par un T pour
	 * Th&eacutes&eacutee) et celle d'arriv&eacutee (symbolis&eacutee par un A pour Arianne).
	 * </p>
	 * @param nomFichier nom du fichier dans lequel est stock&eacute le Labyrinthe.
	 * @see labyrinthe_manager.ILabyrinthe#lireFichier(String)
	 * @see case_manager.ICase#setMurN(boolean)
	 * @see case_manager.ICase#setMurS(boolean)
	 * @see case_manager.ICase#setMurE(boolean)
	 * @see case_manager.ICase#setMurO(boolean)
	 */
	@Override
	public void lireFichier(String nomFichier) {

	}


	/**
	 * @see labyrinthe_manager.ILabyrinthe#afficherLabyrinthe(boolean)
	 */
	@Override
	public void afficherLabyrinthe(boolean afficherSolution) {

	}


	/**
	 * <h1>M&eacutethode parcoursLabyrinthe()</h1>
	 * <p>Parcours le Labyrinthe en profondeur pour trouver la sortie.</p>
	 * <p>Cette methode va parcourir le graphe representant le labyrinthe selon un parcours en profondeur, &agrave l'aide d'une 
	 * {@link pile_manager.Pile pile}, pour trouver le chemin entre l'entr&eacutee et la sortie du labyrinthe. &Agrave chaque 
	 * &eacutetape du parcours, cette m&eacutethode proc&egravede de la mani&egravere suivante :
	 * <ul>
	 * 		<li>On {@link pile_manager.IPile#empiler(Object) empile} la {@link case_manager.Case case} C &agrave laquelle on est.</li>
	 * 		<li>Ensuite on parcours les voisins directs, c'est &agrave dire :
	 * 			<ol>
	 * 				<li>On regarde si C a une  case voisine CN accessible au {@link case_manager.ICase#hasMurN() nord}.</li>
	 * 				<li>Si oui, on {@link case_manager.ICase#setPrecedent(case_manager.ICase) d&eacutefinit la pr&eacutec&eacutedente} de CN dans le parcours en profondeur par C.</li>
	 * 				<li>Si CN n'a pas d&eacutej&agrave &eacutet&eacute visit&eacute, On parcoure CN. </li>
	 * 				<li>Si CN {@link case_manager.ICase#isCheminSortie() est sur le chemin de sortie}, alors C aussi, on peut donc depiler et revenir en arriere.</li>
	 * 				<li>Si le traitement continue, on fait la m&ecircme chose au sud &agrave l'est et &agrave l'ouest.</li>
	 * 			</ol>
	 * 		</li>
	 * 		<li>Si le traitement est arrive jusqu'&agrave la fin, on depile et on arr&ecircte le traitement</li>
	 * </ul>
	 * &Agrave la fin du tra&icirctement complet, on a le chemin vers la sortie s'il y en a un.
	 * </p>
	 * @see labyrinthe_manager.ILabyrinthe#parcoursLabyrinthe()
	 * @see ICase#getPrecedent()
	 * @see ICase#hasMurN()
	 * @see ICase#hasMurS()
	 * @see ICase#hasMurE()
	 * @see ICase#hasMurO()
	 * @see ICase#isCheminSortie()
	 * @see ICase#setCheminSortie(boolean)
	 */
	@Override
	public void parcoursLabyrinthe() {

	}

}
