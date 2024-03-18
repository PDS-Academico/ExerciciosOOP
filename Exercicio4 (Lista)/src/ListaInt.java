public class ListaInt {
    private int [] list;
    private int cont, size;

    public ListaInt(int size){
        this.size = size;
        list = new int [size];
        cont = 0;
    }

    public void addAbove (int n){
        if (cont == size) {expand();}
    }

}
