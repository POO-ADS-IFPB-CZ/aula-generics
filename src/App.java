public class App {

    public static void main(String[] args) {

        Caixa<String> caixaString = new Caixa<>();
        Caixa<Integer> caixaInteger = new Caixa<>();

        caixaString.setObjeto("Paulo");
        caixaInteger.setObjeto(10);
        System.out.println(caixaString.getObjeto());

    }

}
