public class Main {

    public static void main(String[] args){

        FactoryAppareil factory = new FactoryAppareil();

        Appareil appareil1 = factory.createAppareil("BrosseADent");
        Appareil appareil2 = factory.createAppareil("MachineALaver");
        //Appareil appareil3 = factory.createAppareil("Erreur");    Erreur Appareil Inconnu

        System.out.println("Nom : " + appareil1.getNom());
        System.out.println("Code : " + appareil1.getCode());
        System.out.println("Prix des pièces : " + appareil1.getPrix() + "\n");

        System.out.println("Nom : " + appareil2.getNom());
        System.out.println("Code : " + appareil2.getCode());
        System.out.println("Prix des pièces : " + appareil2.getPrix());
    }
}
