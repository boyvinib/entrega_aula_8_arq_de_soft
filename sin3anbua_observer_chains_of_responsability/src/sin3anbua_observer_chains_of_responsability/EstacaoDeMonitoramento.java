package sin3anbua_observer_chains_of_responsability;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EstacaoDeMonitoramento implements Subject {

	private List<Observer> observers = new ArrayList<>();
	private Random random = new Random();
	private double temp, humidity, pressure;
	

	private void alteracoesDetectadas() {
		temp = 20 + random.nextDouble() * 10;
		humidity = random.nextDouble();
		pressure = 500 + random.nextDouble() * 500;
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);

	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers)
			o.update(temp, humidity, pressure);

	}

	public void vai() {
		while(true) {
			boolean foiDetectadaAlteracao = random.nextBoolean();
			if (foiDetectadaAlteracao) {
				alteracoesDetectadas();
				notifyObservers();
				
			}
			try {
				Thread.sleep((2+ random.nextInt(2)) * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
