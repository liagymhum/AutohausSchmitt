import java.util.Scanner;

public class Menu extends Methoden{
    
    Scanner _scanner;

    public Menu(){
        setScanner(new Scanner(System.in));
    }

    public void startMenu(){
        System.out.println("Bitte wähle aus:\n(1) Neuer Verkauf\n(2) Neuer Kunde\n(3) Neues Auto\n(4) Neue*r Verkäufer*in\n(5) Liste der verfügbaren Autos\n(6) Liste Kunden\n(7) Liste Verkäufer*innen");
        String choice = getScanner().nextLine();
        System.out.println("Deine Auswahl ist: "+choice);

        if(choice.equals("1")){
            createVerkaufMenu();
        }
        else if(choice.equals("2")){
            if(elesInArray(App.getAllKunden()) < App.getAllKunden().length){
                createKundeMenu();
            }
            else{
                System.out.println("\n\n+++Fehler!!+++\nSpeicherplatz für Kunden voll!");
            }
        }
        else if(choice.equals("3")){
            if(elesInArray(App.getAllAutos()) < App.getAllAutos().length){
                createAutoMenu();
            }
            else{
                System.out.println("\n\n+++Fehler!!+++\nSpeicherplatz für Autos voll!");
            }
        }
        else if(choice.equals("4")){
            if(elesInArray(App.getAllVerkaeufer()) < App.getAllVerkaeufer().length){
                createVerkaeuferMenu();
            }
            else{
                System.out.println("\n\n+++Fehler!!+++\nSpeicherplatz für Verkäufer*innen voll!");
            }        }
        else if(choice.equals("5")){
            showAutos();
        }
        else if(choice.equals("6")){
            showKunden();
        }
        else if(choice.equals("7")){
            showVerkaeufer();
        }
        else{
            System.out.println("Auswahl ungültig.");
        }
        startMenu();
    }


    public String showAutos(){
        int i = 0;
        String availableCars = "";
        for(Auto auto : App.getAllAutos()){
            if(auto != null){
                System.out.println(i+" "+auto.getMarke()+" "+auto.getModell());
                i++;
            }
        }
        return availableCars;
    }

    public void showKunden(){
        int i = 0;
        for(Kunde kunde : App.getAllKunden()){
            if(kunde != null){
                System.out.println(i+" "+kunde.getVorname()+" "+kunde.getNachname());
                i++;
            }
        }
    }

    public void showVerkaeufer(){
        int i = 0;
        for(Verkaeufer v : App.getAllVerkaeufer()){
            if(v != null){
                System.out.println(i+" "+v.getVorname()+" "+v.getNachname());
            i++;
            }
        }
    }

    public void createVerkaufMenu(){
        // Auto auswählen
        System.out.println("Bitte gib das zu verkaufende Auto an: \n"+showAutos());
        String auto = getScanner().next();
        int a = Integer.valueOf(auto);
        System.out.println("Ausgewähltes Auto: "+App.getAllAutos()[a].getMarke()+" "+App.getAllAutos()[a].getModell());

        // Verkäufer auswählen
        System.out.println("\nBitte gib den Verkäufer an: ");
        showVerkaeufer();
        String verk = getScanner().next();
        int v = Integer.valueOf(verk);
        System.out.println("Ausgewählter Verkäufer: "+App.getAllVerkaeufer()[v].getPersonalnummer());

        // Kunde asuwählen oder neu anlegen
        System.out.println("\nBitte gib den Kunden an: ");
        showKunden();
        int numNewKunde = elesInArray(App.getAllKunden())+1;
        System.out.println(numNewKunde+" Neuen Kunden auswählen");
        String kunde = getScanner().next();
        int k = Integer.valueOf(kunde);
        System.out.println("Ausgewählter Kunde: "+App.getAllKunden()[k].getVorname()+" "+App.getAllKunden()[k].getNachname());
    }

    public void createAutoMenu(){
        System.out.print("Bitte gib eine Automarke an: ");
        String marke = getScanner().next();

        System.out.print("Bitte gib ein Modell an: ");
        String modell = getScanner().next();

        System.out.print("Bitte gib ein Baujahr an: ");
        int baujahr = getScanner().nextInt();

        App.addAuto(new Auto(marke,modell,baujahr));
    }

    public void createKundeMenu(){
        System.out.println("Bitte Daten den neuen Kunden eingeben:");
        System.out.print("Vorname: ");
        String vorname = getScanner().next();
        System.out.print("Nachname: ");
        String nachname = getScanner().next();

        App.addKunde(new Kunde(vorname,nachname));
    }

    public void createVerkaeuferMenu(){
        System.out.println("Bitte Daten den neuen Verkäufer eingeben:");
        System.out.print("Vorname: ");
        String vorname = getScanner().next();
        System.out.print("Nachname: ");
        String nachname = getScanner().next();
        System.out.print("Personalnummer: ");
        String persnum = getScanner().next();

        App.addVerkaeufer(new Verkaeufer(vorname,nachname,persnum));
    }

    public Scanner getScanner() {
        return _scanner;
    }

    public void setScanner(Scanner _scanner) {
        this._scanner = _scanner;
    }

}
