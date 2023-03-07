/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
public class CoverageDecorator implements IIceCream {

    private IIceCream iceCream;

    /**
     * Constructor
     */
    CoverageDecorator(IIceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", with extra coverage";
    }

    @Override
    public int getPrice() {
        return iceCream.getPrice() + 20;
    }
}
