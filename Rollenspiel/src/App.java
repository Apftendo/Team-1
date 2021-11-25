import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        

       Scanner scanner = new Scanner(System.in);



        System.out.println("Du befindest dich in einer Schenke in der Stadt Grimmdal, vor wenigen Augenblicken hast du eine anfrage angenommen eine alte Ruine und Höhle zu erkunden. Bevor du aber weiter Infos erhältst, musst du jedoch eine Extraklausel unterschreiben, die aussagt das der Auftraggeber im Falle von Verletzungen und oder Tod keine Verantwortung übernimmt. Willst du Unterschreiben? ");

        String entscheidung1 = scanner.nextLine();

        if(entscheidung1.equals("Nein")){
            System.out.println("Nein:\n  Du entscheidest dich den Auftrag doch nicht anzunehmen, verlässt die Schenke\n und gehst weiter deiner Wege. Du erfährst nicht welche Geheimnisse und Schätze\n sich in den Ruinen verbergen und gehst zur nächsten Stadt, um den nächsten potenziell\n tödlichen Auftrag in Augenschein zu nehmen. ");
        } 
        else if(entscheidung1.equals("Ja")){
            System.out.println("Wie heißt du?");
            String name = scanner.nextLine();

        }
        else {
            System.out.println("Sag bitte Ja oder Nein");
        }

        System.out.println("Noch während die Feder auf dem Papier kratzt, fängt die Frau an der Auftragsausgabe schon\nwieder an zu Sprechen „Also [Name], ungewöhnlicher Name, aber das soll
        uns ja nicht aufhalten.\n
        
        Die gefragten Ruinen befinden sich von hier aus ungefähr 6 Meilen westlich von
        hier. Sie ist trotz der geringen Entfernung erst Anfang des Jahres entdeckt
        worden, da sie sich in einem Tal befindet, das vorher unerreichbar war und
        durch einen Erdrutsch, das durch das letzte Erdbeben verursacht wurde, zugänglich
        ist. Die Ruinen sind größtenteils unterirdisch, nimm also eine Lichtquelle mit.
        Was dir vielleicht auch schon aufgefallen ist, ist die astronomische Höhe der
        Belohnung und die ungewöhnliche Extraklausel, der Auftraggeber ist ein Adeliger
        dessen Neugierde und Geldgier wohl groß genug sind um ein zurückziehen des
        Auftrages, nach dem die letzte Gruppe die den Auftrag annahm nicht zurückkehrte,
        zu verhindern. Außerdem sind die Leute Nach dem Zwischenfall mit der Nazarick Gruft
        vorsichtig was die Erkundung von unbekannten Ruinen angeht.“         
        
        Sie überreicht dir einen
        Stapel verschiedener Papiere
        
        
        
        „Das sind die gerade genannten Infos plus eine Karte um
        dorthin zu finden, eine für die überirdische Umgebung haben wir nicht. Wir
        konnten nach der Entdeckung leider keinen Kartographen finden der bereit wäre
        dort hinzugehen, und eine Karte zu zeichnen.
        
        
        
        Ach, und falls du zufällig zeichnen kannst oder irgendwie
        doch jemanden findest der bereit wäre eine Karte zu zeichnen würden wir dafür
        auch extra zahlen.“
        
         
         
        Du bedankst dich bei der Frau und denkst über deine nächsten
        schritte vor dem Aufbruch nach.  
        
        
        
                               
        



        //schließen des Scanners
        scanner.close();
    }
}
