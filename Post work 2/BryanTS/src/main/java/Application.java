public class Application{

    public static void main(String[] args){

        System.out.println("Post Work 2");

        Helado heladoSuave = new HeladoSuave();

        heladoSuave = new HeladoSuaveConCobertura(heladoSuave);
        heladoSuave = new HeladoSuaveConTopping(heladoSuave);
        heladoSuave = new HeladoSuaveConGranola(heladoSuave);

        heladoSuave = new HeladoSuaveConMermelada(heladoSuave);
        heladoSuave = new HeladoSuaveConGalleta(heladoSuave);


        System.out.println("[Ticket de compra]");
        System.out.println(heladoSuave.getDescription());
        System.out.println("$" + heladoSuave.getPrice());
    }
}