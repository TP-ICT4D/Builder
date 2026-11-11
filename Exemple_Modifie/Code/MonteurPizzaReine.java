public class MonteurPizzaReine implements MonteurPizza {
    private Pizza pizza = new Pizza();

    @Override
    public void monterPate() {
        pizza.setPate("croisee");
    }

    @Override
    public void monterSauce() {
        pizza.setSauce("douce");
    }

    @Override
    public void monterGarniture() {
        pizza.setGarniture("jambon+champignon");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
