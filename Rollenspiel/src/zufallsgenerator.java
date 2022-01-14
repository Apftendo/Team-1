import java.util.Random;


// static -> Klassenmethoden. Wir wollen aber immer Objektmethoden außer es gibt echt wichtige Gründe
// Klassen werden groß geschrieben
public class zufallsgenerator {
    public void zufall() {

    int[] arr= {
        1,2
    };
    Random r = new Random();
    int randomnumber=r.nextInt(arr.length)+1;
		
        randomnumber=r.nextInt(arr.length)+1;       // es wird zufällig eine zahl zwischen 1 und 2 gewählt
        
		// 0 oder 1 ->  +1  -> 1 oder 2
        
		switch (randomnumber) {
		case 1:
			System.out.println("Du erreichst sicher die andere Seite und betrittst einen kleinen Raum, in ihm sind nur ein paar alte Essutensilien.");
    
            
			break;
         
		case 2:
			System.out.println("Unter dir bricht eine Planke weg und du fällst in den unvermeidbaren Tod.");
            int nummer = 0;
            System.exit(0); // dadurch wird das Rollenspiel App.java auch wirklich beendet
			
			
		default:
			System.out.println("Fehler, Spiel bitte neu Starten");
			break;      // default damit das switch benutzungsfähig ist, kann hier nicht vorkommen
		
	}



    }


    }






