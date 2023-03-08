public class GalletaDecorator implements Helado {
    private Helado helado;

    GalletaDecorator(Helado helado) {
        this.helado = helado;
    }
    @Override
    public String getDescription() {
        return helado.getDescription() + "\n  galleta extra";

    }

    @Override
   public int getPrice() {

        return helado.getPrice() + 15;
    }

}