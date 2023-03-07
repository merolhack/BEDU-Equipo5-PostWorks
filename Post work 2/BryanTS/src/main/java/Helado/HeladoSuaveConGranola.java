public class HeladoSuaveConGranola implements Helado{
    protected Helado helado;

    protected String description = " con granola extra";
    protected int price = 10;

    public HeladoSuaveConGranola(Helado helado){
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