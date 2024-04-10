public class Pesquisador extends Funcionario {
    private int especialização;


    public Pesquisador(String matricula, String nome, double salarioBruto, int especialização) {
        super(matricula, nome, salarioBruto);
        this.especialização = especialização;
    }

    public int getEspecialização() {
        return this.especialização;
    }

    public void setEspecialização(int especialização) {
        this.especialização = especialização;
    }

    
}


