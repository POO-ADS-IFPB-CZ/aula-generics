import java.util.Arrays;

public class Cadastro<T> {

    private T[] elementos;
    private int quantidade;

    public Cadastro(){
        elementos = (T[]) new Object[10];
        quantidade = 0;
    }

    public boolean adicionarElemento(T elemento){
        if(quantidade < elementos.length){
            elementos[quantidade++] = elemento;
            return true;
        }
        return false;
    }

    public T[] getElementos(){
        return Arrays.copyOfRange(elementos, 0, quantidade);
    }

}
