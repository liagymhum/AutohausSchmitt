public class Verkaeufer {
    String _vorname;
    String _nachname;
    String _personalnummer;

    public Verkaeufer(String vorname, String nachname, String persnum){
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.setPersonalnummer(persnum);
        
    }

    // GETTER

    public String getNachname() {
        return _nachname;
    }

    public String getPersonalnummer() {
        return _personalnummer;
    }

    public String getVorname() {
        return _vorname;
    }

    // SETTER

    public void setNachname(String nachname) {
        this._nachname = nachname;
    }

    public void setPersonalnummer(String personalnummer) {
        this._personalnummer = personalnummer;
    }

    public void setVorname(String vorname) {
        this._vorname = vorname;
    }

}
