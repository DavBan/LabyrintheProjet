package pile_manager;


/**
 * <h1>Interface IPile</h1>
 * <p>interface qui reunit toutes les operations que l'on peut effectuer sur une Pile</p>
 * <p>Cette interface permet un accès généralisé à toute les classes implementant une pile. Elle
 * réunit les opérations de bases sur les piles, c'est à dire :
 * <ul>
 * <li>L'operation {@link pile_manager.IPile#isVide() isVide} (<=> isEmpty)</li>
 * <li>L'operation {@link pile_manager.IPile#isPlein() isPlein} (<=> isFull)</li>
 * <li>L'operation {@link pile_manager.IPile#empiler(E) empiler} (<=> push)</li>
 * <li>L'operation {@link pile_manager.IPile#depiler() depiler} (<=> pop)</li>
 * <li>L'operation {@link pile_manager.IPile#hautDePile() hautDePile} (<=> peek)</li>
 * </ul>
 * </p>
 * @author Bananier David
 * 
 * @param <E>
 * - type des elements présents dans la pile
 * @see pile_manager.IPile#isVide()
 * @see pile_manager.IPile#isPlein()
 * @see pile_manager.IPile#empiler(E)
 * @see pile_manager.IPile#depiler()
 * @see pile_manager.IPile#hautDePile()
 */
public interface IPile<E> {
	/**
	 * <h1>Methode isVide()</h1>
	 * <p>Methode qui permet de tester si la liste est vide ou non.</p> 
	 * <p>Le test consiste a verifier si {@code nbElement == 0}</p>
	 * @return <strong>isVide</strong> - resultat du test
	 * @author Bananier David
	 * @see pile_manager.IPile#isPlein()
	 */
	public abstract boolean isVide();
	/**
	 * <h1>methode isPlein()</h1>
	 * <p>methode qui permet de tester si la pile est pleine ou non.</p> 
	 * <p>Le test consiste a verifier si {@code nbElement = IPile.size()}</p>
	 * @return <strong>isPlein</strong> - resultat du test
	 * @author Bananier David
	 * @see pile_manager.IPile#isVide()
	 */
	public abstract boolean isPlein();
	/**
	 * <h1>methode hautDePile()</h1>
	 * <p>methode qui renvoie le sommet de la pile.</p>
	 * <p>Pour <strong>depiler</strong> le sommet en même temps qu'on le récupère, il faut 
	 * utiliser la méthode {@link pile_manager.IPile#depiler() depiler}</p>
	 * @return <strong>sommet</strong> - l'élément qui se trouve au sommet de la pile
	 * @see pile_manager.IPile#depiler()
	 * @author Bananier David
	 */
	public abstract E hautDePile();
	/**
	 * <h1>methode empiler()</h1>
	 * <p>methode qui ajoute un élément au sommet de la pile.</p>
	 * @param element - élément à ajouter à la pile
	 * @author Bananier David
	 * @see pile_manager.IPile#depiler()
	 */
	public abstract void empiler(E element);
	/**
	 * <h1>Methode depiler()</h1>
	 * <p>Methode qui renvoie et supprime sommet de la pile.</p>
	 * <p>Pour récupérer le sommet de la pile sans le supprimer, il faut utiliser 
	 * la methode {@link pile_manager.IPile#hautDePile() hautDePile}</p>
	 * @return <strong>sommet</strong> - l'élément qui était au sommet de la pile
	 * @author Bananier David
	 * @see pile_manager.IPile#hautDePile()
	 * @see pile_manager.IPile#empiler(E)
	 */
	public abstract E depiler();

}
