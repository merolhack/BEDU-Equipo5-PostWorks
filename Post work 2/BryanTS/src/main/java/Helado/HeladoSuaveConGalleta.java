public class HeladoSuaveConGalleta implements Helado{
    protected Helado helado;

    protected String description = " con galleta extra";
    protected int price = 15;

    public HeladoSuaveConGalleta(Helado helado){
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