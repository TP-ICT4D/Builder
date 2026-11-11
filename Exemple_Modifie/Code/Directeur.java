public class Directeur {
    private MonteurPizza monteur;

    public Directeur(MonteurPizza monteur) {
        this.monteur = monteur;
    }

    public Pizza construirePizza() {
        monteur.monterPate();
        monteur.monterSauce();
        monteur.monterGarniture();
        return monteur.getPizza();
    }
}
