public class Directeur {
    public Pizza construirePizzaReine() {
        MonteurPizza pizzaReine = new MonteurPizzaReine();
        return pizzaReine.getPizza();
    }

    public Pizza construirePizzaPiquante() {
        MonteurPizza pizzaPiquante = new MonteurPizzaPiquante();
        return pizzaPiquante.getPizza();
    }
}
