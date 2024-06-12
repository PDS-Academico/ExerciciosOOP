public class Game {
    private final COLOR[] solution;
    private int attempts;
    private int colorRange;
    private int size;


    public Game(COLOR[] solution, int attempts, int colorRange, int size) {
        //TODO make password builder makePass()
        this.solution = solution;
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
        COLOR[] tentativa = new COLOR[size];
        int [] pinos = Compare.Compara(tentativa, solution);
        return pinos[1]==size;
    }

    private void cycle(COLOR c){
        int i = c.index()+1;
        if (i>=colorRange){i=0;}
        COLOR[] array = COLOR.values();
        c = array[i];
    }



}
