/*
1) Cadastrar um novo professor

2) Listar todos os professores cadastrados

3) Exibir a classificação de um professor dado seu nome

4) Fim
*/

import java.util.Scanner;

public class App{
    public static void main(String args[]){ 
      
      System.out.println("Quantos anos de experiencia ele tem?");
      int experiencia  = s.nextInt();
      Professor p = new Professor(nome,experiencia);
      System.out.println(p.toString());
      System.out.println("Categoria:"+p.classifica());
      s.close();
    }
  }