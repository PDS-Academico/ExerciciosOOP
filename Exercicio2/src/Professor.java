import java.util.Scanner;

public class Professor {
    private String nome;
    private int anosExperiencia;

    public Professor(String nome, int anosExperiencia) {
        Scanner s = new Scanner(System.in);

        if (nome!= null){this.nome = nome;}
        else {
        System.out.println("Nome do professor?");
        this.nome  = s.next();
        }

        if(anosExperiencia>0){this.anosExperiencia = anosExperiencia;}
        else {
            System.out.println("Quantos anos de experiencia ele tem?");
            this.anosExperiencia  = s.nextInt(); s.next();
        }
    }

    public String getNome() {
        return nome;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public String classifica(){
        // Nova sintaxe do Java 14-15 em diante
        return switch(anosExperiencia){
            case 0,1,2,3,4,5 -> "Assistente";
            case 6,7,8,9,10 -> "Adjunto";
            default -> "Titular";
        };
    }

    @Override
    public String toString() {
        return "Professor: " + nome + ", anos de experiencia:" + anosExperiencia;
    }
}