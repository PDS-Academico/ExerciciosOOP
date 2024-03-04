/*
1) Cadastrar um novo professor

2) Listar todos os professores cadastrados

3) Exibir a classificação de um professor dado seu nome

4) Fim
*/

import java.util.Scanner;

public class App{
    public static void main(String args[]){ 
        Scanner s = new Scanner(System.in);
        Professor p = new Professor(null,0);
        System.out.println(p.toString());
        System.out.println("Categoria:"+p.classifica());
        s.close();
    }
  }