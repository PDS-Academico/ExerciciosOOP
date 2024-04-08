import java.time.LocalDate;

public class Passagem2 {
    private double basePrice;
    private LocalDate date;
    private int flightNo;
    private Classe classe;


    public Passagem2(double basePrice, LocalDate date, int flightNo, Classe classe) {
        this.basePrice = basePrice;
        this.date = date;
        this.flightNo = flightNo;
        this.classe = classe;
    }
   

    public double getPrice(){return basePrice*classe.getMultiplier();}

    public double getBasePrice() {
        return this.basePrice;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public int getFlightNo() {
        return this.flightNo;
    }

    public int getQMalas() {
        return this.classe.getMalas();
    }

    public boolean getPrioritario() {
        return this.classe.getPrioritario();
    }

    public boolean isPrioritario() {
        return this.classe.getPrioritario();
    }

}
