package sin3anbua_observer_chains_of_responsability;

public class StatsDisplay implements Observer {

	private double historico;
	private int quantidade;
	
	
	@Override
	public void update(double temp, double humidity, double pressure) {
		historico += temp;
		quantidade++;
		double media = historico / quantidade;
		System.out.println("--------------- M�dia Hist�rica -----------------");
		System.out.printf("M�dia hist�rica: %.2f\n ", media);
	}

}
