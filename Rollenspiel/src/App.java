import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        

       Scanner scanner = new Scanner(System.in);



        System.out.println("Gehst du links L oder rechts R ");
        String Richtung = scanner.nextLine();

        if(Richtung.equals("L")){
            System.out.println("Du bist hier richtig");
        } 
        else if(Richtung.equals("R")){
            System.out.println("Du bist hier falsch");
        }
        else {
            System.out.println("Tip bitte L oder R !!");
        }

        




        //schließen des Scanners
        scanner.close();
    }
}
