public class Executiva extends Passagem {

    public Executiva(double basePrice, LocalDate date, int flightNo){
        super(basePrice, date, flightNo, 1, false);
    }

    @Override 
    public double getPrice(){
        return getBasePrice()*1.3;
    }

}
