import java.util.Random;
public class Game {//Pedro
    private PinoColorido[] solution;
    private int attempts;
    private int colorRange;
    private int size;


    public Game(int attempts, int colorRange, int size){//Pedro
        makePass();
        this.attempts = attempts;
        this.colorRange = colorRange;
        this.size = size;
        play();
    }

    private void play(){//Pedro
        boolean win =false;
        for (int i = attempts; i > 0; i--) {
            win = round();
            if(win){break;}
        }
        if(win){}//ganhou
        else{}//perdeu

    }

    private boolean round(){//Pedro
        PinoColorido[] tentativa = new PinoColorido[size];
        // monta a tentativa

        int [] pinos = Compara(tentativa, solution);


        //add tentativa na lista
        return pinos[0]==size;
    }

    private void cycle(PinoColorido c){//Pedro
        int i = c.cor.index()+1;
        if (i>=colorRange){i=0;}
        c.setCor(i);
    }

    public int[] Compara(PinoColorido[] a,PinoColorido[]b){//Pedro
        int[] results = new int[2];
        int[] ac = new int[colorRange];//4 cores por enquanto;
        int[] bc = new int[colorRange];

        for(int i =0;i<a.length;i++){
            if(a[i].cor==b[i].cor){results[0]++;}
            ac[a[i].cor.index()]++;
            bc[b[i].cor.index()]++;
        }

        for(int i=0;i<4;i++){
            if(ac[i]<bc[i]){results[1]+=ac[i];}
            else{results[1]+=bc[i];}
        }
        results[1]-=results[0];

        return results;
    }

    public void makePass(){//Pedro
        solution = new PinoColorido[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            solution[i]= new PinoColorido(r.nextInt(colorRange+1));
        }
    }



}
