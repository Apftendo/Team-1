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
		
        randomnumber=r.nextInt(arr.length)+1;
        System.out.println("Methpde Zufall ->:" + randomnumber);
		// 0 oder 1 ->  +1  -> 1 oder 2
        boolean zufall = false;
		switch (randomnumber) {
		case 1:
			System.out.println("Du erreichst sicher die andere Seite und betrittst einen kleinen Raum, in ihm sind nur ein paar alte Essutensilien.");
            zufall = true;
            
			break;
			
		case 2:
			System.out.println("Unter die bricht eine Planke weg und du fällst in den unvermeidbaren Tod.");
            break;
			
			
		default:
			System.out.println("Klappt nicht");
			break;
		
	}



    }


    }






