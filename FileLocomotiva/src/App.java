import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("1) Ler arquivo");
        System.out.println("2) Escrever arquivo");
        Loc l = new Loc();
        int m = in.nextInt(); in.nextLine();
        switch (m){
            case 1:
                System.out.println("Digite o nome do arquivo a ser lido:");
                l.scan(in.nextLine());
            
            break;

            case 2:
                System.out.println("Digite o nome do arquivo a ser criado:");
                l.scan(in.nextLine());


            
            break;
            default: break;
        }
        in.close();

    }
}
