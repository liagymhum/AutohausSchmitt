public class Autohaus {
    String _name;
    String _adresse;
    String _telefon;

    // SETTER

    // Methodensignatur [Sichtbarkeitsbereich; Methodenart (Rückgabe oder Dienstleistung); Methodenname; Parameter in den Klammern]
    public void setAdresse(String adresse) { 
        this._adresse = adresse; // Methodenrumpf
    }

    public void setName(String name) {
        this._name = name;
    }

    public void setTelefon(String telefon) {
        this._telefon = telefon;
    }

    // GETTER

    public String getAdresse() {
        return _adresse;
    }

    public String getName() {
        return _name;
    }

    public String getTelefon() {
        return _telefon;
    }

}
