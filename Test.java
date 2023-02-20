public class Test{
    
    public public static void main(String[] args) {
    double suzukiPrice = 1200;
    double harleyPrice = 2000;
    Person girl = new Person("Anisa", 21, "female");
    Person woman = new Person("Mansa", 39, "female");
    Person guy = new Person("Kofi", 25, "male");

    Motorbike bike = new Motorbike(girl, suzukiPrice);

    Person theBoss = bike.getOwner();
    theBoss.setName("Zoey");
    System.out.println("Bike owner: " + bike.getOwnersName());
    System.out.println("Girl: " + girl.getName());
    System.out.println("Bike owner: " + bike.getPrice() + ", Suzuki price: " + 
    suzukiPrice + ", Harley price: " + harleyPrice);

    theBoss = guy;
    bike.setPrice(800);

    girl = woman;
    suzukiPrice = 1500;

    System.out.println("Bike owner: " + bike.getOwnersName());
    System.out.println("Girl: " + girl.getName());
    System.out.println("Bike owner: " + bike.getPrice() + ", Suzuki price: " + 
    suzukiPrice + ", Harley price: " + harleyPrice);

}
   
}