# **Java Tutorial - Team 1 _(Niklas,Aswin,Maarten,Ole)_**
- [x] Allgemeiner Teil 
  - [x] EVA-Prinzip 
  - [x] Algorithmus
  - [x] Compiler und Interpreter
    - [x] Bedeutung 

- [ ] Einführung in die Programmierung (Kontrollstrukturen)
  - [ ] Variablen
  - [ ] Wertezuweisung
    - [ ] Inkrementoperator
  - [ ] Datentypen
    - [ ] Typecasting  
  - [ ] Bedingungen (if und switch)
    - [ ] verschachtelte Bedingungen
  - [ ] Schleifen
    - [ ] for
    - [ ] do
    - [ ] do-while  

- [ ] Einführung in die objektorientierte Programmierung
  - [ ] Klasse
    - [ ] Bedeutung und Implementation
  - [ ] Objekte
    - [ ] Begriff der Initialisierung und Abgrenzung zur Klasse
  - [ ] Klassendiagramme
  - [ ] Objektdiagramme
  - [ ] Konstruktoren
  - [ ] Objektmethoden  
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
- Die Aufgabe eines **Compilers** ist es, den **Quellcode** eines Software-Projekts _vor dessen Laufzeit_ zu übersetzen (**Quellcode -> Maschinencode**). Erst nach dem Übersetzen wird das jeweilige Projekt von dem Prozessor ausgeführt, dem dadurch von Beginn an sämtliche Anweisungen in **Maschinencode** zur Verfügung stehen. Vor der endgültigen Übersetzung in Maschinensprache wandeln die meisten Compiler den **Quellcode** nämlich häufig zunächst in einen **Zwischencode** (**auch „Objektcode“**) um, der oft für verschiedene Plattformen geeignet ist und zudem von einem **Interpreter** verwendet werden kann. Zu den “**Compiler-Sprachen**”, also Sprachen, die auf Compiler zurückgreifen gehören z.B. C, C++, Pascal... 
#### Interpreter
- Die Aufgabe eines **Interpreters** ist es, den **Quellcode** eines Software-Projekts während dessen Laufzeit zu übersetzen (**Quellcode -> Maschinencode**) und als Schnittstelle zwischen Prozessor und Projekt zu fungieren. Dabei geht der **Interpreter** *Codezeile für Codezeile* vor -> die einzelnen Anweisungen werden in der Reihenfolge gelesen, analysiert und für den Prozessor aufbereitet. Sobald der **Quellcode** in **Maschinencode** umgewandelt wurde, werden diese an den Prozessor weitergeleitet. Der **Umwandlungsprozess** ist erst abgeschlossen, wenn _alle Code-Zeilen interpretiert_ wurden und der **Umwandlungsprozess** wird nur abgebrochen, falls ein Fehler auftreten sollte. Zu den ,,**Interpreter-Sprachen**”, also Sprachen, die auf Interpreter zurückgreifen gehören z.B. Python, BASIC, Perl... 
### *Wie wird aus Quellcode Maschinencode (auf Java bezogen)*
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
  ![Beispiel-Quellcode](https://www.researchgate.net/profile/Md-Masudur-Rahman-2/publication/317401664/figure/fig2/AS:504826271408129@1497371370743/Source-Code-Example-Customerjava-Partial.png)
  
[Bildquelle](https://www.researchgate.net/profile/Md-Masudur-Rahman-2/publication/317401664/figure/fig2/AS:504826271408129@1497371370743/Source-Code-Example-Customerjava-Partial.png)

Hier zu sehen ist ein **Beispielquellcode** aus **Java**. 

*Der **Quellcode** ist der Code, den der Programmierer eintippt und auch sehen kann. Damit jedoch die Maschine damit interagieren kann, muss er zunächst in einen **Maschinencode** (mithilfe von **Compiler** und **Interpreter**) umgewandelt werden.*
#### Struktogramm
- Struktogramm
#### Programmablaufplan
- Programmablaufplan
### *Variablen*
- Variablen
### *Wertezuweisung*
- Wertezuweisung
#### Inkrementoperator
- Inkrementoperator
### *Datentypen*
- Datentypen
#### Typecasting
- Typecasting
### *Bedingungen (if und switch)*
- Bedingungen
#### verschachtelte Bedingungen
- verschachtelte Bedingungen
### *Schleifen*
- Schleifen
#### for
- for
#### while
- while
#### do-while
- do-while
## **Einführung in die objektorientierte Programmierung**
### *Klasse*
- Klasse
#### Bedeutung und Implementation
- Bedeutung und Implementation
### *Objekte*
- Objekte
#### Begriff der Initialisierung und Abgrenzung zur Klasse
- Begriff der Initialisierung und Abgrenzung zur Klasse
### *Klassendiagramme*
- Klassendiagramme
### *Objektdiagramme*
- Objektdiagramme
### *Konstruktoren*
- Konstruktoren
### *Objektmethoden*
- Objektmethoden