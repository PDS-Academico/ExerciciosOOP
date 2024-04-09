public class App {
    public static void main(String[] args) throws Exception {
        Ponto a = new Ponto();
        Ponto b = new Ponto(3,4);
        Ponto c = new Ponto(0,7);
        Ponto d = new Ponto(9,4);
        System.out.println(Ponto.distancia(a, b));
        System.out.println(Ponto.distancia(a, c));
        System.out.println(Ponto.distancia(d, b));
        System.out.println(Ponto.distancia(b, c));
        System.out.println(Ponto.distancia(d, c));
        System.out.println(Ponto.distancia(a, d));
    }
}
