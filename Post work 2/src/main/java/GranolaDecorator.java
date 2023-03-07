/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
public class GranolaDecorator implements IIceCream {

    private IIceCream iceCream;

    /**
     * Constructor
     */
    GranolaDecorator(IIceCream iceCream) {
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
