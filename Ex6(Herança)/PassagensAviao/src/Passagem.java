import java.time.LocalDate;

public abstract class Passagem {
    private double basePrice;
    private LocalDate date;
    private int flightNo;
    private int qMalas;
    private boolean prioritario;

    public Passagem(double basePrice, LocalDate date, int flightNo, int qMalas, boolean prioritario) {
        this.basePrice = basePrice;
        this.date = date;
        this.flightNo = flightNo;
        this.qMalas = qMalas;
        this.prioritario = prioritario;
    }

    public abstract double getPrice();

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
        return this.qMalas;
    }

    public boolean getPrioritario() {
        return this.prioritario;
    }

    public boolean isPrioritario() {
        return this.prioritario;
    }

}
