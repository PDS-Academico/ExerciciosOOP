public class Game {
    private final PinoColorido[] solution;
    private int attempts;
    private int colorRange;
    private int size;


    public Game(PinoColorido[] solution, int attempts, int colorRange, int size) {
        //TODO make password builder makePass()
        this.solution = solution;//temporario
        this.attempts = attempts;
        this.colorRange = colorRange;
        this.size = size;
        play();
    }

    private void play(){
        boolean win =false;
        for (int i = 0; i < attempts; i++) {
            win = round();
            if(win){break;}
        }

    }

    private boolean round(){
        PinoColorido[] tentativa = new PinoColorido[size];
        int [] pinos = Compara(tentativa, solution);
        return pinos[0]==size;
        //add tentativa na lista
    }

    private void cycle(PinoColorido c){
        int i = c.cor.index()+1;
        if (i>=colorRange){i=0;}
        COLOR[] array = COLOR.values();
        c.setCor(array[i]);
    }

    public int[] Compara(PinoColorido[] a,PinoColorido[]b){
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



}
