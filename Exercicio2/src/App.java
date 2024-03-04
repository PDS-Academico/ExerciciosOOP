/*
1) Cadastrar um novo professor

2) Listar todos os professores cadastrados

3) Exibir a classificação de um professor dado seu nome

4) Fim
*/

import java.util.Scanner;

public class App{
    public static void main(String args[]){ 
        Menu m = new Menu();

        while(!m.Quit()){
        m.Start();
        }
    }
  }