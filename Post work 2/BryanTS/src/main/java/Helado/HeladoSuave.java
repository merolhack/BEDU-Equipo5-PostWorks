public class HeladoSuave implements Helado{

    protected String description = "Helado Suave";
    protected int price = 30;

    @Override
    public String getDescription(){
        return description;
    }

    @Override
    public int getPrice(){
        return price;
    }
}