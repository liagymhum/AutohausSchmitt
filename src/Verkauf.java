public class Verkauf {
    Auto _auto;
    Kunde _kunde;
    Verkaeufer _verkaeufer;
    String _preis;

    public Verkauf(Auto auto, Verkaeufer verkaeufer, Kunde kunde, String preis){
        this.setAuto(auto);
        this.setVerkaeufer(verkaeufer);
        this.setKunde(kunde);
        this.setPreis(preis);
    }

    // GETTER

    public Auto getAuto() {
        return _auto;
    }

    public Kunde getKunde() {
        return _kunde;
    }

    public String getPreis() {
        return _preis;
    }

    public Verkaeufer getVerkaeufer() {
        return _verkaeufer;
    }

    //SETTER

    public void setAuto(Auto auto) {
        this._auto = auto;
    }

    public void setKunde(Kunde kunde) {
        this._kunde = kunde;
    }

    public void setPreis(String preis) {
        this._preis = preis;
    }

    public void setVerkaeufer(Verkaeufer verkaeufer) {
        this._verkaeufer = verkaeufer;
    }

}
