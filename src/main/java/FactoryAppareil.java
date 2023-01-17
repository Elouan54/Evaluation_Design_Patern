public class FactoryAppareil {

    public static final String BAD = "BrosseADent";

    public static final String MAL = "MachineALaver";

    public static Appareil createAppareil (String type) {
        Appareil appareil = null;
        switch (type) {
            case BAD:
                Piece Brosse = new Piece(5, "Brosse", "123");
                Piece Manche = new Piece(3, "Manche", "64537");
                appareil = new Appareil("Quenotte3000", "BR6");
                appareil.add(Brosse);
                appareil.add(Manche);
                break;
            case MAL:
                Piece Moteur = new Piece(200, "Moteur 2000", "M6");
                Piece Tambour = new Piece(100, "Tambour premium", "T5737");
                appareil = new Appareil("Lavetou", "ML28");
                appareil.add(Moteur);
                appareil.add(Tambour);
                break;
            default:
                throw new IllegalArgumentException
                        ("Appareil Inconnu.");
        }
        return appareil;
    }
}
