public class Cat {
    private int id;
    private int price;

    public Cat( int id, int price){
        this.id = id;
        this.price = price;
    }

    protected double rateTheCat(){
        System.out.println("cat");
        double rate = (double) (price * id%100) /5;
        return  rate;
    }
}
