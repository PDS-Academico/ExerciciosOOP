public enum COLOR {
    AZUL(0),VERMELHO(1),VERDE(2),AMARELO(3);
    private final int index;
    COLOR(int i){index=i;}
    @Override
    public String toString() {
        return index+"";
    }
    public int index(){return index;}
}
