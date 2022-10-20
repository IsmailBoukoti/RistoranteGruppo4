public class SideDishes extends MenuItem{
    public SideDishes(String name, double price, String type, boolean isRecommended) {
        super(name, price, type, isRecommended);
    }

    @Override
    public String toString() {
        return getType() + " Name = " + this.getName() +", price : "+ this.getPrice() +" euros";
    }

    @Override
    public void printDetails() {
        super.printDetails();
    }
}
