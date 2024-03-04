/*
1) Cadastrar um novo professor

2) Listar todos os professores cadastrados

3) Exibir a classificação de um professor dado seu nome

4) Fim
 */
public class CadastroProf{
    private Professor[] cadastro;
    private int vagas;

    public CadastroProf(){
        cadastro = new Professor[10];
        vagas = 10;
    }
    public void AddProf(Professor p){
        if (p == null){
            p = new Professor(null,0);
        
        } 

    }
}