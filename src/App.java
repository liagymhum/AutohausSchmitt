public class App {

    static Auto[] _autos;
    static Kunde[] _kunden;
    static Verkaeufer[] _verkaeufer;

    public static void main(String[] args) throws Exception {
        //Initialisieren der Arrays
        _autos = new Auto[8]; // Anzahl maximal möglicher Elemente im Array
        _kunden = new Kunde[8];
        _verkaeufer = new Verkaeufer[8];

        Menu menu = new Menu();
        menu.startMenu();
    }

/*
    public static void addAuto(Auto auto){
        _autos[0] = auto;
    }
*/

    public static void addObject(Object ele, Object[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] == null){
                array[i] = ele;
                break;
            }
        }
    }

    public static void addAuto(Auto auto){
        addObject(auto, getAllAutos());
    }

    public static Auto[] getAllAutos(){
        return _autos;
    }

    public static void addKunde(Kunde kunde){
        addObject(kunde, getAllKunden());
    }

    public static Kunde[] getAllKunden(){
        return _kunden;
    }

    public static void addVerkaeufer(Verkaeufer v){
        addObject(v, getAllVerkaeufer());
    }

    public static Verkaeufer[] getAllVerkaeufer(){
        return _verkaeufer;
    }
}
