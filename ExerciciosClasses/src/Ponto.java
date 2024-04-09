public class Ponto {
    private double x;
    private double y;

    public Ponto(){
        x=0;
        y=0;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto(Ponto p){
        this.x = p.getX();
        this.y = p.getY();
    }

    public double getX() {return this.x;}
    public double getY() {return this.y;}
    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}

    public static double distancia(Ponto a, Ponto b){
        if (a.getX()==b.getX()){return Math.abs(a.getY()-b.getY());}
        if (a.getY()==b.getY()){return Math.abs(a.getX()-b.getX());}
        return Math.sqrt(Math.pow(a.getX()-b.getX(), 2)+Math.pow(a.getY()-b.getY(), 2));
    }

}
