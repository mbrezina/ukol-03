package cz.czechitas.webapp;

public class kartaPexesa {

    String obrazek;
    String postava;
    Integer poradi;

    public kartaPexesa(String obrazek, String postava, Integer poradi) {
        this.obrazek = obrazek;
        this.postava = postava;
        this.poradi = poradi;
    }

    public String getObrazek() {
        return obrazek;
    }

    public String getPostava() {
        return postava;
    }

    public Integer getPoradi() {
        return poradi;
    }

    public void setObrazek(String obrazek) {
        this.obrazek = obrazek;
    }

    public void setPostava(String postava) {
        this.postava = postava;
    }

    public void setPoradi(Integer poradi) {
        this.poradi = poradi;
    }
}
