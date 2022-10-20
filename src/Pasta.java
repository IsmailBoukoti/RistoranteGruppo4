public class Pasta extends MenuItem {
    public Pasta(String name, int price, String type, boolean isRecommended) {
        super(name, price, type, isRecommended);
    }

    @Override
    public String toString() {
        return getType()+ " Name = " + this.getName() +", price : "+ this.getPrice() +" euros";
    }

    @Override
    public void printDetails() {
        System.out.println(getType()+", "+this.getName()+", "+this.getPrice()+" euros");
    }
}
