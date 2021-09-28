public class Kunde extends Methoden {
    String _vorname;
    String _nachname;
    String _adresse;
    String _telefon;
    String _mail;
    String _kundennummer;

    public Kunde(String vorname, String nachname){
        this.setVorname(vorname);
        this.setNachname(nachname);
        String stringKundennummer = String.valueOf(elesInArray(App.getAllKunden())+1);
        this.setKundennummer(stringKundennummer);
    }

    // GETTER

    public String getAdresse() {
        return _adresse;
    }

    public String getMail() {
        return _mail;
    }

    public String getNachname() {
        return _nachname;
    }

    public String getTelefon() {
        return _telefon;
    }

    public String getVorname() {
        return _vorname;
    }

    public String getKundennummer() {
        return _kundennummer;
    }

    // SETTER

    public void setAdresse(String adresse) {
        this._adresse = adresse;
    }

    public void setMail(String mail) {
        this._mail = mail;
    }

    public void setNachname(String nachname) {
        this._nachname = nachname;
    }

    public void setTelefon(String telefon) {
        this._telefon = telefon;
    }

    public void setVorname(String vorname) {
        this._vorname = vorname;
    }

    public void setKundennummer(String _kundennummer) {
        this._kundennummer = _kundennummer;
    }

}
