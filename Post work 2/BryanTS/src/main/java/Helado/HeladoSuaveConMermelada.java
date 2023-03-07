public class HeladoSuaveConMermelada implements Helado{
    protected Helado helado;

    protected String description = " con mermelada extra";
    protected int price = 15;

    public HeladoSuaveConMermelada(Helado helado){
        this.helado = helado;
    }

    @Override
    public String getDescription(){
        return helado.getDescription() + description;
    }

    @Override
    public int getPrice(){
        return helado.getPrice() + price;
    }
}