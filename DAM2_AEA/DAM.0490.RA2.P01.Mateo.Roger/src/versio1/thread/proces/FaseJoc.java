package versio1.thread.proces;

import versio1.thread.domini.EventJoc;

public class FaseJoc {
	
	public static void main(String[] args)
	{
		EventJoc eventJoc1 = new EventJoc("mina", 10, 800, 600);
		EventJoc eventJoc2 = new EventJoc("cactus", 5, 800, 600);
		EventJoc eventJoc3 = new EventJoc("sotrac", 7, 400, 400);
		EventJoc eventJoc4 = new EventJoc("lo clot", null, 800, 600);
		EventJoc eventJoc5 = new EventJoc("columna", 11, 800, 600);
		
//		eventJoc1.aparicions();
//		eventJoc2.aparicions();
//		eventJoc3.aparicions();
//		eventJoc4.aparicions();
//		eventJoc5.aparicions();
		
		System.out.println("Inici");
		eventJoc1.start();
		eventJoc2.start();
		eventJoc3.start();
		eventJoc4.start();
		eventJoc5.start();
		System.out.println("Final");
	}

}
