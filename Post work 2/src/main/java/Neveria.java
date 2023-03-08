import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Neveria {
    public static void main(String[] args) {
        Helado heladoSuave = new HeladoSuave();

        heladoSuave = new CoberturaDecorator(heladoSuave);
        heladoSuave = new GalletaDecorator(heladoSuave);
        heladoSuave = new GranolaDecorator(heladoSuave);
        heladoSuave = new JamDecorator(heladoSuave);
        heladoSuave = new ToppingDecorator(heladoSuave);

        System.out.println("[Recibo de compra]");
        System.out.println(heladoSuave.getDescription());
        System.out.println("Total: $" + heladoSuave.getPrice());

    }
}