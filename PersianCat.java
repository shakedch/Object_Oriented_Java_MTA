public class PersianCat extends Cat{
    private char rateCat;
    private double price;

    public PersianCat(int id, int price){
        super(id, price);
        this.price = price;
    }

@Override
    public   double rateTheCat(){
    System.out.println("persian");
        double rate = (double) ( price%100) /30;
        return rate;
    }
}
