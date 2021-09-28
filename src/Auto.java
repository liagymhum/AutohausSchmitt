public class Auto {
    String _marke;
    int _preis;
    String _modell;
    int _baujahr;

    public Auto(String marke, String modell, int baujahr){
        this.setMarke(marke);
        this.setModell(modell);
        this.setBaujahr(baujahr);

    }

    // GETTER

    public String getMarke() {
        return _marke;
    }

    public int getBaujahr() {
        return _baujahr;
    }

    public String getModell() {
        return _modell;
    }

    public int getPreis() {
        return _preis;
    }

    // SETTER

    public void setMarke(String marke) {
        this._marke = marke;
    }

    public void setBaujahr(int baujahr) {
        this._baujahr = baujahr;
    }

    public void setModell(String modell) {
        this._modell = modell;
    }

    public void setPreis(int preis) {
        this._preis = preis;
    }

}
