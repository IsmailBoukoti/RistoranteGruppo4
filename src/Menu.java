import java.util.List;

public class Menu<T extends MenuItem> {

    private final List<T> itemList;

    public List<T> getItemList() {
        return itemList;
    }
    @Override
    public String toString() {
        return "Restaurant Menu = " +
                itemList +
                this.getItemList();
    }
    public Menu(List<T> itemList) {
        this.itemList = itemList;
    }
}
