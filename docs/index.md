# **Java Tutorial - Team 1 _(Niklas,Aswin,Maarten,Ole)_**
- [x] Allgemeiner Teil 
  - [x] EVA-Prinzip 
  - [x] Algorithmus
  - [x] Compiler und Interpreter
    - [x] Bedeutung
    - [x] Wie wird aus Quellcode Maschinencode (auf Java bezogen) 

- [x] Einführung in die Programmierung (Kontrollstrukturen)
  - [x] Kontrollstrukturen
    - [x] Quellcode
    - [x] Struktogramm
    - [x] Programmablaufplan  
  - [x] Variablen
  - [x] Wertezuweisung
    - [x] Inkrementoperator
  - [x] Datentypen
    - [x] Typecasting  
  - [x] Bedingungen (if und switch)
    - [x] verschachtelte Bedingungen
  - [x] Schleifen
    - [x] for
    - [x] do
    - [x] do-while  

- [x] Einführung in die objektorientierte Programmierung
  - [x] Klasse
    - [x] Bedeutung und Implementation
  - [x] Objekte
    - [x] Begriff der Initialisierung und Abgrenzung zur Klasse
  - [x] Klassendiagramme
  - [x] Objektdiagramme
  - [x] Konstruktoren
  - [x] Objektmethoden  
## **Allgemeiner Teil**
###  *EVA-Prinzip* 
- **(E)** ingabe
- **(V)** erarbeitung
- **(A)** usgabe
   - Das **EVA-Prinzip** bezeichnet die Art, wie heutige Computer arbeiten. Im ersten Schritt wird eine **Eingabe** getätigt. Danach wird die getätigte Eingabe **verarbeitet** und zuletzt wird ein **Signal** **ausgegeben**. 
   - *Beispiel*:  
     Ich gebe auf einer Tastatur ein *„a“* ein und ein *„a“* erscheint auf dem Bildschirm.
### *Algorithmus*
- Ein **Algorithmus** ist eine **Vorschrift zur Lösung einer Klasse von Problemen**. Er besteht aus einer _endlichen Folge von Schritten_, mit der aus **bekannten Eingangsdaten neue Ausgangsdaten** eindeutig berechnet werden können.  
  - **Beispiel eines Algorithmus**, mit welchem ein Muffin gebacken werden soll:
![Beispiel-Algorithmus](https://sebastiandoern.de/wp-content/uploads/2017/11/AlgorithmusMuffin.jpg)
   - [Bildquelle](https://sebastiandoern.de/wp-content/uploads/2017/11/AlgorithmusMuffin.jpg) 
### *Compiler und Interpreter*
#### *Bedeutung*
- **Compiler** und **Interpreter** sind grundsätzlich dazu da, um den **Quellcode** einer Programmiersprache (**z.B. Java**) in einen **Maschinencode** umzusetzen. 
#### Compiler
- Die Aufgabe eines **Compilers** ist es, den **Quellcode** eines Software-Projekts _vor dessen Laufzeit_ zu übersetzen (**Quellcode -> Maschinencode**). Erst nach dem Übersetzen wird das jeweilige Projekt von dem Prozessor ausgeführt, dem dadurch von Beginn an sämtliche Anweisungen in **Maschinencode** zur Verfügung stehen. Vor der endgültigen Übersetzung in Maschinensprache wandeln die meisten Compiler den **Quellcode** nämlich häufig zunächst in einen **Zwischencode** (**auch „Objektcode“**) um, der oft für verschiedene Plattformen geeignet ist und zudem von einem **Interpreter** verwendet werden kann. Zu den “**Compiler-Sprachen**”, also Sprachen, die auf Compiler zurückgreifen, gehören z.B. C, C++, Pascal... 
#### Interpreter
- Die Aufgabe eines **Interpreters** ist es, den **Quellcode** eines Software-Projekts während dessen Laufzeit zu übersetzen (**Quellcode -> Maschinencode**) und als Schnittstelle zwischen Prozessor und Projekt zu fungieren. Dabei geht der **Interpreter** *Codezeile für Codezeile* vor -> die einzelnen Anweisungen werden in der Reihenfolge gelesen, analysiert und für den Prozessor aufbereitet. Sobald der **Quellcode** in **Maschinencode** umgewandelt wurde, werden diese an den Prozessor weitergeleitet. Der **Umwandlungsprozess** ist erst abgeschlossen, wenn _alle Code-Zeilen interpretiert_ wurden und der **Umwandlungsprozess** wird nur abgebrochen, falls ein Fehler auftreten sollte. Zu den ,,**Interpreter-Sprachen**”, also Sprachen, die auf Interpreter zurückgreifen, gehören z.B. Python, BASIC, Perl... 
#### Wie wird aus Quellcode Maschinencode (auf Java bezogen)
  ![Darstellung-Quellcode->Maschinencode](https://media.springernature.com/lw785/springer-static/image/chp%3A10.1007%2F978-3-662-61309-2_1/MediaObjects/160339_2_De_1_Figb_HTML.png)  
  [Bildquelle](https://media.springernature.com/lw785/springer-static/image/chp%3A10.1007%2F978-3-662-61309-2_1/MediaObjects/160339_2_De_1_Figb_HTML.png)

  **Java-Quellcode**: Für Menschen lesbarer Text, der von einem Computer in ein lauffähiges Computerprogramm übersetzt werden kann.

  **Java-Compiler**: Übersetzt den Java-Quellcode in einen plattformunabhängigen Bytecode.

  **Java-Bytecode**: Plattformunabhängiger Programmcode, der in dieser Form an die Anwender ausgeliefert wird.

  **Java-Interpreter**: Übersetzt den Bytecode während der Laufzeit des Programms in die Maschinensprache des jeweiligen Computers.

  **Maschinencode**: Eine Folge von Nullen und Einsen, die sowohl Befehle als auch Daten repräsentieren und direkt vom Prozessor gelesen und verarbeitet werden können.
  

## **Einführung in die Programmierung (Kontrollstrukturen)**
### *Kontrollstrukturen*
#### Quellcode

```Java
package rentalStore;
import java.util.Enumeration;
import Java.util.Vector;

class Customer {
  private String _name;
  private Vector<Rentel> _rentals = nw Vector<Rental>();

  public Customer(String name) {
    _name = name;
  }
  public String getMovie (Movie movie) {
    Rental rental = new Rental (new Movie ("", Movie.New_Release), 10);
    Movie m = rental._movie; 
    return movie.getTitle();
    }
    public void addRental (Rental arg) {
      _rentals.addElement (arg);
    }
    public String getName() {
      return _name; 

    }
}
```
[Quelle](https://www.researchgate.net/profile/Md-Masudur-Rahman-2/publication/317401664/figure/fig2/AS:504826271408129@1497371370743/Source-Code-Example-Customerjava-Partial.png)

Hier zu sehen ist ein **Beispielquellcode** aus **Java**. 

*Der **Quellcode** ist der Code, den der Programmierer eintippt und auch sehen kann. Damit jedoch die Maschine damit interagieren kann, muss er zunächst in einen **Maschinencode** (mithilfe von **Compiler** und **Interpreter**) umgewandelt werden.*
#### Struktogramm
![Beispiel-Struktogramm](https://upload.wikimedia.org/wikipedia/commons/5/5f/MehrfAusw.png)

[Bildquelle](https://upload.wikimedia.org/wikipedia/commons/5/5f/MehrfAusw.png)

Hier zu sehen ist ein **Beispiel-Struktogramm** für eine **verschachtelte Bedingung**.

Ein anderer Name für ein **Struktogramm** ist das **Nassi-Shneiderman-Diagramm**. Ein **Struktogramm** dient zur vereinfachten und verständlichen *Visualisierung* des jeweiligen **Algorithmus**. Die Vorgehensweise bei solch einem **Struktogramm** ist die **Top-down-Programmierung** => **Gesamtkonzept**, welches durch eine *Verfeinerung der Strukturen* des **Gesamtkonzeptes** aufgelöst wird. Jede **Anweisung** wird in einen **rechteckigen Strukturblock** geschrieben. Diese **Strukturblöcke** werden nacheinander von *oben nach unten* durchlaufen. Die Zusammensetzung der **Strukturblöcke** ist schlussendlich das **Struktrogramm**, welches im Ganzen *reckteckig* ist, also genau so breit wie sein breitester **Strukturblock**.
#### Programmablaufplan
![Beispiel-Programmablaufplan](https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Flowchart_de.svg/330px-Flowchart_de.svg.png)

[Bildquelle](https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Flowchart_de.svg/330px-Flowchart_de.svg.png)

Hier zu sehen ist ein **Beispiel-Programmablaufplan**. Diese Abbildung zeigt eine **Zählschleife**. Die **Zählvariable i** wird *vor Beginn der Schleife* auf ihren **Startwert i=1** gesetzt. Danach wird die erste Anweisung der **Schleife**, das **Ausgeben der Variable i**, ausgeführt. Die nachfolgende zweite Anweisung ist eine Auswahl, die prüft, ob **i** den **Wert 39** besitzt. *Wenn dies der Fall ist*, wird **i** auf den **Wert 61** gesetzt und die **Schleife** beginnt mit dem *nächsten Durchlauf*. Falls **i** nicht **39** ist, wird **i** in der nachfolgenden Anweisung um **eins** erhöht und anschließend geprüft, ob die **Schleifenfortsetzungsbedingung i≤100** gültig ist. Falls *ja*, erfolgt ein *nochmaliger Schleifendurchlauf*. Ausgegeben würden **alle natürlichen Zahlen von 1 bis 39 sowie 61 bis 100** (jeweils einschließlich). 
### *Variablen*
Jedes *Computerprogramm* verarbeitet **Daten**, welche unterschiedlichen **Typs** sein können und als solche wiederum verschiedene **Werte** besitzen. Die **Daten** stellen das **'Material'** dar, das ein *Programm* verarbeitet. Im Rahmen dieser Verarbeitung müssen die Werte natürlich *(zwischen-)gespeichert* werden, um bei Bedarf auf sie zugreifen zu können. **Variablen** sind dabei eine Art **'Lesezeichen'**, das auf den *Speicherort* verweist und angibt, wie dieser angesprochen werden kann. Darüber hinaus enthält sie *Informationen* über den gespeicherten **Datentyp**. 
### *Wertezuweisung*
- **Werte** werden mithilfe von **Operatoren** zugewiesen. 7Diese **Operator** können zum Beispiel **=**, **++**, **--** oder **+=** sein.
#### Inkrementoperator
- Ein Beispiel für ein **Operator** ist der **Inkrementoperator**. Dieser sorgt dafür, dass der *Wert* der **Variable** schrittweise erhöht wird -> Definition von **Inkrementieren**
- Das Gegenstück von **Inkrementieren** ist das **Dekrementieren**, hierbei wird der *Wert* der **Variable** schrittweise vermindert -> **Dekrementoperator**
- **Inkrementoperator** können zum Beisipel genutzt werden, um die Anzahl an Stichpunkten auf einer Liste zu zählen.

Beispiel für den Einsatz eines **Inkrementoperators**:
```Java
public class Inkrement {
  public static void main (String[] args) {
    int i = 2; 
    i++; //Das funktioniert
    System.out.println("Nach der Inkrementierung; " +i);
    S--; //Mit einer einfachen Zahl funktioniert dies nicht
  }
}
```
[Quelle](https://mein-javablog.de/wp-content/uploads/2016/08/Java-Operatoren-Inkrement-Dekrement.png)

Hierbei ist der **Inkrementoperator** das **++**, der **Dekrementoperator** wäre an dieser Stelle **--**.
### *Datentypen*
- Es gibt *8* **primitive Datentypen**, die restlichen Datentypen nennt man **Objekte**. Die *8* **primitiven Datentypen** heißen **byte, short, int(integer), long, float, double, char(character)** und **boolean**. Alle außer **char** und **boolean** speichern **Zahlenwerte**, da Zahlen eine sehr wichtige Rolle in **Java** spielen. Diese sogenannten **numerischen Java Typen** lassen sich in **ganzzahlige Typen** und **Gleitpunkttypen** unterteilen. **byte, short, int** und **long** sind **ganzzahlige Typen** und **float** und **double** sind **Gleitpunkttypen**.  Jeder von ihnen besitzt eine festgelegte Anzahl an **Bit** (=0 oder 1), wodurch die **Werte** dargestellt werden und das ist auch der Grund dafür, dass es mehrere **Datentypen** für die selbe Aufgabe gibt, denn sie haben eine *unterschiedliche Menge* an **Speicherplatz**.  
  
#### Typecasting
- **Typecasting** (auf deutsch Typumwandlung) unterteilt man in **explizite** und **implizite Typumwandlung**. Die **implizite Typumwandlung** findet *automatisch* bei der *Zuweisung* statt. Dies geht jedoch nur, wenn ein **niederwertiger Datentyp** in einen **höherwertigen Datentypen** umgewandelt wird, also zum Beispiel vom **Datentyp int** in den **Datentyp long** (**int** hat einen geringeren *Speicherplatz* zur Verfügung als **long**). 
- Die **explizite Umwandlung** erfolgt durch den sogenannten **cast-Operator**. Hier wird von einem **höherwertigen Datentyp** in einen **niederwertigen Datentypen** umgewandelt, also zum Beisipel vom **Datentyp long** in den **Datentyp int** (**long** hat einen höheren *Speicherplatz* zur Verfügung als **int**). In welchen **Datentyp** umgewandelt werden soll, muss bei dem **cast-Operator** *explizit* angegeben werden. 
  
[Textquelle](https://www.java-tutorial.org/typecasting.html)

### *Bedingungen (if und switch)*
```Java
class Manin {
  public static void man(String[] args) {
    int x = 7;
    if (x < 5>) {
      System.out.println("Kleiner als 5!");
    } else {
      System.out.println("Nicht kleiner als 5!");
    }
  }
}
```
[Quelle](https://im.contentlounge.net/styles/manual_crop/s3/bedingungen-in-java-der-if-befehl_262da51c.png?im=Resize%3D%281200%2C675%29%2Caspect%3Dfit%2CAspectCrop%2Csize%3D%281200%2C675%29%2Cgravity%3DCenter%2CallowExpansion%2CBackgroundColor%2Ccolor%3Dtransparent&hash=4294d576e5b618cb58bd906cfc1e933a952cefde59a921934f3da4fe1ab41b50)

- Im oberen Bild sieht man ein *Beispiel* für eine **if-Bedingung**. Vor der **Bedingung** wird die **Variable x** als **7 initialisiert**. Die **Bedingung** lautet **x < 5**, also wenn die **Bedingung** zutrifft (*wenn x kleiner als 5 ist*), dann wird **"Kleiner als 5!"** ausgegeben. Wenn man noch schreiben möchte, was passiert, wenn die **Bedingung** nicht zutrifft, so schreibt man **"else"**. In diesem Fall würde, wenn die **Bedingung** nicht zutrifft, **"Nicht kleiner als 5!"** ausgegeben werden.

[Textquelle](https://praxistipps.chip.de/java-programmieren-lernen-bedingungen-und-schleifen_97989)
```Java
class Main { 
  public static void manin(String[] args){
    int day = 3;
    switch (day) {
      case 1:
      //...
      break;
      case 2:
      //...
      break;
      case 3:
      //...
      break;
      default:
      //...
    }
  }
}
```
[Quelle](https://im.contentlounge.net/styles/manual_crop/s3/java-switch-befehle-verwenden_d10eb2ca.png?im=Resize%3D%281200%2C675%29%2Caspect%3Dfit%2CAspectCrop%2Csize%3D%281200%2C675%29%2Cgravity%3DCenter%2CallowExpansion%2CBackgroundColor%2Ccolor%3Dtransparent&hash=0477d9feda8cc1a7830777530f6ab4fa48869d843a01199b7b64e707e9b99510)

- Im oberen Bild kann man ein *Beispiel* für eine **switch-Bedingung** sehen. Diese testet, ob der **Wert** einer **Variable** einem **bestimmten Wert** gleich. In diesem Fall wird vor der **Bedingung** die **Variable day** als **3 initialisert**. In der **Bedingung** schreibt man nun **"switch (day)"** und dann entsprechend **"case 1"** (also wenn switch = 1) , **"case 2"**... mit der jeweiligen *Auswirkung*, was bei dem entsprechenden Fall passieren soll. Schreibt man innerhalb des **"case"** noch ein **"break"**, so wird die **Bedingung** ab genau dem Punkt unterbrochen, solange sie zutrifft. Falls keine der Bedingungen zutrifft, wird das ausgeführt, was unter **"default"** steht. 

[Textquelle](https://praxistipps.chip.de/java-programmieren-lernen-bedingungen-und-schleifen_97989)
#### verschachtelte Bedingungen
![Beispiel-Struktogramm](https://upload.wikimedia.org/wikipedia/commons/5/5f/MehrfAusw.png)

[Bildquelle](https://upload.wikimedia.org/wikipedia/commons/5/5f/MehrfAusw.png)

- Dieses *Beispiel* für eine **verschachtelte Bedingung** konnte man schon beim Thema **"Struktogramm"** sehen, denn dies ist ein **Struktrogramm** zu einer **verschachtelten Bedingung**. Diese sagt in diesem Fall aus, dass wenn **Bedingung 1** zutrifft, man zu **Bedingung 2** weitergeleitet wird. Wenn **Bedingung 1** nicht zutrifft, so kommt man zu **Anweisungsblock 3**. Wenn **Bedingung 1** zutrifft, aber **Bedingung 2** nicht, so kommt man zu **Anweisungsblock 2**. Wenn **Bedingung 1 und 2** zutreffen, so kommt man zu **Anweisungsblock 1**. Kurz gesagt ist eine **verschachtelte Bedingung** eine **Bedingung**, die dann eintritt, wenn eine andere **Bedingung** zutrifft.

### *Schleifen*
- Schleifen wiederholen einen **Anweisungs-Block** (*Schleifenrumpf bzw. Schleifenkörper*) solange die **Schleifenbedingung** gültig bleibt bzw. keine *Abbruchbedingung* erfüllt ist.
#### for
```Java
class Main {
  public static void man(String[] args) {
    for(int x = 1; x <= %; x++) {
      System.out.println(x);
    }
  }
}
```
[Quelle](https://im.contentlounge.net/styles/manual_crop/s3/for-schleifen-programmieren_b8646ae2.png?im=Resize%3D%281200%2C675%29%2Caspect%3Dfit%2CAspectCrop%2Csize%3D%281200%2C675%29%2Cgravity%3DCenter%2CallowExpansion%2CBackgroundColor%2Ccolor%3Dtransparent&hash=b45abf47f93971c3bea168a495e2e24eddd7d3fb603bb49ba246117bebd11f4d)

- Im oberen Bild erkennt man ein *Beispiel* für eine **for-Schleife**. Die **Syntax** lautet: **"for (initialization; condition; increment/decrement) {"**. In diesem Fall ist die **initialization** (*Initialiserung*) **int x = 1**, die **condition** (*Bedingung*) **x <= 5** und das **increment/decrement** (*Inkrement/Dekrement*) **x++**. Also wenn bei der **Variable x = 1 x <= 5** gilt (*also wenn x 5 oder kleiner ist*), wird **x** um **1** erhöht und dann ausgegeben. In diesem Falle würden also die Zahlen *1, 2, 3, 4 und 5* nacheinander ausgegeben werden.

[Textquelle](https://praxistipps.chip.de/java-programmieren-lernen-bedingungen-und-schleifen_97989)
#### while
```Java
class Main {
  public static void man(String[] args) {
    int x =3;
    while (x > 0) {
    System.out.println(x)
    }
  }
}
```
[Quelle](https://im.contentlounge.net/styles/manual_crop/s3/die-while-schleife_823b40a3.png?im=Resize%3D%281200%2C675%29%2Caspect%3Dfit%2CAspectCrop%2Csize%3D%281200%2C675%29%2Cgravity%3DCenter%2CallowExpansion%2CBackgroundColor%2Ccolor%3Dtransparent&hash=23b918b93db6d90236f7182b0c98dd987e4bb65c814e087f8695e81ef770a26e)

- Im oberen Bild sieht man ein *Beispiel* für eine **while-Schleife**. Um diese in den **Quellcode** einzubauen, schreibt man zunächst **"while (...) {"**. In die *runde Klammer* kommt eine **Bedingung** und in die *geschweifte Klammer* kommt wieder der Befehl, der ausgeführt werden soll. In diesem *Beispiel* wird vor der **Schleife** die **Variable x** als **3 initialisert**. Die **Bedingung** lautet **"x > 0"** und wenn dies zutrifft, dann wird zunächst **"x"** ausgegeben und dann wird **"x"** um **1 verringert**. Also würden hier die **Werte 3, 2 und 1** nacheinander ausgegeben werden. Falls die **Bedingung** nicht zutreffen sollte, so führt das *Programm* die Befehle aus, die nach der **Schleife** stehen.

[Textquelle](https://praxistipps.chip.de/java-programmieren-lernen-bedingungen-und-schleifen_97989)

#### do-while
```Java
class Main {
  public static void man(String[] args) {
    int x = 1;
    do{
      System.out.println("Hallo");
      x++;
    }while (x < 5);
  }
}
```
[Quelle](https://im.contentlounge.net/styles/manual_crop/s3/java-do-while-schleifen_e8ee10be.png?im=Resize%3D%281200%2C675%29%2Caspect%3Dfit%2CAspectCrop%2Csize%3D%281200%2C675%29%2Cgravity%3DCenter%2CallowExpansion%2CBackgroundColor%2Ccolor%3Dtransparent&hash=1cbfb757f755d72c20c96ff4ddbe8a1a90dc13a2a51f09fd847e3ae6373467c1)

- Im oberen Bild sieht man ein *Beispiel* für eine **do-while-Schleife**. Der einzige Unterschied zwischen einer **do-while-Schleife** und einer **while-Schleife** ist, dass bei einer **do-while-Schleife** die Befehle mindestens einmal ausgeführt werden, bevor die **Bedingung** geprüft wird. Man schreibt einfach **"do {"** und danach den Befehl mit einer weiteren *geschweiften Klammer* und danach den **while-Befehl**. In diesem Beispiel wird vor der **Schleife** die **Variable x** als **1** initialisert. In der **Schleife** wird zunächst *"Hallo"* ausgegeben und dann wird die **Variable x** um **1** erhöht und dann wird geprüft, ob **x < 5**. Also wird *4 mal "Hallo"* ausgegeben.

[Textquelle](https://praxistipps.chip.de/java-programmieren-lernen-bedingungen-und-schleifen_97989)
## **Einführung in die objektorientierte Programmierung**
### *Klasse*
- In einer **Klasse** sind **Methoden** und **Eigenschaften** eines **Objektes** definiert. Die **Klasse** dient als *Vorlage*, aus der dann beliebig viele **Objekte** erzeugt werden können. 
- Als erstes stehen in der **Klasse** die **Attribute** oder auch **Eigenschaften**. Die **Variablen**, die du am Anfang der Klasse **deklarierst**, werden **Attribute** genannt. Zu **Eigenschaften** werden sie erst, wenn du ein **Objekt** der **Klasse** mit der **Variable** erzeugst.
- Im Anschluss kann man **Methoden** programmieren. Hier kommen dann alle *Befehle* rein, welche die **Klasse** bei Aufruf ausführen kann. Auch kann man **Methoden** schreiben, welche dann auf deine **Klassenvariablen** zugreifen können. Man spricht dabei von **Getter und Setter Methoden**. Eine besondere **Methode** ist der sogenannte **Konstruktor**.
- Zusammenfassend besteht also eine **Java Klasse** aus der **Deklaration**, den **Attributen** in Form von **Variablen** und den **Funktionen** in Form von **Methoden**.
  
[Textquelle](https://www.a-coding-project.de/ratgeber/java/klassen-und-objekte)
#### Bedeutung und Implementation
- **Klassen** stellen in der **objektorientierten Programmierung** die zentralen **Organisationseinheiten** eines **Quelltextes** dar. Sie fungieren als eine Art Bauplan, der die grundlegenden *Eigenschaften und Fähigkeiten* eines komplexen **Datentyps** definiert.
  
[Textquelle](https://javabeginners.de/Klassen_und_Interfaces/Klassen.php)
### *Objekte*
- Um ein **Objekt** tatsächlich zu erzeugen (zu konstruieren), wird eine bestimmte *Funktion* innerhalb der **Klasse** aufgerufen, die man deshalb auch **Konstruktor** nennt. Man erkennt sie daran, dass sie den gleichen Namen hat wie die **Klasse**. **Eigenschaften** beschreiben das **Objekt**. Die **Eigenschaften** kann man abfragen und man kann sie ändern. Ein **Objekt** ist eine *Beschreibung* von zum Beispiel einem *Auto*, mit **Attributen** und einem *festen Zustand*. Eine Verallgemeinerung aller **Auto-Objekte** ist dann eine **Klasse**. Sie enthält alle **Attribute**, welche ein Auto haben kann, weist diesen **Attributen** jedoch noch keinen Wert zu.
  
[Textquelle1](https://www.a-coding-project.de/ratgeber/java/klassen-und-objekte)

[Textquelle2](https://studyflix.de/informatik/java-klassen-1902)
#### Begriff der Initialisierung und Abgrenzung zur Klasse
- Ein **Objekt** wird **initialisiert**, wenn ihm ein *Wert zugewiesen* wird. Die **Initialisierung** kann getrennt oder zusammen mit der **Deklaration** stattfinden. Eine **Klasse** definiert die **Eigenschaften** (*Instanzvariablen oder Felder*) und das *Verhalten (Methoden)* von *(gleichartigen) Objekten*. Also ist ein **Objekt** im Prinzip der **Klasse** untergeordnet.
### *Klassendiagramme*
- Ein **Klassendiagramm** ist ein **Strukturdiagramm** der *Unified Modeling Language (UML)* zur grafischen Darstellung (*Modellierung*) von **Klassen**, **Schnittstellen** sowie deren **Beziehungen**.
- Bei einem **Klassendiagramm** werden nur *allgemeine Informationen* angegeben, es werden keine **Werte** zugewiesen.

[Textquelle](https://de.wikipedia.org/wiki/Klassendiagramm)
### *Objektdiagramme*
![Beispiel-Objektdiagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/UmlOd-Beispiel-1.svg/450px-UmlOd-Beispiel-1.svg.png)

[Bildquelle](https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/UmlOd-Beispiel-1.svg/450px-UmlOd-Beispiel-1.svg.png)

Im Bild sieht man ein **Objektdiagramm**, welches die beiden Personen *Hans und Peter* beschreibt, denn ein **Objektdiagramm** gibt den *Zustand* eines **Objekts** mit den jeweiligen **Werten** an. In diesem Fall werden die **Attribute** *Alter*, *Vor- und Nachname* von *zwei Personen* beschrieben. 
### *Konstruktoren*
- In einer **Klasse** ist der **Java Konstruktor** eine **Methode**, die den gleichen Namen wie die **Klasse** hat. Sie wird dazu verwendet, ein neues **Objekt** dieser einen **Klasse** zu erstellen. Das ist der Grund, weshalb jede *Klasseninstanz* einen **Konstruktor** haben muss. Daher kommt auch der Name **Konstruktor**, da er etwas **"konstruiert"**.
### *Objektmethoden*

- **Methoden** einer **Klasse** bzw. eines **Objektes** sind *Handlungen*, die das **Objekt** ausführen kann. (*Ein Roboter kann zum Beispiel laufen.*)
  
- Im Unterschied zur **Klassenmethode** muss eine **Objektmethode** an einem konkret **instanziierten Objekt** aufgerufen werden, dies ist bei **Klassenmethoden** nicht der Fall.

- **Objektmethoden** können im Gegensatz zu **Klassenmethoden** nur mit dem Namen einer 
**Variablen** der **Klasse**, nicht mit dem Namen der **Klasse** selbst aufgerufen 
werden.

- Bei der **Syntax** steht bei einer **Klassenmethode** ein "**static**" (vor dem **void**), welches bei einer **Objektmethode** nicht benutzt wird:
  
  *public void objektMethode ()*

  *public static void klassenMethode ()*

[Textquelle1](https://lernjava.de/klassenmethoden-und-objektmethoden/)

[Textquelle2](http://www.ke.tu-darmstadt.de/lehre/archiv/ws0607/ai1/material/AI-4-a-Methoden.pdf)