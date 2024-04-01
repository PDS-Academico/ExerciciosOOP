import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.PrintWriter;

public class Loc {

    public void scan(String file){
        String dir = Paths.get("").toAbsolutePath().toString();
        String filedir = dir +"\\"+file+".txt";
        Path path = Paths.get(filedir);

        try (Scanner sc = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))){
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                String [] locomotiva = linha.split(";");
                System.out.println("Id: "+ locomotiva[0] + ". Peso Máximo: " + locomotiva[1]+ ". Nº de vagões máximo: "+locomotiva[2]+".\n");
            }
        }

        catch (IOException x){System.err.format("Erro de E/S: %s%n", x);}
    }

    public void write(String file, Scanner in){
        String dir = Paths.get("").toAbsolutePath().toString();
        String filedir = dir +"\\"+file+".txt";
        Path path = Paths.get(filedir);
        boolean end = false;
        String s ="";

        if(Files.exists(path)){
            try (Scanner sc = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))){
                while(sc.hasNextLine()){
                    s = sc.nextLine()+"\n";
                }
            }
    
            catch (IOException x){System.err.format("Erro de E/S: %s%n", x);}
        }

        
        
        try (PrintWriter w = new PrintWriter(Files.newBufferedWriter(path, StandardCharsets.UTF_8))){
            w.print(s);
            while (!end){
                System.out.println("Digite o id da locomotiva:");
                w.print(in.nextInt()+";");
                System.out.println("Digite o peso máximo da locomotiva:");
                w.print(in.nextDouble()+";");
                System.out.println("Digite o número máximo de vagões que a locomotiva pode carregar:");
                w.print(in.nextInt());
                
                System.out.println("Deseja adicionar mais uma locomotiva? \n1) Sim \n2) Não");
                if (in.nextInt()==1){w.print("\n");}
                else{end = true; break;}
            }
        }

        catch (IOException x){System.err.format("Erro de E/S: %s%n", x);}
    }
}

