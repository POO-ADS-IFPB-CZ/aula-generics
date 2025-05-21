import java.util.Arrays;
import java.util.Objects;

public class App {
    public static void main(String[] args) {
        Cadastro<? super Integer> cadastro;
        cadastro = new Cadastro<Number>();
    }

    public static <T extends Number> void teste(T obj){

    }

}
