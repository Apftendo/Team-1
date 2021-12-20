import java.util.concurrent.TimeUnit;

public class Countdown {
    public void ablauf() throws InterruptedException  {
        int zahl = 4;
	
	do {
	
		zahl = zahl -1;
		System.out.println(zahl);
		TimeUnit.SECONDS.sleep(1);
    } while(zahl>1);
    TimeUnit.SECONDS.sleep(1);
    System.out.println("Spiel startet!!");
    TimeUnit.SECONDS.sleep(1);


    }
    
}
