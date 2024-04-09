public class Geometria {
    public static double volumeEsfera(double raio){
        return Math.PI*(4/3.)*Math.pow(raio, 3);
    }
    public static double areaEsfera(double raio){
        return Math.PI*4*Math.pow(raio, 2);
    }
    public static double volumeCilindro(double raio, double altura){
        double base = Math.PI*raio*raio;
        return base*altura;
    }
    public static double areaCilindro(double raio, double altura){
        double base = Math.PI*raio*raio;
        double side = 2*Math.PI*raio*altura;
        return base*2+side;
    }
    
    public static double volumeCone(double raio, double altura){
        double base = Math.PI*raio*raio;
        return base*altura*(1/3.);
    }
}
