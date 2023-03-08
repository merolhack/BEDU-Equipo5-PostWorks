public class ToppingDecorator implements Helado {
    private Helado helado;

    ToppingDecorator(Helado helado) {
        this.helado = helado;
    }
    @Override
    public String getDescription() {
        return helado.getDescription() + "\n  Topping extra";

    }

    @Override
   public int getPrice() {

        return helado.getPrice() + 20;
    }

}