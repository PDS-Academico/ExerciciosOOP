public class Economica extends Passagem {

    public Economica(double basePrice, LocalDate date, int flightNo){
        super(basePrice, date, flightNo, 0, false);
    }

    @Override 
    public double getPrice(){
        return getBasePrice()*1.1;
    }

}
