import java.util.concurrent.TimeUnit;

public class Countdown {
    public void ablauf() throws InterruptedException  {
        int zahl = 4;           // Es wird mit der Zahl 4 begonnen da von ihr die -1 abgezogen werden
	
	do {
	
		zahl = zahl -1;
		System.out.println(zahl);           // while-loop solange die zahl größer als 1 ist wird immer die niedrigere zahl angezeigt
        TimeUnit.SECONDS.sleep(1);
    } while(zahl>1);
    TimeUnit.SECONDS.sleep(1);
    System.out.println("Spiel startet!!");
    TimeUnit.SECONDS.sleep(1);      // sleep damit alles nicht zu schnell vorbei geht ( wartet nach jeder aktion 1 sekunde)


    }
    
}
