public class GranolaDecorator implements Helado {
    private Helado helado;

    GranolaDecorator(Helado helado) {
        this.helado = helado;
    }
    @Override
    public String getDescription() {
        return helado.getDescription() + "\n  granola añadida";

    }

    @Override
   public int getPrice() {
        return helado.getPrice() + 10;
    }

}