package it.restaurant;

import it.restaurant.RestaurantTableReservation.Restaurant;
import it.restaurant.RestaurantTableReservation.Table;
import it.restaurant.RestaurantTableReservation.TableStateEnum;
import it.restaurant.customer.CustomerTypeEnum;
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
        Menu menu = new Menu(new ArrayList<>());
        List<MenuItem> drinkList = new ArrayList<>();

        //Creation Menu

        Drink beer = new Drink("Beer", 5,CustomerTypeEnum.VEGETARIAN,false, "malt");
        Drink redWhine = new Drink("Red whine ", 8,CustomerTypeEnum.VEGETARIAN, true, "grape");
        Drink cocaCola = new Drink("Cocacola", 3,CustomerTypeEnum.VEGETARIAN,CustomerTypeEnum.CHILD, false, "sugar");
        Drink water = new Drink("Water", 2,CustomerTypeEnum.VEGETARIAN,CustomerTypeEnum.CHILD, false, "water");
        drinkList.add(beer);
        drinkList.add(redWhine);
        drinkList.add(cocaCola);
        drinkList.add(water);
        menu.addListToMenu(drinkList);

        List<MenuItem> pastasList = new ArrayList<>();
        Pasta ragu = new Pasta("Rigatoni al ragu", 10,CustomerTypeEnum.CLASSIC,CustomerTypeEnum.CHILD,true, "pasta");
        Pasta carbonara = new Pasta("Spaghetti alla Carbonara", 12,CustomerTypeEnum.CLASSIC ,false, "bacon");
        Pasta piemontese = new Pasta("Agnolotti alla Piemontese", 9,CustomerTypeEnum.VEGETARIAN, false, "agnolotti");
        Pasta polpette = new Pasta("Spaghetti alle Polpette", 8,CustomerTypeEnum.CHILD ,false, "meatballs");
        Pasta amatriciana = new Pasta("Bucatini alla Matriciana", 10,CustomerTypeEnum.CLASSIC,false,"Guanciale");
        Pasta pesto = new Pasta("Penne al Pesto",9, CustomerTypeEnum.CHILD,false,"Basilico");
        pastasList.add(ragu);
        pastasList.add(carbonara);
        pastasList.add(piemontese);
        pastasList.add(polpette);
        pastasList.add(amatriciana);
        pastasList.add(pesto);
        menu.addListToMenu(pastasList);

        List<MenuItem> mainDish = new ArrayList<>();
        MainDish tagliataDiManzo = new MainDish("Tagliata di Manzo", 19,CustomerTypeEnum.CLASSIC ,CustomerTypeEnum.CHILD,false, "beef");
        MainDish trippaAllaRomana = new MainDish("Trippa alla Romana", 15,CustomerTypeEnum.CLASSIC ,true, "trippa");
        MainDish grigliataMista = new MainDish("Grigliata Mista", 22,CustomerTypeEnum.CLASSIC ,false, "beef,pork");
        MainDish tartareDiAngus = new MainDish("Tartare di Angus", 25,CustomerTypeEnum.CLASSIC ,false, "angus");
        MainDish stincoDiMaiale = new MainDish("Stinco di Maiale",17,CustomerTypeEnum.CLASSIC,false,"maiale");
        MainDish polloAllaCacciatora = new MainDish("Pollo alla Cacciatora",15,CustomerTypeEnum.CHILD,false,"pollo");
        mainDish.add(tagliataDiManzo);
        mainDish.add(trippaAllaRomana);
        mainDish.add(grigliataMista);
        mainDish.add(tartareDiAngus);
        mainDish.add(stincoDiMaiale);
        mainDish.add(polloAllaCacciatora);
        menu.addListToMenu(mainDish);

        List<MenuItem> sideDishesList = new ArrayList<>();
        SideDish chips = new SideDish("Chips", 3.5,CustomerTypeEnum.VEGETARIAN ,CustomerTypeEnum.CHILD,false, "potato");
        SideDish ovenPotatoes = new SideDish("Oven potatoes", 4,CustomerTypeEnum.VEGETARIAN ,CustomerTypeEnum.CHILD,false, "potatoes");
        SideDish salad = new SideDish("Salad", 3,CustomerTypeEnum.VEGETARIAN, false, "salad");
        SideDish potatoCroquettes = new SideDish("Potato Croquettes", 4.5,CustomerTypeEnum.VEGETARIAN ,CustomerTypeEnum.CHILD,false, "salt");
        SideDish grilledVegetable = new SideDish("Grilled vegetable", 4.5,CustomerTypeEnum.VEGETARIAN, true, "vegetable");
        SideDish insalataOlivier = new SideDish("Insalata Olivier",5.5,CustomerTypeEnum.CHILD,false,"potatos and peas");
        sideDishesList.add(chips);
        sideDishesList.add(ovenPotatoes);
        sideDishesList.add(salad);
        sideDishesList.add(potatoCroquettes);
        sideDishesList.add(grilledVegetable);
        sideDishesList.add(insalataOlivier);
        menu.addListToMenu(sideDishesList);

        //Creation Customers

        Customer customer1 = new Customer("Gianni", "Agnelli", CustomerTypeEnum.CLASSIC);
        Customer customer2 = new Customer("Giulia", CustomerTypeEnum.VEGETARIAN);
        Customer customer3 = new Customer("Andrea", CustomerTypeEnum.CHILD);


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




