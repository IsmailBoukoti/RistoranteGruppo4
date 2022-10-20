import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to our restaurant Gusti Antichi");

        List<Drink>drinkList = new ArrayList<>();

        Drink beer = new Drink("Beer", 5,"Drink",false);
        Drink redWhine = new Drink("Red whine ", 8,"Drink", true);
        Drink cocaCola = new Drink("Cocacola",3,"Drink", false);
        Drink water = new Drink("Water",2,"Drink", false);
        drinkList.add(beer);
        drinkList.add(redWhine);
        drinkList.add(cocaCola);
        drinkList.add(water);

        Menu<Drink> drinksMenu = new Menu<>(drinkList);

        System.out.println(drinksMenu);
        beer.printDetails();

        for (MenuItem item: drinkList) {
            if(item.isReccomended()){
                System.out.println("Our reccomended drink is " + item.getName()+item.getPrice() + " euros");
            }
        }
    }
}
