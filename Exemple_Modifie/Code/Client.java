public class Client {
    public static void main(String[] args) {
        System.out.println("=== Exemple modifie : Builder ===");

        Directeur directeurReine = new Directeur(new MonteurPizzaReine());
        System.out.println("\n... Pizza Reine Fabriquee.");
        directeurReine.construirePizza().print();

        Directeur directeurPiquante = new Directeur(new MonteurPizzaPiquante());
        System.out.println("\n... Pizza Piquante Fabriquee.");
        directeurPiquante.construirePizza().print();

        Directeur directeurVegetarienne = new Directeur(new MonteurPizzaVegetarienne());
        System.out.println("\n... Pizza Vegetarienne Fabriquee.");
        directeurVegetarienne.construirePizza().print();
    }
}
