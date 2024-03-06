class Turma{
    private int numero;
    private String professor;
    private int vagas;
    private Aluno[] alunos;
    private int qtdadeAlunos;

    public Turma(int nro,String nomeProf,int vagas){
        if (nro<=0 || nomeProf.length() < 2 || vagas <=0){
            throw new IllegalArgumentException("Valor inválido");
        }
        this.numero = nro;
        this.professor = nomeProf;
        this.vagas = vagas;
        this.alunos = new Aluno[vagas];
        this.qtdadeAlunos = 0;
    }
    public void novoAluno(Aluno aluno){
        if (qtdadeAlunos == vagas){
            throw new IllegalStateException("Turma cheia!");
        }
        alunos[qtdadeAlunos] = aluno;
        qtdadeAlunos++;
    }
    public void infoNota (long mat, int nota, float valor){
        int n = 0;
        while (alunos[n].getMatricula() != mat){
            n++;
            if(n>qtdadeAlunos){
                throw new IllegalArgumentException("Nenhum aluno com esse número de matrícula.");
            }
        }
        alunos[n].setNota(nota,valor);
    } 
    public Aluno recuperaAluno (long mat){
        int n=0;
        while (alunos[n].getMatricula() != mat){
            n++;
            if(n>qtdadeAlunos){
                return null;
            }
        }
        return alunos[n];
    }
    public Aluno[] lista(){
        return alunos;
    }
    public Aluno[] aprovados(){
        int n=0;
        for (int c =0; c<=vagas;c++){
            if (alunos[n].aprovado()){n++;}
        }
        Aluno[] ap = new Aluno[n];
        int n2=0;
        for (int c =0; c<=vagas;c++){
            if (alunos[n].aprovado()){ap[n2++]=alunos[n];}
        }
        return ap;
    }
    public Aluno[] reprovados(){
        int n=0;
        for (int c =0; c<=vagas;c++){
            if (!alunos[n].aprovado()){n++;}
        }
        Aluno[] rep = new Aluno[n];
        int n2=0;
        for (int c =0; c<=vagas;c++){
            if (!alunos[n].aprovado()){rep[n2++]=alunos[n];}
        }
        return rep;
    }
}