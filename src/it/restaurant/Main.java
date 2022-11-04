package it.restaurant;

import it.restaurant.customers.CustomerTypeEnum;
import it.restaurant.customers.Customers;
import it.restaurant.food.*;
import it.restaurant.food.Menu;
import it.restaurant.food.MenuItem;


import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args){

        System.out.println("Welcome to our restaurant Le Antichi Sapori");
        System.out.println();
        Menu           menu      = new Menu(new ArrayList<>());
        List<MenuItem> drinkList = new ArrayList<>();

        //Creation Menu

        Drink beer     = new Drink("Beer", 5, MenuTypeEnum.MENU_VEGETARIAN, false, "malt");
        Drink redWhine = new Drink("Red whine ", 8, MenuTypeEnum.MENU_VEGETARIAN, true, "grape");
        Drink cocaCola = new Drink("Cocacola", 3, MenuTypeEnum.MENU_VEGETARIAN, false, "sugar");
        Drink water    = new Drink("Water", 2, MenuTypeEnum.MENU_VEGETARIAN, false, "water");
        drinkList.add(beer);
        drinkList.add(redWhine);
        drinkList.add(cocaCola);
        drinkList.add(water);
        menu.addListToMenu(drinkList);

        List<MenuItem> pastasList = new ArrayList<>();
        Pasta          ragu       = new Pasta("Rigatoni al ragu", 10, MenuTypeEnum.MENU_CLASSIC, true, "pasta");
        Pasta          carbonara  = new Pasta("Spaghetti alla Carbonara", 12, MenuTypeEnum.MENU_CLASSIC, false, "bacon");
        Pasta          piemontese = new Pasta("Agnolotti alla Piemontese", 9, MenuTypeEnum.MENU_VEGETARIAN, false, "agnolotti");
        Pasta          polpette   = new Pasta("Spaghetti alle Polpette", 8, MenuTypeEnum.MENU_CHILDREN, false, "meatballs");
        pastasList.add(ragu);
        pastasList.add(carbonara);
        pastasList.add(piemontese);
        pastasList.add(polpette);
        menu.addListToMenu(pastasList);

        List<MenuItem> secondiPiatti    = new ArrayList<>();
        SecondiPiatti  tagliataDiManzo  = new SecondiPiatti("Tagliata di Manzo", 19, MenuTypeEnum.MENU_CLASSIC, false, "beef");
        SecondiPiatti  trippaAllaRomana = new SecondiPiatti("Trippa alla Romana", 15, MenuTypeEnum.MENU_CLASSIC, true, "trippa");
        SecondiPiatti  grigliataMista   = new SecondiPiatti("Grigliata Mista", 22, MenuTypeEnum.MENU_CLASSIC, false, "beef,pork");
        SecondiPiatti  tartareDiAngus   = new SecondiPiatti("Tartare di Angus", 25, MenuTypeEnum.MENU_CLASSIC, false, "angus");
        secondiPiatti.add(tagliataDiManzo);
        secondiPiatti.add(trippaAllaRomana);
        secondiPiatti.add(grigliataMista);
        secondiPiatti.add(tartareDiAngus);
        menu.addListToMenu(secondiPiatti);

        List<MenuItem> sideDishesList   = new ArrayList<>();
        SideDishes     chips            = new SideDishes("Chips", 3.5, MenuTypeEnum.MENU_CHILDREN, false, "potatoes");
        SideDishes     ovenPotatoes     = new SideDishes("Oven potatoes", 4, MenuTypeEnum.MENU_CLASSIC, false, "potatoes");
        SideDishes     salad            = new SideDishes("Salad", 3, MenuTypeEnum.MENU_VEGETARIAN, false, "salad");
        SideDishes     potatoCroquettes = new SideDishes("Potato Croquettes", 4.5, MenuTypeEnum.MENU_CHILDREN, false, "potatoes");
        SideDishes     grilledVegetable = new SideDishes("Grilled vegetable", 4.5, MenuTypeEnum.MENU_VEGETARIAN, true, "vegetable");
        sideDishesList.add(chips);
        sideDishesList.add(ovenPotatoes);
        sideDishesList.add(salad);
        sideDishesList.add(potatoCroquettes);
        sideDishesList.add(grilledVegetable);
        menu.addListToMenu(sideDishesList);

        //Creation Customers

        System.out.println("For how many do you book or for how many people is the table?");
        System.out.println();

        Customers customer1 = new Customers("Gianni", "Agnelli", CustomerTypeEnum.NORMAL);
        Customers customer2 = new Customers("Giulia", CustomerTypeEnum.VEGETARIAN);
        Customers customer3 = new Customers("Andrea", CustomerTypeEnum.CHILD);

        Customers.printNumberOfCustomers();
        System.out.println();

        List<Customers> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        System.out.println("And here the menu");
        System.out.println();

        //Loop for assign each menu type to each type of customer

        for (Customers customer : customers){
            customer.printMenuTypeByCustomerType(customer, menu);
        }

        System.out.println("Recommendation:");
        System.out.println();

        for (MenuItem item : menu.itemList){
            if (item.isRecommended()){
                System.out.println("From our recommended "+item.getType()+" is "+item.getName()+" "+item.getPrice()+" euros");
            }

        /*for (it.restaurant.food.MenuItem item : secondiPiatti) {
            if (item.isRecommended()) {
                System.out.println("Our recommended meat is " + item.getName() + " " + item.getPrice() + " euros");
            }
        }
        for (it.restaurant.food.MenuItem sd : sideDishesList) {
            if (sd.isRecommended()) {
                System.out.println("Our recommended side dish is " + sd.getName() + " " + sd.getPrice() + " euros");
            }
        }
        for (it.restaurant.food.MenuItem item : drinkList) {
            if (item.isRecommended()) {
                System.out.println("Our recommended drink is " + item.getName() + item.getPrice() + " euros");
            }
        }*/
        }
    }
}




