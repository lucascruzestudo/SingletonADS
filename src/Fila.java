public class Fila{
    private static Fila instancia;

    public void ImprimeDocumento(){
    }
    
    public void RemoveDocumento(){

    }

    public void RemoveTodosDocumentos(){

    }

    public static Fila getInstancia(){
        if (instancia == null){
            instancia = new Fila();
        }
        return instancia;
    }
}