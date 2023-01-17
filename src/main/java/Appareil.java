import java.util.ArrayList;
import java.util.List;

public class Appareil extends ComponentPiece{

    private List<ComponentPiece> children = new ArrayList<>();

    public Appareil(String nom, String code) {
        super(nom, code);
    }

    @Override
    int getPrix() {
        int prixTotale = 0;
        for (ComponentPiece c : children){
            prixTotale += c.getPrix();
        }
        return prixTotale;
    }

    public void add(ComponentPiece piece){
        children.add(piece);
    }

    public void remove(ComponentPiece piece){
        children.remove(piece);
    }
}
