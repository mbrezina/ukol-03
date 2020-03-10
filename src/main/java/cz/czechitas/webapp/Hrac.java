package cz.czechitas.webapp;

public class Hrac {

    private String jmeno;
    private String prijmeni;
    private String email;
    private Integer pocetVyhranychTurnaju;
    private Integer pocetTurnajuCelkem;
    private Integer poradi;

    public Hrac(String jmeno, String prijmeni, String email, Integer pocetVyhranychTurnaju, Integer pocetTurnajuCelkem, Integer poradi) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.email = email;
        this.pocetVyhranychTurnaju = pocetVyhranychTurnaju;
        this.pocetTurnajuCelkem = pocetTurnajuCelkem;
        this.poradi = poradi;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public String getEmail() {
        return email;
    }

    public Integer getPoradi() {
        return poradi;
    }

    public Integer getPocetVyhranychTurnaju() {
        return pocetVyhranychTurnaju;
    }

    public Integer getPocetTurnajuCelkem() {
        return pocetTurnajuCelkem;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPoradi(Integer poradi) {
        this.poradi = poradi;
    }

    public void setPocetVyhranychTurnaju(Integer pocetVyhranychTurnaju) {
        this.pocetVyhranychTurnaju = pocetVyhranychTurnaju;
    }

    public void setPocetTurnajuCelkem(Integer pocetTurnajuCelkem) {
        this.pocetTurnajuCelkem = pocetTurnajuCelkem;
    }

}
