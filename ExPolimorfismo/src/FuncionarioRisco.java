public class FuncionarioRisco extends Funcionario {
    private Risco risco;

    public FuncionarioRisco(String matricula, String nome, double salarioBruto, Risco risco) {
        super(matricula, nome, salarioBruto);
        this.risco = risco;
    }


    public Risco getRisco() {
        return this.risco;
    }

    public void setRisco(Risco risco) {
        this.risco = risco;
    }

    @Override
    public double getImpRenda(){
        double sal= getSalarioBruto();
        double n = (sal-getINSS())*0.25;
        sal+=n;
        if (n <= LIM_ISENCAO_IR){
            return 0.0;
        }else{
            double aux = n - LIM_ISENCAO_IR;
            double ir = aux * 0.2;
            return ir;
        }
    }

    @Override
    public double getSalarioLiquido(){
        return ((getSalarioBruto() - getINSS())*0.25) - getImpRenda();
    }






}
