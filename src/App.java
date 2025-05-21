import java.util.Arrays;
import java.util.Objects;

public class App {
    public static void main(String[] args) {
        teste("João");
        teste(1);
        teste(new Professor("111.111.111-01", "JOão", 1230));
    }

    public static <T extends Number> void teste(T obj){

    }

}
