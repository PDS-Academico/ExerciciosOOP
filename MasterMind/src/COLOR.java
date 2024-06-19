import java.awt.Color;
public enum COLOR {//Pedro
    AZUL(0),VERMELHO(1),VERDE(2),AMARELO(3),CIANO(4),VIOLETA(5),LARANJA(6),INDIGO(7),ROSA(8),MARROM(9),AZUL_ESCURO(10),VERDE_ESCURO(11);
    private final int index;
    COLOR(int i){index=i;}
    @Override
    public String toString() {
        return index+"";
    }
    public int index(){return index;}
    public Color getCor(){
        switch (this){
            case AMARELO:
                return new Color(254, 242, 0);
            case AZUL:
                return new Color(22, 131, 255);
            case AZUL_ESCURO:
                return new Color(0, 79, 166);
            case CIANO:
                return new Color(56, 254, 219);
            case INDIGO:
                return new Color(75, 0, 130);
            case LARANJA:
                return new Color(255, 122, 0);
            case MARROM:
                return new Color(150, 75, 0);
            case ROSA:
                return new Color(255, 69, 180);
            case VERDE:
                return new Color(67, 213, 83);
            case VERDE_ESCURO:
                return new Color(6, 116, 57);
            case VERMELHO:
                return new Color(255, 0, 0);
            case VIOLETA:
                return new Color(143, 0, 255);
            default:
                return new Color(255, 0, 220);
        }
    }
}
