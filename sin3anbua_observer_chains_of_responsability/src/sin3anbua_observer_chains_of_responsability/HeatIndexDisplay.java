package sin3anbua_observer_chains_of_responsability;

public class HeatIndexDisplay implements Observer {

	  double c1 = -42.379;
	  double c2 = 2.04901523;
	  double c3 = 10.14333127;
	  double c4 = -0.22475541;
	  double c5 = -6.83783 * 0.001;
	  double c6 = -5.481717 * 0.01;
	  double c7 = 1.22874 * 0.001;
	  double c8 = 8.5282 * 0.0001;
	  double c9 = 1.99 * 0.000001;
			
	@Override
	public void update(double temp, double humidity, double pressure) {
		double temp2 = temp - 32 ;
		humidity *= 100;
		double HI = c1 + c2 * temp2 + c3  * humidity + c4 * temp2 * humidity + c5 * temp2 * temp2 + 
				c6 * humidity * humidity + c7 * temp2 * temp2 * humidity + c8 * temp2 * humidity * humidity +
				c9 * temp2 * temp2 * humidity * humidity;
		System.out.println("Sensação Térmica: " + HI);
		
	}
	}


