import java.util.Scanner;



public class App {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen in unserem Spiel. (drück Enter)");
        scanner.nextLine();
        System.out.println("Wie du siehst musst du du die Enter Taste drücken um weitere Zeilen zu bekommen. (drück Enter)");          // kurze einführung ins Spiel und grundlegende Regeln
        scanner.nextLine();
        System.out.println("Das musst du meistens drücken, es sei den ein Q steht am Ende.\nDann musst du etwas eingeben das in einer Klammer davor stand. Und genauso, nicht anders!");
        scanner.nextLine();
        System.out.println("Viel Spaß!!");
        scanner.nextLine();





        Countdown count = new Countdown();
        count.ablauf();         // countdown für den start, siehe andere Klasse (Projektorientiertes Programmieren)

        

        System.out.println(
                "Du befindest dich in einer Schenke in der Stadt Grimmdal, vor wenigen Augenblicken hast du eine anfrage angenommen eine alte Ruine und Höhle zu erkunden. Bevor du aber weiter Infos erhältst, musst du jedoch eine Extraklausel unterschreiben, die aussagt das der Auftraggeber im Falle von Verletzungen und oder Tod keine Verantwortung übernimmt. Willst du Unterschreiben? (Q) (Ja oder Nein) ");

        String entscheidung1 = scanner.nextLine();

        if (entscheidung1.equals("Nein")) {
            System.out.println(
                    "Nein:\n  Du entscheidest dich den Auftrag doch nicht anzunehmen, verlässt die Schenke\n und gehst weiter deiner Wege. Du erfährst nicht welche Geheimnisse und Schätze\n sich in den Ruinen verbergen und gehst zur nächsten Stadt, um den nächsten potenziell\n tödlichen Auftrag in Augenschein zu nehmen.(ENDING) "); // Ende (erstes) bist nicht gestorben :)
            return;
        } else if (entscheidung1.equals("Ja")) { //nur wenn man ja sagt kommt man weiter

        } else {
            System.out.println("Sag bitte Ja oder Nein"); // falls man etwas falsches sagt wird man direkt zurück geschickt
            return;
        }

        System.out.println("Wie heißt du? (Q)");
        String name = scanner.nextLine(); // abfrage von Namen
        System.out.println("");
        System.out.println(
                "Noch während die Feder auf dem Papier kratzt,\nfängt die Frau an der Auftragsausgabe schon\nwieder an zu Sprechen \"Also "
                        + name + ", ungewöhnlicher Name, aber das soll\nuns ja nicht aufhalten."); // das einzigste mal das dein Name verwendung findet

        scanner.nextLine();
        System.out.println("");
        System.out.println(
                "Die gefragten Ruinen befinden sich von hier aus ungefähr 6 Meilen westlich von\nhier. Sie ist trotz der geringen Entfernung erst Anfang des Jahres entdeckt\nworden, da sie sich in einem Tal befindet, das vorher unerreichbar war und\ndurch einen Erdrutsch, das durch das letzte Erdbeben verursacht wurde, zugänglich ist.");
                scanner.nextLine();
        System.out.println("Die Ruinen sind größtenteils unterirdisch, nimm also eine Lichtquelle mit.");
        System.out.println("Was dir vielleicht auch schon aufgefallen ist, ist die astronomische Höhe der");
        System.out.println("Belohnung und die ungewöhnliche Extraklausel, der Auftraggeber ist ein Adeliger");
        System.out.println("dessen Neugierde und Geldgier wohl groß genug sind um ein zurückziehen des");
        System.out.println("Auftrages, nach dem die letzte Gruppe die den Auftrag annahm nicht zurückkehrte,");
        System.out.println("zu verhindern.");
        scanner.nextLine();
        System.out.println("Außerdem sind die Leute Nach dem Zwischenfall mit der Nazarick Gruft vorsichtig was die Erkundung von unbekannten Ruinen angeht.");
        System.out.println("Sie überreicht dir einen Stapel verschiedener Papiere.");
        scanner.nextLine();
        System.out.println("\"Das sind die gerade genannten Infos plus eine Karte um");
        System.out.println("dorthin zu finden, eine für die überirdische Umgebung haben wir nicht.");
        System.out.println("Wir konnten nach der Entdeckung leider keinen Kartographen finden der bereit wäre");
        System.out.println("dort hinzugehen, und eine Karte zu zeichnen.");
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
        System.out.println("Du ruhst dich vor dem Aufbruch aus und schläfst bis zum Morgengrauen. (1)");
        System.out.println("");
        System.out.println("Du entscheidest dich sofort aufzubrechen. (2)");                    // diese Entscheidungen entscheiden über den weiteren Ablauf des Spiels, implementierung des Kama-Systems
        System.out.println("");
        System.out.println("Du ruhst dich nicht aus und gehst Proviant kaufen. (3)");
        System.out.println("");
        System.out.println("Wofür entscheidest du dich? (Q)  Diese Entscheidungen bestimmen über den weiterenverlauf des Spiels.");

        String entscheidung2 = scanner.nextLine();
        boolean blau = false;
        boolean gelb = false;               // damit es mit den boolean funktioniert müssen sie zuerst erstellt und auf falsch gestellt werden, durch die Entscheidung wird erst einer richtig bzw. aktiviert
        boolean lila = false;
        if (entscheidung2.equals("1")) {
            System.out.println("In der Entfernung kannst du wage die Umrisse der Ruine");
            System.out.println("ausmachen und die verlassene Siedlung vor Ihr. Die ganze Umgebung im Tal ist in");
            System.out.println("einen leichten Schleier aus Nebel gehüllt, er ist nicht sonderlich dicht und du");
            System.out.println("kannst von deiner erhobenen Position zumindest die Umrisse von allem erkennen.");
            scanner.nextLine();
            System.out.println("Das Gebiet vor dir ist ein Sumpfartiges Nass Land, welches sich über das halbe Tal");
            System.out.println("erstreckt, Glücklicherweise sind noch Überreste von Wegweisern übrig die von");
            System.out.println("den vorherigen Bewohnern aufgestellt wurden, um zu vermeiden das Reisende, die");
            System.out.println("diese Ansiedelung besuchten vom Weg abkamen und ertranken.");
            scanner.nextLine();
            System.out.println("");                                                                                                 //jede Entscheidung bekommt ein boolean der abgefragt wird und je nachdem ein bestimmtes Ereignis hervorruft
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(" Der Wegweiser, den du entdeckt hast, sieht aus als wäre er");
            System.out.println("von jemandem bewegt worden, um die Richtung besser zu erkennen in die man gehen muss.");
            scanner.nextLine();
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Der Nebel ist dichter als erwartet, willst du dem Wegweiser trotzdem noch Folgen? (Q) (Ja oder Nein)");
            blau = true;                // diese Entscheidung gibt nur blaue und standart Texte zurück
        } else if (entscheidung2.equals("2")) {
            System.out.println("Du erreichst das Tal.");
            scanner.nextLine();
            System.out.println("");
            System.out.println("In der Entfernung kannst du wage die Umrisse der Ruine");
            System.out.println("ausmachen und die verlassene Siedlung vor Ihr. Die ganze Umgebung im Tal ist in");
            System.out.println("einen leichten Schleier aus Nebel gehüllt, er ist nicht sonderlich dicht und du");
            System.out.println("kannst von deiner erhobenen Position zumindest die Umrisse von allem erkennen.");
            scanner.nextLine();
            System.out.println("Das Gebiet vor dir ist ein Sumpfartiges Nass Land welches sich über das halbe Tal");
            System.out.println("erstreckt, Glücklicherweise sind noch Überreste von Wegweisern übrig die von");
            System.out.println("den vorherigen Bewohnern aufgestellt wurden um zu vermeiden das Reisende die");
            System.out.println("diese Ansiedelung besuchten vom Weg abkamen und ertranken.");
            scanner.nextLine();
            System.out.println("Du kannst jedoch die angegebene Richtung durch den Dreck auf dem Schild nicht richtig");
            System.out.println("erkennen und musst den Dreck erst entfernen, um herauszufinden wo es lang geht");
            scanner.nextLine();
            System.out.println("");
            System.out.println("Der Nebel ist dichter als erwartet, willst du dem Wegweiser trotzdem noch Folgen?(Q) (Ja oder Nein)");
            gelb = true;        // diese Entscheidung gibt nur gelbe und standart Texte zurück
        } else if (entscheidung2.equals("3")) {
            System.out.println("In der Entfernung kannst du wage die Umrisse der Ruine");
            System.out.println("ausmachen und die verlassene Siedlung vor Ihr. Die ganze Umgebung im Tal ist in");
            System.out.println("einen leichten Schleier aus Nebel gehüllt, er ist nicht sonderlich dicht und du");
            System.out.println("kannst von deiner erhobenen Position zumindest die Umrisse von allem erkennen.");
            scanner.nextLine();
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
            System.out.println("Der Nebel ist dichter als erwartet, willst du dem Wegweiser trotzdem noch Folgen?(Q) (Ja oder Nein)");
            lila = true;            // diese Entscheidung gibt nur lila und standart Texte zurück
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
                    "Du drehst dich um und willst wieder hinauf zum Eingang gehen, jedoch hat sich der Nebel so");
            System.out.println("verdichtet das du nicht mehr ausmachen kannst auf welchem weg du gekommen bist.");
            scanner.nextLine();
            System.out.println("Also gehst du in die Richtung aus der du denkst aus der du gekommen bist gekommen bist.\nNach einer Weile ziellosen Herumlaufens, sind in der Entfernung lichter auszumachen.");
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
            System.out.println("Du gehst weiter auf die Lichter zu. Der Boden unter dir wird");
            System.out.println("weicher, aber dir fällt das schon nicht mehr auf. Du gehst hoffnungsvoll weiter");
            System.out.println("auf die lichter zu. Vielleicht ist es ja jemand anderes der auch");
            System.out.println("denselben Auftrag angenommen hat, vielleicht sind es Bewohner die sich nach der");
            System.out.println("Zerstörung hierhin zurückgezogen, und irgendwie überlebt haben.");
            scanner.nextLine();
            System.out.println("Noch während du über all dies nachdenkst, gibt der vermeintliche Boden unter dir nach, du");
            System.out.println("sackst mit einem Ruck mehrere Meter tief ab. Du versuchst verzweifelt nach Luft zu");
            System.out.println("schnappen und nach oben zu schwimmen. Es fehlen nur noch wenige handbreit, bis du die");
            System.out.println("Oberfläche erreichst und dich an Land ziehen kannst, jedoch wirst du plötzlich mit");       // schlechte Entscheidung, ester möglicher tot im Spiel
            System.out.println("einem starken ruck nach unten gerissen, du spürst das es eine Hand ist die dich");
            System.out.println("runter zieht, dann eine zweite und eine dritte. In dem trüben Wasser kannst du");
            System.out.println("sie erkennen,kalte, kalkweiße fast schon skelettartige Gestalten.");
            scanner.nextLine();
            System.out.println("Erbarmungslos ziehen sie dich hinab, und während dein Kämpfen nach Luft und der Oberfläche");
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

        System.out.println("Du folgst also weiter den Wegweisern durch das Moor.");
        scanner.nextLine();
        System.out.println("");
        System.out.println("In welcher Richtung der Ausgang liegt weißt du schon längst nicht mehr.");
        System.out.println("Nach einiger Zeit erreichst du den Rand des Dorfes und hältst");
        System.out.println("weiter auf die Festung zu, als du sie jedoch erreichst stellst du fest das es");     
        System.out.println("sich nicht um eine Festung handelt sondern um eine sehr gut Befestigte Mine,");
        System.out.println("welche wohl mal das Haupteinkommensmittel des Dorfes war.");
        System.out.println("Du betrittst die mine und Beginnst deinen abstieg.");
        scanner.nextLine();

        if (blau == true) {
            System.out.println("Das erste was dir schon nach wenigen metern auffällt ist das der Gang ausgeleuchtet ist.\nAn den Wänden befinden sich fakeln. Der bisher geradlinige weg spaltet sich in zwei gänge, aus dem rechten kommt ein leichtes blaues Leuchten, \naus dem linken hört man das leichte plätschern von Wasser(Q)");
            System.out.println("Gehst du links oder rechts? (Q) (Links oder Rechts)");
        }

        else if (gelb == true) {
            System.out.println("Der bisher geradlinige weg spaltet sich in zwei gänge,\naus dem rechten kommt ein leichtes blaues Leuchten, aus dem linken hört man das leichte plätschern von Wasser.\nGehst du links oder rechts?(Q) (Links oder Rechts)");                                                                                                               // hier werden die booleans zum erstenmal abgefragt
        }
        else if (lila == true) {
            System.out.println("Das erste was dir schon nach wenigen metern auffällt ist das der Gang ausgeleuchtet ist, an den wänden befinden sich fakeln.\n Der bisher geradlinige weg spaltet sich in zwei gänge, aus dem rechten kommt ein leichtes blaues Leuchten, aus dem linken hört man das leichte plätschern von Wasser.\nGehst du links oder rechts?(Q) (Links Rechts)");
        }
        else {
            return;
        }
        String entscheidung5 = scanner.nextLine();

        if (entscheidung5.equals("Links")) {
            System.out.println("Links:");
            System.out.println("Du gehst den Linken Gang entlang entlang und erreichst eine Kammer mit einem Teich in der Mitte, als du dich dem Teich näherst kanst du einen Schlüssel am Grund erkennen.\nDa der Teich nicht sonderlich tief ist könntest du ihn mit der Hand herrausnehmen.");  
            System.out.println("Willst du hineingreifen und den Schlüssel (Schlüssel) herausholen oder dich weiter umsehen (Umsehen)?(Q)");
        }
        else if (entscheidung5.equals("Rechts")) {
            System.out.println("Rechts:");
            System.out.println("Du gehst den rechten Gang entlang und entdeckst eine Kammer mit biolumineszierenden riesigen Pilzen.\nDu findest eine Wasserquelle und siehst ein parr Kleintiere die sich gerade an den Pilzen ernähren, sie scheinen also essbar zu sein.");
            System.out.println("Es sieht aus wie der perfeckte Ort um ein Lager aufzuschlagen, möchtest du dies tun?(Q) (Ja) oder (Nein)");
        }
        else {
            System.out.println("Sag bitte Links oder Rechts");
            return;
        }
        
        String entscheidung6 = scanner.nextLine();
        boolean notiz = false;
        String entscheidung6z = "hahhaha"; // damit jemand einen String überschreiben kann musste der String erst erstellt werden
        
        if (entscheidung5.equals("Links") && (entscheidung6.equals("Schlüssel"))) {
            System.out.println("Du springst in das hüfthohe Wasser hinein, wie du jedoch schnell merkst ist die flüssigkeit im Teich kein Wasser.\n Es ist eine hochgradige Lauge die von einem schleim ausgeschieden wird\n der dich jetzt and den Füßen fesselt sodass es kein entkommen mehr vor einem bad in der Lauge gibt. (Dead)");  
            return;
        }

        else if (entscheidung5.equals("Links") && (entscheidung6.equals("Umsehen"))) {
            System.out.println("");
            notiz = true;  // besonderes Ereignis das nur einmal abgefragt wird und einen bonus gibt
            System.out.println("Du siehst dich weiter im Raum um und findest einen langen haken und nutzt ihn, um den Schlüssel aus dem Teich zu fischen. Nachdem du den Schlüssel eingesammelt hast,");
            System.out.println("siehst du einen weiteren Durchgang, der zu einer Sackgasse führt. in dieser Sackgasse findest du ein Skelett mit einem Stift und einem Tagebuch in der Hand.");
            System.out.println("");
            scanner.nextLine();
            System.out.println("Was passierte:");
            System.out.println("Falls dies jemals irgendjemand findet, hoffe ich Antworten auf Wenigstens ein paar der Fragen zu haben die man sich vielleicht stellt, wenn man sich unsere zerstörte Siedlung ansieht.\nNachdem die Gorgone das Dorf angriff und die Einwohner entweder versteinerte, tötete oder zum Ertrinken in Richtung Moor jagte, fing sie an alle möglichen Reichtümer, die man im ganzen Dorf finden konnte zusammenzusammeln und im tiefsten Teil der Mine zu verstauen.\nIch selbst entkam ihr nur knapp und erlitt eine tödliche Wunde, die mich wohl sehr bald dahinraffen wird.\nDa ich also sowieso bald sterben werde kann ich auch meine Vermutung äußern, Ich glaube das die Gorgone vom alleinigen Herrscher und Overlord Ainz ooal gown geschickt wurde.\nWahrscheinlich ist unser Minendorf zu schnell zu unabhängig geworden.\nWas wohl der Grund wahr warum er uns ausgelöscht hat.\nWie traurig das wir ihm nicht mahl genug wert waren damit er selber kommt, um uns zu vernichten...");
            System.out.println("");
            scanner.nextLine();
            System.out.println("Nachdem du diesen Eintrag gelesen hast und dir nun bewusst bist was am Ende auf dich wartet kehrst du um und nimmst den rechten Pfad.");  
        }

        if (notiz == true) {
            System.out.println("Du gehst den rechten Gang entlang und entdeckst eine Kammer mit biolumineszierenden riesigen Pilzen.\nDu findest eine Wasserquelle und siehst ein parr Kleintiere die sich gerade an den Pilzen ernähren, sie scheinen also essbar zu sein.");
            System.out.println("Es sieht aus wie der perfeckte Ort um ein Lager aufzuschlagen, möchtest du dies tun?(Q) (Ja) oder (Nein)");
            entscheidung6z = scanner.nextLine();
        }
        boolean lagerfeuer = false;
         
        if (entscheidung6.equals("Ja") || (entscheidung6z.equals("Ja"))) {
             lagerfeuer = true;
        }
       
       
        if (lagerfeuer==true && (lila==true)) {             // heir werden zwei bedingungen gleichzeitig abgefragt
            System.out.println("Nachdem du dein Lager aufgeschlagen hast und dich hinlegst, fällst du nach wenigen Augenblicken in einen tiefen Schlaf.\nAls du nach einiger Zeit wieder erwachst und nach dem Beutel mit Proviant suchst findest du ihn von wurzeln bedeckt unter dem größten Pilz liegen,\nanscheinend haben dich die suchenden Wurzeln der Pilze durch den Beutel nicht entdeckt, was dir das Leben gerettet hat.");   
        }
        else if (lagerfeuer==true && (blau==true)) {
            System.out.println("Nachdem du dein Lager aufgeschlagen hast und dich hinlegst, fällst du in einen leichten Schlaf.\nZu deinem Glück, denn so bemerkst du die dich einwickelnden Wurzeln noch rechtzeitig und kannst entkommen.");
        }
        else if (lagerfeuer==true && (gelb==true)) {
            System.out.println("Nachdem du dein Lager aufgeschlagen hast und dich hinlegst, fällst du nach wenigen Augenblicken in einen tiefen Schlaf.\nDa du aber ohne dich auszuruhen aufgebrochen bist merkst du erst viel zu spät das dich die Wurzeln der umliegenden Pilze eingewickelt und immobilisiert haben.\nDie Wurzeln haben sich schon so stark um dich gewickelt das dein Schicksal als Nährstoff für die umliegenden Organismen besiegelt ist.");
            return;
        }

        System.out.println("Du gehst weiter durch die Kammer bis du an eine dreifache Abzweigung kommst.");
        scanner.nextLine();
        System.out.println("Der Linke Gang ist komplett dunkle und mit nur noch halb vorhandenen Barrikaden verschlossen.(Links)");
        System.out.println("");
        System.out.println("Aus dem mittleren Gang kommt ein schwacher Fauler verwesender Geruch (Mitte).");
        System.out.println("");
        System.out.println("Vom rechten Gang kommt ein leichter Luftzug und es wird ein wenig kühler als er dich berührt.(Rechts)");
        System.out.println("");
        System.out.println("Welchen Gang nimmst du? (Q)");

        String entscheidung7 = scanner.nextLine();

        if (entscheidung7.equals("Links")) {
            System.out.println("Links:");
            System.out.println("Du betrittst trotz des offensichtlichen Verbarrikadierens den Linken Gang.");
            System.out.println("Nach einiger Zeit bekommst du Kopfschmerzen, dir wird schwindelig und übel, schließlich wirst du bewusstlos und stirbst an einer Kohlenstoffmonoxid Vergiftung.(Dead)");
            return;
        }
        else if (entscheidung7.equals("Rechts")) {
            System.out.println("Rechts:");
            System.out.println("Du folgst der Frischluft und nimmst den rechten Gang.\nEr ist dunkel und du musst dich an der Wand entlangtasten, schließlich ertastest du einen Schalter und ziehst eilig an ihm.\nSobald der Hebel umgelegt wurde, öffnet sich eine Tür in der Wand und lässt blendendes Tageslicht hineinströmen.\nDu verlässt die Miene durch den geheimen Ausgang und gehst weiter deiner Wege, nur ein einziges mahl drehst du dich um und denkst über vielen mahle nach die du in den letzten zwei Tagen fast gestorben wärst,\ndann sendest du ein Dankesgebet gen Himmel und läufst weiter. (schlechtes ende)");
            return;
        }
        else if (entscheidung7.equals("Mitte")) {
            System.out.println("Mitte");
            System.out.println("Du betrittst den etwas unangenehm riechenden mittleren Gang und findest auch schnell herauf, warum es so stinkt.\nMan hört die Fliegen eher surren als das man die Leiche sieht, aber am Boden des Raumes vor dir liegt eine Leiche.\nWarum da eine Leiche liegt, kannst du auch schnell erkennen, der Raum ist rechteckig und geht genauso weit in die tiefe,\nwie er hoch ist, ein fall wäre, wie schon vom Vorgänger unten demonstriert, tödlich.\nGefallen ist der Arme Wurm wohl da eine der Morschen Holzplanken der Schienen, über die man laufen muss, um auf die andere Seite zu kommen, durchgebrochen ist als er auf ihr ging.\nZu deinem Glück und seinem Pech war, das wohl die einzige wirklich Zerbrechliche Planke und du kannst, vorsichtig hinüber gehen.");
            System.out.println("Auf halbem Weg hörst du ein leises Rumpeln aus einem der abgehenden Gänge.");
            System.out.println("Was tust du? (Q) Vorsichtig weitergehen(V)  Los rennen (L)  Abwarten(A)");

        }

         String entscheidung8 = scanner.nextLine();

         if (entscheidung8.equals("V")) {
            System.out.println("Du gehst vorsichtig weiter");
            System.out.println("Du gehst vorsichtig weiter und ignorierst das Geräusch.\nwährend du dich auf den weg konzentrierst, kommt von hinten eine Lore aus einem der Seitengänge und biegt auf die Schienen, auf denen du gerade gehst ein.\nBevor du dich entscheiden kannst schleudert dich die Lore mit voller Kraft gegen die Wand am anderen Ende des Raumes und bricht dir das Rückardt,\nsodass du selbst wenn du die Chance gehabt hättest dich nicht mehr retten kannst und zur Gesellschaft des letzten Opferst wirst.");
            System.out.println("Dead");
            return;
         }
         else if (entscheidung8.equals("L")) {
            System.out.println("Du rennst los");
            System.out.println("Um dem was auch immer da gerade angerauscht komm auszuweichen rennst du los, jedoch hast du die Stabilität der Holzbretter unterschätzt.\nDir bricht bei einem Schritt der Boden unter den Füßen weg und du stürzt in den Tod.");
            System.out.println("Dead");
            return;
         }
         else if (entscheidung8.equals("A")) {
            System.out.println("Du wartest ab");
            System.out.println("Du wartest und konzentrierst dich auf das Rumpeln.\nNach nicht anzulangen Zeit rauscht vor dir eine Lore aus einem Nebenschacht biegt auf deinen weg ein und verschwindet nach einer weiteren Kurve in einem anderen Nebenschacht.");
            System.out.println("Nachdem die Lore verschwunden ist gehst du vorsichtig weiter.");
            
         }

         

         zufallsgenerator randomGen = new zufallsgenerator();
         randomGen.zufall();


        if (notiz==true && (gelb==true)) {
            System.out.println("Da du durch den Tagebucheintrag weißt was in der nächsten und letzten Kammer auf dich wartet\nnimmst du einen der Teller und polierst ihn, bevor du weiter gehst.");
            scanner.nextLine();
            System.out.println("Als du den Raum betritts fallen dir die 3 Statuen nur im Augenwinkel auf. Statt auf sie zu achten, hältst du nach der Gorgonen Ausschau.");
            scanner.nextLine();
            System.out.println("Da du vorbereitet warst entdeckst du die Gorgone bevor ihr Hinterhalt gelingt.\nDu nimmst den Teller, den du vorher mitgenommen hast, heraus und überraschst sie damit, nur durch diese Überraschung schaut sie aus Versehen in den improvisierten Spiegel und wird langsam durch ihren eigenen Fluch zu Stein.\nWährend sie immer mehr von ihrer Mobilität verliert, schlägt sie noch einmal nach dir und trifft sogar fast, wird aber Millimeter von dein ‘nem Gesicht entfernt endgültig und komplett zu Stein.");
            System.out.println("Du schließt mit dem gefundenen Schlüssel die vorher ignorierte Gittertür auf,\nnimmst die vom Monster angehäuften schätze an dich und verstaust sie in einer Tasche die innen größer ist als außen,\ndu musst auch willkürlich an eine Blaue Box denken tust diesen irrsinnigen Gedanken aber schnell wieder ab.");       
            scanner.nextLine();
            System.out.println("Mit einem kick im Schritt und einem Schatz unterm Arm, der reicht, um eine Familie auf mehrere Generationen zu versorgen, trittst du aus der Mine in den Sonnenschein.\nEs ist kein Nebel mehr zu sehen und du kannst Vögel zwitschern hören.");
            System.out.println("Es ist, als wenn ein Fluch von diesem Ort genommen worden der Mehr als nur die 4 Opfer der vorherigen Gruppe gefordert hatte. (Ende)");
            return;

        }
        else if (notiz==true && (lila==true)) {
            System.out.println("Da du durch den Tagebucheintrag weißt was in der nächsten und letzten Kammer auf dich wartet\nnimmst du einen der Teller und polierst ihn, bevor du weiter gehst.");
            scanner.nextLine();
            System.out.println("Als du den Raum betritts fallen dir die 3 Statuen nur im Augenwinkel auf. Statt auf sie zu achten, hältst du nach der Gorgonen Ausschau.");
            scanner.nextLine();
            System.out.println("Du entdeckst das Monster, eine Gorgone, Geköpft in einer Ecke liegen und die Tür, die in die Gitter eingebaut wurde,\nist zwar geschlossen aber die schätze sind nicht mehr vorhanden jemand anderes war wohl schneller als du.");
            scanner.nextLine();
            System.out.println("Enttäuscht, halbtot und ohne auch nur einen Cent vom Schatz verlässt du die Mine und kehrst zurück nach Grimmdal\num wenigstens die Belohnung des Auftrages entgegen zu nehmen. (Ende)");
            return;

        }
        else if (notiz==true && (blau==true)) {
            System.out.println("Da du durch den Tagebucheintrag weißt was in der nächsten und letzten Kammer auf dich wartet\nnimmst du einen der Teller und polierst ihn, bevor du weiter gehst.");
            scanner.nextLine();
            System.out.println("Als du den Raum betritts fallen dir die 3 Statuen nur im Augenwinkel auf. Statt auf sie zu achten, hältst du nach der Gorgonen Ausschau.");
            scanner.nextLine();
            System.out.println("Du entdeckst das Monster, eine Gorgone, Geköpft in einer Ecke liegen und die Tür, die in die Gitter eingebaut wurde,\nist zwar geschlossen aber die schätze sind nicht mehr vorhanden jemand anderes war wohl schneller als du.");
            scanner.nextLine();
            System.out.println("Enttäuscht, halbtot und ohne auch nur einen Cent vom Schatz verlässt du die Mine und kehrst zurück nach Grimmdal\num wenigstens die Belohnung des Auftrages entgegen zu nehmen.(Ende)");
            return;
        }
        boolean letzterkampf=false;
        String entscheidung9 = "hahhhah";
        if (blau==true || (lila==true)) { // hier muss nur eine bedingung erfüllt werden   || = oder
            System.out.println("Enttäuscht, halbtot und ohne auch nur einen Cent vom Schatz verlässt du die Mine und kehrst zurück nach Grimmdal\num wenigstens die Belohnung des Auftrages entgegen zu nehmen.(Ende)");
            return;
        }
        else if (gelb == true) {
            System.out.println("Du betrittst den letzten Raum und erblickst 3 Statuen, wahrscheinlich die vorherige Söldnergruppe.\nAn der hinteren Wand befinden sich Gitterstäbe mit einer verriegelten Tür."); 
            System.out.println("Während du jedoch noch den Berg von Gold und Edelsteinen bewunderst,\nhörst du hinter dir ein leises Zischen und wirst von etwas hartem gegen die Wand geschleudert.");
            System.out.println("Verteidigst du dich (Verteidigen) oder rennst du zum Gitter (Gitter) (Q)");
            entscheidung9 = scanner.nextLine();
            letzterkampf=true;
        }
        
        if (letzterkampf==true &&(entscheidung9.equals("Verteidigen"))) {
            System.out.println("Drehst dich zum Gegner, um dich zu verteidigen");
            System.out.println("Als du dich umdrehst und das Grässliche Monster erblickst was hier alles zerstört hat, und realisierst gleichzeitig das es der Größte Fehler deines Lebens war.\nDas Monster ist eine Gorgone, sie verwandelt alles Lebende zu Stein das ihr Gesicht erblickt.\nDas ist auch dein Schicksal, du spürst wie deine Gliedmaßen aufhören sich zu bewegen und kannst auch schließlich deinen Kopf nicht mehr bewegen.");
            System.out.println("Das letzte was du in deinem immer Dunklen werdenden Blickfeld wahrnimmst ist das Grinsen und das Gelächter der Gorgone,\nbis nur noch ein kurzer Moment der Dunkelheit und Kälte bleibt, und dich verschlingt. (Dead)");
            return;
        }
        else if (letzterkampf==true &&(entscheidung9.equals("Gitter"))) {
            System.out.println("Du hechtest zum Gitter, um etwas brauchbares zur Verteidigung zu finden.");
            System.out.println("Du rennst in Richtung Gitter und versuchst etwas Nützliches zu finden, in deiner Panik greifst du nach allem was irgendwie nützlich sein könnte,\ndu bekommst etwas Langes zu fasse was du zwar nicht frei bekommst\naber durch dein Rütteln rutscht ein Rundes goldenes Tablet vor dich und du kannst sehen was dich angegriffen hat.");
            System.out.println("Es ist eine Gorgone, sie blickt direkt auf dich und somit auch in den \"Spiegel\".\nZu deinem Glück denn der effektivste Weg eine Gorgone zu besiegen ist sie in ihr Spiegelbild blicken zu lassen\ndamit sie sich selbst versteinert, was auch sofort passiert.");
            System.out.println("Nachdem du die Gorgone durch einen Glücksfall besiegt hast und nicht wie die Gruppe vor dir geendet bist versuchst du an die Schätze zu kommen\nDie Tür jedoch bleibt verschlossen und benötigt einen Schlüssel.");
            System.out.println("Du verlässt die Mine und gehst leer aus.(Ende)");
        }
        // schließen des Scanners
        scanner.close();

    }
}
