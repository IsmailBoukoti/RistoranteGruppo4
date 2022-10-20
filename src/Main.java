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

        for (MenuItem item: drinkList) {
            if(item.isRecommended()){
                System.out.println("Our recommended drink is " + item.getName()+item.getPrice() + " euros");
            }
        }

        System.out.println();
        System.out.println("---------Ours side dishes are: ");

        List<SideDishes> sideDishesList = new ArrayList<>();

        SideDishes chips = new SideDishes("Chips",3.5,"Side dishes",false);
        SideDishes ovenPotatoes = new SideDishes("Oven potatoes",4,"Side dishes",false);
        SideDishes salad = new SideDishes("Salad",3,"Side dishes",false);
        SideDishes potatoCroquettes = new SideDishes("Potato Croquettes",4.5,"Side dishes",false);
        SideDishes grilledVegetable = new SideDishes("Grilled vegetable",4.5,"Side dishes",true);

        sideDishesList.add(chips);
        sideDishesList.add(ovenPotatoes);
        sideDishesList.add(salad);
        sideDishesList.add(potatoCroquettes);
        sideDishesList.add(grilledVegetable);

        Menu<SideDishes> sideDishesMenu = new Menu<>(sideDishesList);

        System.out.println(sideDishesMenu);

        for (MenuItem sd:sideDishesList
             ) {   if(sd.isRecommended()){
            System.out.println("Our recommended side dish is " + sd.getName()+ " "+sd.getPrice() + " euros");
        }

        }

}}
