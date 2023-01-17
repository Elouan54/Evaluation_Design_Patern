public class Piece extends ComponentPiece{

    private int prix;

    public Piece(int prix, String nom, String code){
        super(nom, code);

        this.prix = prix;
    }

    @Override
    int getPrix() {
        return prix;
    }
}
