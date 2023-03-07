/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
public class CookieDecorator implements IIceCream {

    private IIceCream iceCream;

    /**
     * Constructor
     */
    CookieDecorator(IIceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", with extra cookie";
    }

    @Override
    public int getPrice() {
        return iceCream.getPrice() + 15;
    }
}
