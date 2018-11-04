package sin3anbua_observer_chains_of_responsability;

public interface Subject {
	public void addObserver (Observer o);
	public void removeObserver (Observer o);
	public void notifyObservers();

}
