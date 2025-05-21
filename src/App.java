import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        CadastroAluno cadastroAluno = new CadastroAluno();
        cadastroAluno.adicionarAluno(
            new Aluno("111.111.111-01", "João", 123)
        );
        cadastroAluno.adicionarAluno(
            new Aluno("222.222.222-02", "Maria", 456)
        );
        System.out.println(Arrays.toString(cadastroAluno.getAlunos()));
    }
}
