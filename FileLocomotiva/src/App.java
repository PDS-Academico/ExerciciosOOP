import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int m = 1;
        Scanner in = new Scanner(System.in);
        while(m>0&&m<3){
            System.out.println("1) Ler arquivo");
            System.out.println("2) Escrever arquivo");
            System.out.println("Utilize qualquer outro número pra sair");
            Loc l = new Loc();
            
            m = in.nextInt(); in.nextLine();
            switch (m){
                case 1:
                    System.out.println("Digite o nome do arquivo a ser lido:");
                    l.scan(in.nextLine());
                break;

                case 2:
                    System.out.println("Digite o nome do arquivo a ser criado:");
                    l.write(in.nextLine(),in);
                break;

                default: break;
            }
        }
        in.close();
    }
}