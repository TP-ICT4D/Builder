public class MonteurPizzaVegetarienne implements MonteurPizza {
    private Pizza pizza = new Pizza();

    @Override
    public void monterPate() {
        pizza.setPate("fine");
    }

    @Override
    public void monterSauce() {
        pizza.setSauce("tomate");
    }

    @Override
    public void monterGarniture() {
        pizza.setGarniture("legumes");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
