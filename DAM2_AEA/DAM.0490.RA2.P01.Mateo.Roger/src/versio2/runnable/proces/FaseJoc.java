package versio2.runnable.proces;

import versio2.runnable.domini.EventJoc;

public class FaseJoc {

	public static void main(String[] args) {
		EventJoc eventJoc1 = new EventJoc("mina", 10, 800, 600);
		EventJoc eventJoc2 = new EventJoc("cactus", 5, 800, 600);
		EventJoc eventJoc3 = new EventJoc("sotrac", 7, 400, 400);
		EventJoc eventJoc4 = new EventJoc("lo clot", null, 800, 600);
		EventJoc eventJoc5 = new EventJoc("columna", 11, 800, 600);

		Thread t1 = new Thread(eventJoc1);
		Thread t2 = new Thread(eventJoc2);
		Thread t3 = new Thread(eventJoc3);
		Thread t4 = new Thread(eventJoc4);
		Thread t5 = new Thread(eventJoc5);

		System.out.println("Inici");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		System.out.println("Final");
		
		Thread t1b = new Thread();
	}

}
