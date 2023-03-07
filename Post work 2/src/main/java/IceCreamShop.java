/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
public class IceCreamShop {
    public static void main(String[] args) {
        IIceCream softIceCream = new SoftIceCream();
        System.out.println("Main Order: " + softIceCream.getDescription() + " $" + softIceCream.getPrice());
        
        softIceCream = new CoverageDecorator(softIceCream);
        System.out.println(" * Adding extra coverage - Subtotal: $" + softIceCream.getPrice());
        softIceCream = new GranolaDecorator(softIceCream);
        System.out.println(" * Adding Granola - Subtotal: $" + softIceCream.getPrice());
        softIceCream = new ToppingDecorator(softIceCream);
        System.out.println(" * Adding Topping - Subtotal: $" + softIceCream.getPrice());
        softIceCream = new JamDecorator(softIceCream);
        System.out.println(" * Adding Jam - Subtotal: $" + softIceCream.getPrice());
        softIceCream = new CookieDecorator(softIceCream);
        System.out.println(" * Adding cookie - Subtotal: $" + softIceCream.getPrice());

        System.out.println("[Total]: " + softIceCream.getDescription() + " $" + softIceCream.getPrice());
    }
}
