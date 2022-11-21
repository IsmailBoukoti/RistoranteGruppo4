package it.restaurant;

import it.restaurant.RestaurantTableReservation.Restaurant;
import it.restaurant.RestaurantTableReservation.Table;
import it.restaurant.RestaurantTableReservation.TableStateEnum;
import it.restaurant.food.MenuTypeEnum;
import it.restaurant.customer.Customer;
import it.restaurant.food.*;
import it.restaurant.food.Menu;
import it.restaurant.food.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("------------Welcome to our restaurant Antichi Sapori---------------");
        Restaurant restaurant = Restaurant.getInstance();
        Menu menu = new Menu(new ArrayList<>(), MenuTypeEnum.CLASSIC);
        List<MenuItem> drinkList = new ArrayList<>();

        //Creation Menu

        Drink beer = new Drink("Beer", 5, MenuTypeEnum.VEGETARIAN,false, "malt");
        Drink redWhine = new Drink("Red whine ", 8, MenuTypeEnum.VEGETARIAN, true, "grape");
        Drink cocaCola = new Drink("Cocacola", 3, MenuTypeEnum.VEGETARIAN,false, "sugar");
        Drink water = new Drink("Water", 2, MenuTypeEnum.VEGETARIAN, false, "water");
        drinkList.add(beer);
        drinkList.add(redWhine);
        drinkList.add(cocaCola);
        drinkList.add(water);
        menu.addListToMenu(drinkList);

        List<MenuItem> pastasList = new ArrayList<>();
        Pasta ragu = new Pasta("Rigatoni al ragu", 10, MenuTypeEnum.CLASSIC, MenuTypeEnum.CHILD,true, "pasta");
        Pasta carbonara = new Pasta("Spaghetti alla Carbonara", 12, MenuTypeEnum.CLASSIC ,false, "bacon");
        Pasta piemontese = new Pasta("Agnolotti alla Piemontese", 9, MenuTypeEnum.VEGETARIAN, false, "agnolotti");
        Pasta polpette = new Pasta("Spaghetti alle Polpette", 8, MenuTypeEnum.CHILD ,false, "meatballs");
        Pasta amatriciana = new Pasta("Bucatini alla Matriciana", 10, MenuTypeEnum.CLASSIC,false,"Guanciale");
        Pasta pesto = new Pasta("Penne al Pesto",9, MenuTypeEnum.CHILD,false,"Basilico");
        pastasList.add(ragu);
        pastasList.add(carbonara);
        pastasList.add(piemontese);
        pastasList.add(polpette);
        pastasList.add(amatriciana);
        pastasList.add(pesto);
        menu.addListToMenu(pastasList);

        List<MenuItem> mainDish = new ArrayList<>();
        MainDish tagliataDiManzo = new MainDish("Tagliata di Manzo", 19, MenuTypeEnum.CLASSIC , MenuTypeEnum.CHILD,false, "beef");
        MainDish trippaAllaRomana = new MainDish("Trippa alla Romana", 15, MenuTypeEnum.CLASSIC ,true, "trippa");
        MainDish grigliataMista = new MainDish("Grigliata Mista", 22, MenuTypeEnum.CLASSIC ,false, "beef,pork");
        MainDish tartareDiAngus = new MainDish("Tartare di Angus", 25, MenuTypeEnum.CLASSIC ,false, "angus");
        MainDish stincoDiMaiale = new MainDish("Stinco di Maiale",17, MenuTypeEnum.CLASSIC,false,"maiale");
        MainDish polloAllaCacciatora = new MainDish("Pollo alla Cacciatora",15, MenuTypeEnum.CHILD,false,"pollo");
        mainDish.add(tagliataDiManzo);
        mainDish.add(trippaAllaRomana);
        mainDish.add(grigliataMista);
        mainDish.add(tartareDiAngus);
        mainDish.add(stincoDiMaiale);
        mainDish.add(polloAllaCacciatora);
        menu.addListToMenu(mainDish);

        List<MenuItem> sideDishesList = new ArrayList<>();
        SideDish chips = new SideDish("Chips", 3.5, MenuTypeEnum.VEGETARIAN ,false, "potato");
        SideDish ovenPotatoes = new SideDish("Oven potatoes", 4, MenuTypeEnum.VEGETARIAN ,false, "potatoes");
        SideDish salad = new SideDish("Salad", 3, MenuTypeEnum.VEGETARIAN, false, "salad");
        SideDish potatoCroquettes = new SideDish("Potato Croquettes", 4.5, MenuTypeEnum.VEGETARIAN ,false, "salt");
        SideDish grilledVegetable = new SideDish("Grilled vegetable", 4.5, MenuTypeEnum.VEGETARIAN, true, "vegetable");
        SideDish insalataOlivier = new SideDish("Insalata Olivier",5.5, MenuTypeEnum.CHILD,false,"potatos and peas");
        sideDishesList.add(chips);
        sideDishesList.add(ovenPotatoes);
        sideDishesList.add(salad);
        sideDishesList.add(potatoCroquettes);
        sideDishesList.add(grilledVegetable);
        sideDishesList.add(insalataOlivier);
        menu.addListToMenu(sideDishesList);

        //Creation Customers

        Customer customer1 = new Customer("Gianni", "Agnelli", MenuTypeEnum.CLASSIC);
        Customer customer2 = new Customer("Giulia", MenuTypeEnum.VEGETARIAN);
        Customer customer3 = new Customer("Andrea", MenuTypeEnum.CHILD);


        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        System.out.println("------------------And here the menu--------------");

        //Loop for assign each menu type to each type of customer with a method but if you want you can print the menu
        //That you want for example menu.printVegetarianMenu(menu);
        customers.forEach(customer -> {menu.printMenuTypeByCustomerType(customer,menu);});

        System.out.println("------------Recommendation:----------------");

        menu.printRecommendedDishes();

        // book the table

        Table table1 = new Table("Tavolo 1", TableStateEnum.FREE );
        Table table2 = new Table("Tavolo 2", TableStateEnum.FREE );
        Table table3 = new Table("Tavolo 3", TableStateEnum.FREE );

        restaurant.reserveTable(table1,customer1);
        restaurant.reserveTable(table2,customer2);
        restaurant.reserveTable(table3,customer3);

        restaurant.cleanTable(table2,customer2);

        System.out.println("Situazione attuale dei tavoli occupati e dei clienti che stanno consumando");

        restaurant.getMyRestaurant().forEach((table,customer)-> System.out.println(table.getName() + " is " + table.getTableState().toString().toLowerCase() + " by "+ customer.getDetails().toLowerCase()));


    }
}




