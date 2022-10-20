
public abstract class MenuItem {

    private int price;
    private String name;
    private String type;
    private boolean isReccomended;

    public MenuItem(String name, int price,String type,boolean isReccomended) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.isReccomended = isReccomended;
    }

    public int getPrice() {
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

    public boolean isReccomended() {
        return isReccomended;
    }

    public void setReccomended(boolean reccomended) {
        isReccomended = reccomended;
    }
}

