package it.restaurant;

import it.restaurant.RestaurantTableReservation.Reservation;
import it.restaurant.RestaurantTableReservation.Restaurant;
import it.restaurant.RestaurantTableReservation.Table;
import it.restaurant.RestaurantTableReservation.TableStateEnum;
import it.restaurant.customer.CustomerCart;
import it.restaurant.food.MenuTypeEnum;
import it.restaurant.customer.Customer;
import it.restaurant.food.*;
import it.restaurant.food.Menu;
import it.restaurant.food.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args){

        System.out.println("------------Welcome to our restaurant Antichi Sapori---------------");
        Restaurant restaurant = Restaurant.getInstance();
        Menu       menu       = new Menu(new ArrayList<>());

        List<MenuTypeEnum> menuForClassic = new ArrayList<>();
        menuForClassic.add(MenuTypeEnum.CLASSIC);

        List<MenuTypeEnum> menuForVegetarian = new ArrayList<>();
        menuForVegetarian.add(MenuTypeEnum.VEGETARIAN);

        List<MenuTypeEnum> menuForClassicChild = new ArrayList<>();
        menuForClassicChild.add(MenuTypeEnum.CLASSIC);
        menuForClassicChild.add(MenuTypeEnum.CHILD);

        List<MenuTypeEnum> menuForClassicVegetarian = new ArrayList<>();
        menuForClassicVegetarian.add(MenuTypeEnum.CLASSIC);
        menuForClassicVegetarian.add(MenuTypeEnum.VEGETARIAN);

        List<MenuTypeEnum> menuForAll = new ArrayList<>();
        menuForAll.add(MenuTypeEnum.CLASSIC);
        menuForAll.add(MenuTypeEnum.VEGETARIAN);
        menuForAll.add(MenuTypeEnum.CHILD);


        //Creation Menu
        List<MenuItem> drinkList = new ArrayList<>();
        Drink          beer      = new Drink("Beer",5,menuForClassicVegetarian,false,"malt");
        Drink          redWine  = new Drink("Red wine ",8,menuForClassicVegetarian,true,"grape");
        Drink          cocaCola  = new Drink("Cocacola",3,menuForAll,false,"sugar");
        Drink          water     = new Drink("Water",2,menuForAll,false,"water");
        drinkList.add(beer);
        drinkList.add(redWine);
        drinkList.add(cocaCola);
        drinkList.add(water);
        menu.addListToMenu(drinkList);

        List<MenuItem> wineList = new ArrayList<>();
        Wine            montepulciano = new Wine("Rosso di Montepulciano",30.50,menuForAll,true,"Red wine",14);
        Wine            montefalco = new Wine("Rosso Montefalco", 22,menuForAll,false,"Red wine",13.5);
        Wine            montalcino = new Wine("Brunello di Montalcino",50,menuForAll,true,"Red wine",14);
        Wine            pecorino = new Wine("Pecorino",18,menuForAll,false,"White wine",13);
        Wine            cabernetFranc = new Wine("Cabernet Franc",45.5,menuForAll,true,"White wine",13.5);
        Wine            fume = new Wine("Bianco Fume",32.5,menuForAll,false,"White wine",14);
       wineList.add(montepulciano);
       wineList.add(montefalco);
       wineList.add(montalcino);
       wineList.add(pecorino);
       wineList.add(cabernetFranc);
       wineList.add(fume);
       menu.addListToMenu(wineList);

        List<MenuItem> pastasList  = new ArrayList<>();
        Pasta          ragu        = new Pasta("Rigatoni al ragu",10,menuForClassic,true,"pasta");
        Pasta          carbonara   = new Pasta("Spaghetti alla Carbonara",12,menuForClassic,false,"bacon");
        Pasta          piemontese  = new Pasta("Agnolotti alla Piemontese",9,menuForVegetarian,false,"agnolotti");
        Pasta          polpette    = new Pasta("Spaghetti alle Polpette",8,menuForClassicChild,false,"meatballs");
        Pasta          amatriciana = new Pasta("Bucatini alla Matriciana",10,menuForClassic,false,"Guanciale");
        Pasta          pesto       = new Pasta("Penne al Pesto",9,menuForAll,false,"Basilico");
        pastasList.add(ragu);
        pastasList.add(carbonara);
        pastasList.add(piemontese);
        pastasList.add(polpette);
        pastasList.add(amatriciana);
        pastasList.add(pesto);
        menu.addListToMenu(pastasList);

        List<MenuItem> mainDish            = new ArrayList<>();
        MainDish       tagliataDiManzo     = new MainDish("Tagliata di Manzo",19,menuForClassic,false,"beef");
        MainDish       trippaAllaRomana    = new MainDish("Trippa alla Romana",15,menuForClassic,true,"trippa");
        MainDish       grigliataMista      = new MainDish("Grigliata Mista",22,menuForClassic,false,"beef,pork");
        MainDish       tartareDiAngus      = new MainDish("Tartare di Angus",25,menuForClassic,false,"angus");
        MainDish       stincoDiMaiale      = new MainDish("Stinco di Maiale",17,menuForClassicChild,false,"maiale");
        MainDish       polloAllaCacciatora = new MainDish("Pollo alla Cacciatora",15,menuForClassic,false,"pollo");
        mainDish.add(tagliataDiManzo);
        mainDish.add(trippaAllaRomana);
        mainDish.add(grigliataMista);
        mainDish.add(tartareDiAngus);
        mainDish.add(stincoDiMaiale);
        mainDish.add(polloAllaCacciatora);
        menu.addListToMenu(mainDish);

        List<MenuItem> sideDishesList   = new ArrayList<>();
        SideDish       chips            = new SideDish("Chips",3.5,menuForAll,false,"potato");
        SideDish       ovenPotatoes     = new SideDish("Oven potatoes",4,menuForAll,false,"potatoes");
        SideDish       salad            = new SideDish("Salad",3,menuForClassicVegetarian,false,"salad");
        SideDish       potatoCroquettes = new SideDish("Potato Croquettes",4.5,menuForAll,false,"salt");
        SideDish       grilledVegetable = new SideDish("Grilled vegetable",4.5,menuForClassicVegetarian,true,"vegetable");
        SideDish       insalataOlivier  = new SideDish("Insalata Olivier",5.5,menuForClassicVegetarian,false,"potatos and peas");
        sideDishesList.add(chips);
        sideDishesList.add(ovenPotatoes);
        sideDishesList.add(salad);
        sideDishesList.add(potatoCroquettes);
        sideDishesList.add(grilledVegetable);
        sideDishesList.add(insalataOlivier);
        menu.addListToMenu(sideDishesList);


        //Creation Customers

        Customer customer1 = new Customer("Gianni","Agnelli",MenuTypeEnum.CLASSIC, new CustomerCart(new ArrayList<>(), "1234"));
        Customer customer2 = new Customer("Giulia",MenuTypeEnum.VEGETARIAN);
        Customer customer3 = new Customer("Andrea",MenuTypeEnum.CHILD);

        List<Customer> customerList = new ArrayList<>();

        customerList.add(customer1);
        customerList.add(customer2);

        Reservation reservation1 = new Reservation("468",customerList);
        Reservation reservation2 = new Reservation("468", new ArrayList<>());
        reservation1.addCustomerToReservation(customer1);
        reservation1.addCustomerToReservation(customer2);
        reservation1.addCustomerToReservation(customer3);

        System.out.println("------------------And here the menu--------------");

        //Loop for assign each menu type to each type of customer with a method
        //customers.forEach(single->menu.printMenuTypeByCustomerType(single,menu));

        menu.printMenuTypeByCustomerType(customer1,menu);


        System.out.println("------------Recommendation:----------------");

        menu.printRecommendedDishes();

        // book the table

        Table table1 = new Table("Tavolo 1",4);
        Table table2 = new Table("Tavolo 2",4);
        Table table3 = new Table("Tavolo 3",8);

        restaurant.reserveTable(table1,reservation1);

        restaurant.cleanTable(table2,reservation1);

        System.out.println("Situazione attuale dei tavoli occupati e dei clienti che stanno consumando");

        restaurant.printRestaurantInfo();

        // order item from the menu

        customer1.orderMenuItem(chips);
        customer1.orderMenuItem(salad);
        customer1.orderMenuItem(redWine);
        customer1.getCart().printCartDetails();

        customer1.addFidelityPoints(50);

        customer1.printBill();

    }
}


