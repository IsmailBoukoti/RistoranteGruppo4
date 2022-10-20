
public abstract class MenuItem {

    private double price;
    private String name;
    private String type;
    private boolean isRecommended;

    public MenuItem(String name, double price, String type, boolean isRecommended) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.isRecommended = isRecommended;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void printDetails(){}

    public boolean isRecommended() {
        return isRecommended;
    }

    public void setRecommended(boolean recommended) {
        isRecommended = recommended;
    }
}

