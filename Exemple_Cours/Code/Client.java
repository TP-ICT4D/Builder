public class Client {
    public static void main(String[] args) {
        System.out.println("=== Exemple du cours : Builder ===");

        Directeur directeur = new Directeur();

        System.out.println("\n... Pizza Reine Fabriquee.");
        directeur.construirePizzaReine().print();

        System.out.println("\n... Pizza Piquante Fabriquee.");
        directeur.construirePizzaPiquante().print();
    }
}
