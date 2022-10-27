
public class SecondiPiatti extends MenuItem {

    public SecondiPiatti (String name, int price, String type, boolean isRecommended){super(name,price,type,isRecommended);}
    @Override
    public String toString() {
        return getType() + " Name = " + this.getName() +", price : "+ this.getPrice() +" euros";
    }

    public void printDetails(){
        System.out.println(getType() + ", " + this.getName() +", price : "+ this.getPrice() +" euros");
    }
}
