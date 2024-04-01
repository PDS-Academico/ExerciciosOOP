public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String n, double sal){
        nome = n;
        salarioBase = sal;
    }

    public double getSalarioLiquido();

    public String toString(){
        return "Nome: "+ nome;
    }

}
