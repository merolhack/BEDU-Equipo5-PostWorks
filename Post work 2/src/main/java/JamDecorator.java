public class JamDecorator implements Helado {
    private Helado helado;

    JamDecorator(Helado helado) {
        this.helado = helado;
    }
    @Override
    public String getDescription() {
        return helado.getDescription() + "\n  mermelada extra";

    }

    @Override
   public int getPrice() {

        return helado.getPrice() + 10;
    }

}