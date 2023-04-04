public class Main {
    public static void main(String[] args) {
        Aluno aluno = Aluno.getInstance();
        aluno.set_nome("OZONIO");
        Aluno aluno1 = Aluno.getInstance();
        System.out.println(aluno1.get_nome());
        }
}