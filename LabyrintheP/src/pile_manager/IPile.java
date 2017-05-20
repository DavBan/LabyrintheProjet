package pile_manager;

public interface IPile<E> {

	public abstract boolean isVide();

	public abstract boolean isPlein();

	public abstract E hautDePile();

	public abstract void empiler(E element);

	public abstract void depiler();

}
