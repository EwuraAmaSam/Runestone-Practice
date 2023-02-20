public class Motorbike{
    private Person owner;
    private double price;

    public Motorbike(Person theOwner, double cost){
        owner = theOwner;
        price = cost;
    }
    public void setPrice(double newPrice){
        price = newPrice;
    }
    public Person getOwner(){
        return owner;
    }
    public String getOwnersName(){
        return owner.getName;
    }
    public double getPrice(){
        return price;
    }
}