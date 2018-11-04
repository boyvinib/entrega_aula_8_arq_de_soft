package sin3anbua_observer_chains_of_responsability;

public class Teste {
	
	public static void main(String[] args) {
		EstacaoDeMonitoramento estacao = new EstacaoDeMonitoramento();
		CurrentConditionsDisplay condicoesAtuaisDisplay = new CurrentConditionsDisplay();
		StatsDisplay statsDisplay = new StatsDisplay();
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay();
		estacao.addObserver(heatIndexDisplay);
		estacao.addObserver(condicoesAtuaisDisplay);
		estacao.addObserver(statsDisplay);
		estacao.vai();
	}

}
