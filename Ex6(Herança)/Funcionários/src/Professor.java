public class Professor extends Funcionario {
    private int cargaHorariaMensal;

    public Professor(String n, double sal, int carga){
        super(n, sal);
        cargaHorariaMensal = carga;
    }

    public getSalarioLiquido(){
        double salMes = getSalarioBase()/44;
        return salMes*cargaHorariaMensal;
    }


}
