public class Kunde {
    String _vorname;
    String _nachname;
    String _adresse;
    String _telefon;
    String _mail;

    public Kunde(String vorname, String nachname){
        this.setVorname(vorname);
        this.setNachname(nachname);

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

}
