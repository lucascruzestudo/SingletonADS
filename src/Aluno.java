public class Aluno {

    private static Aluno instancia;

    private String _nome;
    private int _idade;
    private String _ra;

    public String get_nome(){
        return this._nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }

    public int get_idade() {
        return _idade;
    }

    public void set_idade(int _idade) {
        this._idade = _idade;
    }

    public String get_ra() {
        return _ra;
    }

    public void set_ra(String _ra) {
        this._ra = _ra;
    }

    public static Aluno getInstance(){
        if (instancia == null){
            instancia = new Aluno();
        }
        return instancia;
    }

    private Aluno(){

    }
}
