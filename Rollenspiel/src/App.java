import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Du befindest dich in einer Schenke in der Stadt Grimmdal, vor wenigen Augenblicken hast du eine anfrage angenommen eine alte Ruine und Höhle zu erkunden. Bevor du aber weiter Infos erhältst, musst du jedoch eine Extraklausel unterschreiben, die aussagt das der Auftraggeber im Falle von Verletzungen und oder Tod keine Verantwortung übernimmt. Willst du Unterschreiben? ");

        String entscheidung1 = scanner.nextLine();

        if (entscheidung1.equals("Nein")) {
            System.out.println(
                    "Nein:\n  Du entscheidest dich den Auftrag doch nicht anzunehmen, verlässt die Schenke\n und gehst weiter deiner Wege. Du erfährst nicht welche Geheimnisse und Schätze\n sich in den Ruinen verbergen und gehst zur nächsten Stadt, um den nächsten potenziell\n tödlichen Auftrag in Augenschein zu nehmen.(ENDING) ");
            return;
        } else if (entscheidung1.equals("Ja")) {

        } else {
            System.out.println("Sag bitte Ja oder Nein");
            return;
        }

        System.out.println("Wie heißt du?");
        String name = scanner.nextLine();
        System.out.println("");
        System.out.println(
                "Noch während die Feder auf dem Papier kratzt,\nfängt die Frau an der Auftragsausgabe schon\nwieder an zu Sprechen \"Also "
                        + name + ", ungewöhnlicher Name, aber das soll\nuns ja nicht aufhalten.");

        scanner.nextLine();
        System.out.println("");
        System.out.println(
                "Die gefragten Ruinen befinden sich von hier aus ungefähr 6 Meilen westlich von\nhier. Sie ist trotz der geringen Entfernung erst Anfang des Jahres entdeckt\nworden, da sie sich in einem Tal befindet, das vorher unerreichbar war und\ndurch einen Erdrutsch, das durch das letzte Erdbeben verursacht wurde, zugänglich\n");
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

        scanner.nextLine();
        System.out.println("\"Das sind die gerade genannten Infos plus eine Karte um");
        System.out.println("dorthin zu finden, eine für die überirdische Umgebung haben wir nicht.");
        System.out.println("Wir konnten nach der Entdeckung leider keinen Kartographen finden der bereit wäre");
        System.out.println("dort hinzugehen, und eine Karte zu zeichnen.");
        System.out.println("");
        System.out.println("");

        scanner.nextLine();
        System.out.println("Ach, und falls du zufällig zeichnen kannst oder irgendwie");
        System.out.println("doch jemanden findest der bereit wäre eine Karte zu zeichnen würden wir dafür");
        System.out.println("auch extra zahlen.\"");
        System.out.println("");
        System.out.println("");

        scanner.nextLine();
        System.out.println("Du bedankst dich bei der Frau und denkst über deine nächsten");
        System.out.println("schritte vor dem Aufbruch nach.");

        scanner.nextLine();
        System.out.println("Du ruhst dich vor dem Aufbruch aus und schläfst bis zum Morgengrauen (1)");

        scanner.nextLine();
        System.out.println("Du entscheidest dich sofort aufzubrechen (2)");

        scanner.nextLine();
        System.out.println("Du ruhst dich nicht aus und gehst Proviant kaufen (3)");

        scanner.nextLine();
        System.out.println("Wofür entscheidest du dich?");

        String entscheidung2 = scanner.nextLine();
        boolean blau = false;
        boolean gelb = false;
        boolean lila = false;
        if (entscheidung2.equals("1")) {
            System.out.println("In der Entfernung kannst du wage die Umrisse der Ruine");
            System.out.println("ausmachen und die verlassene Siedlung vor Ihr. Die ganze Umgebung im Tal ist in");
            System.out.println("einen leichten Schleier aus Nebel gehüllt, er ist nicht sonderlich dicht und du");
            System.out.println("kannst von deiner erhobenen Position zumindest die Umrisse von allem erkennen. Das");
            System.out.println("Gebiet vor dir ist ein Sumpfartiges Nass Land welches sich über das halbe Tal");
            System.out.println("erstreckt, Glücklicherweise sind noch Überreste von Wegweisern übrig die von");
            System.out.println("den vorherigen Bewohnern aufgestellt wurden um zu vermeiden das Reisende die");
            System.out.println("diese Ansiedelung besuchten vom Weg abkamen und ertranken.");
            scanner.nextLine();
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Wegweiser, den du entdeckt hast, sieht aus als wäre er");
            System.out.println("von jemandem bewegt worden um die Richtung besser zu erkennen in die man gehen muss");
            scanner.nextLine();
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Der Nebel ist dichter als erwartet, willst du dem Wegweiser trotzdem noch Folgen? (Q)");
            blau = true;
        } else if (entscheidung2.equals("2")) {
            System.out.println("Du erreichst das Tal.");
            scanner.nextLine();
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
            scanner.nextLine();
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Du kannst jedoch die angegebene Richtung durch den Dreck auf dem Schild nicht richtig");
            System.out.println("erkennen und musst den Dreck erst entfernen, um herauszufinden wo es lang geht");
            scanner.nextLine();
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Der Nebel ist dichter als erwartet, willst du dem Wegweiser trotzdem noch Folgen?(Q)");
            gelb = true;
        } else if (entscheidung2.equals("3")) {
            System.out.println("In der Entfernung kannst du wage die Umrisse der Ruine");
            System.out.println("ausmachen und die verlassene Siedlung vor Ihr. Die ganze Umgebung im Tal ist in");
            System.out.println("einen leichten Schleier aus Nebel gehüllt, er ist nicht sonderlich dicht und du");
            System.out.println("kannst von deiner erhobenen Position zumindest die Umrisse von allem erkennen.");
            System.out.println("Das Gebiet vor dir ist ein Sumpfartiges Nass Land welches sich über das halbe Tal");
            System.out.println("erstreckt, Glücklicherweise sind noch Überreste von Wegweisern übrig die von");
            System.out.println("den vorherigen Bewohnern aufgestellt wurden um zu vermeiden das Reisende die");
            System.out.println("diese Ansiedelung besuchten vom Weg abkamen und ertranken.");
            scanner.nextLine();
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Der Wegweiser, den du entdeckt hast, sieht aus als wäre er");
            System.out.println("von jemandem bewegt worden um die Richtung besser zu erkennen in die man gehen muss");
            scanner.nextLine();
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Der Nebel ist dichter als erwartet, willst du dem Wegweiser trotzdem noch Folgen?(Q)");
            lila = true;
        } else {
            System.out.println("Bitte entscheide dich für 1,2 oder 3.");
            return;
        }

        String entscheidung3 = scanner.nextLine();

        if (entscheidung3.equals("Ja")) {
            System.out.println("Ja:");
            System.out.println("Du folgst dem Wegweiser und gehst in das Moorige Gebiet, nach einer weile kannst du");
            System.out.println("den nächsten Wegweiser ausmachen und gehst auf ihn zu. Das Schild des letzten");
            System.out.println("ist im Nebel verschwunden, eine Umkehr wäre jetzt gefährlicher als weiterzugehen.");
        } else if (entscheidung3.equals("Nein")) {
            System.out.println("Nein:");
            System.out.println("");
            System.out.println(
                    "Du drehst dichum und willst wieder hinauf zum Eingang gehen, jedoch hat sich der Nebel so");
            System.out.println("verdichtet das du nicht mehr ausmachen kannst auf welchem weg du gekommen bist.");
            System.out.println(
                    "Also gehst du in die Richtung aus der du denkst aus der du gekommen bist gekommen bist.\nNach einer Weile ziellosen Herumlaufens, sind in der Entfernung lichter auszumachen.");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Hältst du auf die Lichter zu?(Q)");

        } else {
            System.out.println("Entscheid dich bitte für Ja oder Nein.");
            return;
        }

        String entscheidung4 = scanner.nextLine();
        if (entscheidung4.equals("Ja") && entscheidung3.equals("Nein")) {
            System.out.println("Ja:");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            scanner.nextLine();
            System.out.println("Du gehst weiter auf die Lichter zu. der Boden unter dir wird");
            System.out.println("weicher, aber dir fällt das schon nicht mehr auf. Du gehst hoffnungsvoll weiter");
            System.out.println("auf die lichter zu. Vielleicht ist es ja jemand anderes der auch");
            System.out.println("denselben Auftrag angenommen hat, vielleicht sind es Bewohner die sich nach der");
            System.out.println("Zerstörung hierhin zurückgezogen, und irgendwie überlebt haben. Noch während du");
            System.out.println("über all dies nachdenkst, gibt der vermeintliche Boden unter dir nach, du");
            System.out.println("sackst mit einem Ruck mehrere Meter tief ab. Du versuchst verzweifelt nach Luft zu");
            System.out.println("schnappen und nach oben zu schwimmen. Es fehlen nur noch wenige handbreit, bis du die");
            System.out.println("Oberfläche erreichst und dich an Land ziehen kannst, jedoch wirst du plötzlich mit");
            System.out.println("einem starken ruck nach unten gerissen, du spürst das es eine Hand ist die dich");
            System.out.println("runter zieht, dann eine zweite und eine dritte. In dem trüben Wasser kannst du");
            System.out.println("sie erkennen,kalte, kalkweiße fast schon skelettartige Gestalten. Erbarmungslos");
            System.out.println("ziehen sie dich hinab, und während dein Kämpfen nach Luft und der Oberfläche");
            System.out.println("immer schwächer wird und schließlich aufhört, fallen dir Geschichten aus deiner");
            System.out.println("Kindheit wieder ein. Geschichten die dir von deinen Eltern und Großeltern");
            System.out.println("erzählt wurden, Geschichten von Irrlichtern die in Mooren von den Ertrunkenen");
            System.out.println("geschaffen werden um andere unwissende Wanderer in ihr nasses Grab zu ziehen.");
            System.out.println("Du dachtest sie seien ein Mythos und hast diese Geschichten eigentlich schon längst");
            System.out.println("vergessen, viel zu spät erst realisiertes du das sie es doch nicht waren…(DEAD)");
            return;
        } else if (entscheidung4.equals("Nein")) {
            System.out.println("Nein:");
            System.out.println("");
            System.out.println("");
            System.out.println("Du gehst nicht auf die Lichter zu, Geschichten aus deiner");
            System.out.println("Kindheit von deinen Eltern und Großeltern warnen dich den Irrlichtern nicht zu");
            System.out.println("folgen. Du wanderst noch eine weile durch den Nebel und erreichst fast wie durch");
            System.out.println("ein Wunder den zweiten Wegweiser sodass du dem vorgegebenen Weg weiter folgen kannst.");
        }

        // schließen des Scanners
        scanner.close();

    }
}
