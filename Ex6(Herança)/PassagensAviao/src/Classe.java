public enum Classe {
    ECONOMICA(0, false, 1.1),
    EXECUTIVA(1, false, 1.3),
    PRIMEIRA(3,true, 1.5),

    private final int malas;
    private final boolean prioritario;
    private final double custoOperacional;

    Classe(int m, boolean p, double m){
        malas = m;
        prioritario = p;
        custoOperacional =m;
    }

}
