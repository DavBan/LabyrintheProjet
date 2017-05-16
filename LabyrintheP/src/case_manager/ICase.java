package case_manager;

public interface ICase {

	public abstract int getX();

	public abstract int getY();

	public abstract void setPrecedent(ICase precedent);

	public abstract ICase getPrecedent();

	public abstract boolean hasPrecedent();

	public abstract boolean isCheminSortie();

	public abstract void setCheminSortie(boolean cheminSortie);

	public abstract boolean hasMurN();

	public abstract boolean hasMurS();

	public abstract boolean hasMurE();

	public abstract boolean hasMurO();

}
