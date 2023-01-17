public abstract class ComponentPiece {

    private String nom;
    private String code;

    public ComponentPiece(String nom, String code) {
        this.nom = nom;
        this.code = code;
    }

    abstract int getPrix();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}