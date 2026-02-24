package versio1.thread.domini;

import java.util.Random;

public class EventJoc extends Thread {
	
	@Override
	public void run()
	{
		aparicions();
	}

	public EventJoc(String nomEvent, Integer maximSegonsEnPantalla, int maxAmplePantalla, int maxAlturaPantalla) {
		this.nomEvent = nomEvent;
		this.maximSegonsEnPantalla = maximSegonsEnPantalla;
		this.maxAmplePantalla = maxAmplePantalla;
		this.maxAlturaPantalla = maxAlturaPantalla;
	}

	private String nomEvent;
	private Integer maximSegonsEnPantalla;
	private int maxAmplePantalla;
	private int maxAlturaPantalla;

	public void aparicions() {
		int segonsEnPantallaActuals = 0;
		int x = 0;
		int y = 0;

		while (maximSegonsEnPantalla == null || segonsEnPantallaActuals <= maximSegonsEnPantalla) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			}
			x = getPosicio(maxAmplePantalla, (maxAmplePantalla) * -1);
			y = getPosicio(maxAlturaPantalla, (maxAlturaPantalla) * -1);
			System.out.println(nomEvent + " X:" + x + " Y:" + y);
			segonsEnPantallaActuals++;
		}
	}

	private int getPosicio(int max, int min) {
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;

	}
}
