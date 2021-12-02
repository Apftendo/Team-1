import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        

       Scanner scanner = new Scanner(System.in);



        System.out.println("Du befindest dich in einer Schenke in der Stadt Grimmdal, vor wenigen Augenblicken hast du eine anfrage angenommen eine alte Ruine und Höhle zu erkunden. Bevor du aber weiter Infos erhältst, musst du jedoch eine Extraklausel unterschreiben, die aussagt das der Auftraggeber im Falle von Verletzungen und oder Tod keine Verantwortung übernimmt. Willst du Unterschreiben? ");

        String entscheidung1 = scanner.nextLine();

        if(entscheidung1.equals("Nein")){
            System.out.println("Nein:\n  Du entscheidest dich den Auftrag doch nicht anzunehmen, verlässt die Schenke\n und gehst weiter deiner Wege. Du erfährst nicht welche Geheimnisse und Schätze\n sich in den Ruinen verbergen und gehst zur nächsten Stadt, um den nächsten potenziell\n tödlichen Auftrag in Augenschein zu nehmen. ");
            return;
        } 
        else if(entscheidung1.equals("Ja")){
           
            

        }
        else {
            System.out.println("Sag bitte Ja oder Nein");
            return;
        }
        
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Wie heißt du?");
        String name = scanner1.nextLine();
        System.out.println("");
        System.out.println("Noch während die Feder auf dem Papier kratzt,\nfängt die Frau an der Auftragsausgabe schon\nwieder an zu Sprechen \"Also "+name+", ungewöhnlicher Name, aber das soll\nuns ja nicht aufhalten.");
        Scanner lücke1 = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("");
        System.out.println("Die gefragten Ruinen befinden sich von hier aus ungefähr 6 Meilen westlich von\nhier. Sie ist trotz der geringen Entfernung erst Anfang des Jahres entdeckt\nworden, da sie sich in einem Tal befindet, das vorher unerreichbar war und\ndurch einen Erdrutsch, das durch das letzte Erdbeben verursacht wurde, zugänglich\n");
        System.out.println("ist. Die Ruinen sind größtenteils unterirdisch, nimm also eine Lichtquelle mit.");
        System.out.println("Was dir vielleicht auch schon aufgefallen ist, ist die astronomische Höhe der");
        System.out.println("Belohnung und die ungewöhnliche Extraklausel, der Auftraggeber ist ein Adeliger");
        System.out.println("dessen Neugierde und Geldgier wohl groß genug sind um ein zurückziehen des");
        System.out.println("Auftrages, nach dem die letzte Gruppe die den Auftrag annahm nicht zurückkehrte,");
        System.out.println("zu verhindern. Außerdem sind die Leute Nach dem Zwischenfall mit der Nazarick Gruft");
        System.out.println("vorsichtig was die Erkundung von unbekannten Ruinen angeht.\"");    
        System.out.println("");
        System.out.println("Sie überreicht dir einen Stapel verschiedener Papiere");
        System.out.println("");
        System.out.println("");
        Scanner lücke2 = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("\"Das sind die gerade genannten Infos plus eine Karte um");
        System.out.println("dorthin zu finden, eine für die überirdische Umgebung haben wir nicht.");
        System.out.println("Wir konnten nach der Entdeckung leider keinen Kartographen finden der bereit wäre");
        System.out.println("dort hinzugehen, und eine Karte zu zeichnen.");
        System.out.println("");
        System.out.println("");
        Scanner lücke3 = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Ach, und falls du zufällig zeichnen kannst oder irgendwie");
        System.out.println("doch jemanden findest der bereit wäre eine Karte zu zeichnen würden wir dafür");
        System.out.println("auch extra zahlen.\"");
        System.out.println("");
        System.out.println("");
        Scanner lücke4 = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Du bedankst dich bei der Frau und denkst über deine nächsten");
        System.out.println("schritte vor dem Aufbruch nach.");  
        Scanner lücke5 = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Du ruhst dich vor dem Aufbruch aus und schläfst bis zum Morgengrauen (1)");
        Scanner lücke6 = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Du entscheidest dich sofort aufzubrechen (2)");
        Scanner lücke7 = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Du ruhst dich nicht aus und gehst Proviant kaufen (3)");
        Scanner lücke8 = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Wofür entscheidest du dich?");

        String entscheidung2 = scanner.nextLine();

        if(entscheidung2.equals("1")){
            System.out.println("In der Entfernung kannst du wage die Umrisse der Ruine");
            System.out.println("ausmachen und die verlassene Siedlung vor Ihr. Die ganze Umgebung im Tal ist in");
            System.out.println("einen leichten Schleier aus Nebel gehüllt, er ist nicht sonderlich dicht und du");
            System.out.println("kannst von deiner erhobenen Position zumindest die Umrisse von allem erkennen. Das");
            System.out.println("Gebiet vor dir ist ein Sumpfartiges Nass Land welches sich über das halbe Tal");
            System.out.println("erstreckt, Glücklicherweise sind noch Überreste von Wegweisern übrig die von");
            System.out.println("den vorherigen Bewohnern aufgestellt wurden um zu vermeiden das Reisende die");
            System.out.println("diese Ansiedelung besuchten vom Weg abkamen und ertranken.");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Wegweiser, den du entdeckt hast, sieht aus als wäre er");
            System.out.println("von jemandem bewegt worden um die Richtung besser zu erkennen in die man gehen muss");
            
            
            
            System.out.println("Der Nebel ist dichter als erwartet, willst du dem Wegweiser trotzdem noch Folgen?");
        }
        else if(entscheidung2.equals("2")){
            System.out.println("Du erreichst das Tal.");                                                                                                                                 
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("In der Entfernung kannst du wage die Umrisse der Ruine");
            System.out.println("ausmachen und die verlassene Siedlung vor Ihr. Die ganze Umgebung im Tal ist in");
            System.out.println("einen leichten Schleier aus Nebel gehüllt, er ist nicht sonderlich dicht und du");
            System.out.println("kannst von deiner erhobenen Position zumindest die Umrisse von allem erkennen.");
            System.out.println("Das Gebiet vor dir ist ein Sumpfartiges Nass Land welches sich über das halbe Tal");
            System.out.println("erstreckt, Glücklicherweise sind noch Überreste von Wegweisern übrig die von");
            System.out.println("den vorherigen Bewohnern aufgestellt wurden um zu vermeiden das Reisende die");
            System.out.println("diese Ansiedelung besuchten vom Weg abkamen und ertranken.");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Du kannst jedoch die angegebene Richtung durch den Dreck auf dem Schild nicht richtig");
            System.out.println("erkennen und musst den Dreck erst entfernen, um herauszufinden wo es lang geht");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Der Nebel ist dichter als erwartet, willst du dem Wegweiser trotzdem noch Folgen?"); 
        }
        else if(entscheidung2.equals("3")){
            System.out.println("In der Entfernung kannst du wage die Umrisse der Ruine");
            System.out.println("ausmachen und die verlassene Siedlung vor Ihr. Die ganze Umgebung im Tal ist in");
            System.out.println("einen leichten Schleier aus Nebel gehüllt, er ist nicht sonderlich dicht und du");
            System.out.println("kannst von deiner erhobenen Position zumindest die Umrisse von allem erkennen.");
            System.out.println("Das Gebiet vor dir ist ein Sumpfartiges Nass Land welches sich über das halbe Tal");
            System.out.println("erstreckt, Glücklicherweise sind noch Überreste von Wegweisern übrig die von");
            System.out.println("den vorherigen Bewohnern aufgestellt wurden um zu vermeiden das Reisende die");
            System.out.println("diese Ansiedelung besuchten vom Weg abkamen und ertranken.");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            
            System.out.println("Der Wegweiser, den du entdeckt hast, sieht aus als wäre er");
            System.out.println("von jemandem bewegt worden um die Richtung besser zu erkennen in die man gehen muss");
            
            
            System.out.println("Der Nebel ist dichter als erwartet, willst du dem Wegweiser trotzdem noch Folgen?");
        }


        
        
                               



        //schließen des Scanners
        scanner.close();
        scanner1.close();
    }
}
