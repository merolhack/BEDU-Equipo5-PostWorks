public class Application{

    public static void main(String[] args){

        System.out.println("Post Work 2");

        Helado heladoSuave = new HeladoSuave();

        Helado heladoSauveConCobertura = new HeladoSuaveConCobertuna(heladoSuave);

        /*
        System.out.println("[Ticket de compra]");
        System.out.println(heladoSauveConCobertura.getDescription());
        System.out.println(heladoSauveConCobertura.getPrice());*/
    }
}