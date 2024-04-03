public class PrimeiraClasse extends Passagem {

    public PrimeiraClasse(double basePrice, LocalDate date, int flightNo){
        super(basePrice, date, flightNo, 3, true);
    }

    @Override 
    public double getPrice(){
        return getBasePrice()*1.5;
    }

}
