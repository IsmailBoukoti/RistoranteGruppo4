package it.restaurant;

import it.restaurant.RestaurantTableReservation.Reservation;
import it.restaurant.RestaurantTableReservation.Restaurant;
import it.restaurant.RestaurantTableReservation.Table;
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

        System.out.println("------------Welcome to our restaurant 'Antichi Sapori'---------------");
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
        Drink          beer      = new Drink("Beer",5,menuForClassicVegetarian,false,"malt",false);
        Drink          redWine  = new Drink("Red wine ",8,menuForClassicVegetarian,true,"grape",false);
        Drink          cocaCola  = new Drink("Cocacola",3,menuForAll,false,"sugar",false);
        Drink          water     = new Drink("Water",2,menuForAll,false,"water",false);
        Drink          coffee = new Drink("coffee",1.5,menuForAll,false,"coffee beans, water",false);
        drinkList.add(beer);
        drinkList.add(redWine);
        drinkList.add(cocaCola);
        drinkList.add(water);
        drinkList.add(coffee);
        menu.addListToMenu(drinkList);

        List<MenuItem> wineList = new ArrayList<>();
        Wine            montepulciano = new Wine("Rosso di Montepulciano", 30.50, menuForAll, true, "Red wine", 14, false);
        Wine            montefalco    = new Wine("Rosso Montefalco", 22, menuForAll, false, "Red wine", 13.5, false);
        Wine            montalcino    = new Wine("Brunello di Montalcino", 50, menuForAll, true, "Red wine", 14, false);
        Wine            pecorino      = new Wine("Pecorino", 18, menuForAll, false, "White wine", 13, false);
        Wine            cabernetFranc = new Wine("Cabernet Franc", 45.5, menuForAll, true, "White wine", 13.5, false);
        Wine            fume          = new Wine("Bianco Fume", 32.5, menuForAll, false, "White wine", 14, false);
        wineList.add(montepulciano);
        wineList.add(montefalco);
        wineList.add(montalcino);
        wineList.add(pecorino);
        wineList.add(cabernetFranc);
        wineList.add(fume);
        menu.addListToMenu(wineList);

        List<MenuItem> pastasList  = new ArrayList<>();
        Pasta          ragu        = new Pasta("Ragu rigatoni",10,menuForClassic,true,"rigatoni, meat ragu",false);
        Pasta          carbonara   = new Pasta("Carbonara spaghetti",12,menuForClassic,false,"eggs, spaghetti, pecorino, black pepper, guanciale",false);
        Pasta          plin        = new Pasta("Agnolotti al plin",9,menuForVegetarian,false,"agnolotti",false);
        Pasta          tomato      = new Pasta("Tomato spaghetti",8,menuForClassicChild,false,"tomato sauce, spaghetti",true);
        Pasta          matriciana  = new Pasta("Bucatini alla Matriciana",10,menuForClassic,false,"bucatini, guanciale, tomato sauce, chilli pepper",false);
        Pasta          pesto       = new Pasta("Pesto sauce pennette",9,menuForAll,false,"Pesto sauce, penne",false);
        pastasList.add(ragu);
        pastasList.add(carbonara);
        pastasList.add(plin);
        pastasList.add(tomato);
        pastasList.add(matriciana);
        pastasList.add(pesto);
        menu.addListToMenu(pastasList);

        List<MenuItem> mainDish            = new ArrayList<>();
        MainDish       beef                = new MainDish("Cut of beef",19,menuForClassic,false,"beef",false);
        MainDish       tripe               = new MainDish("Roman tripe",15,menuForClassic,true,"guanciale, pecorino, carrot, white wine, garlic, black pepper, onion, celery, tomato, mint, salt",false);
        MainDish       duck                = new MainDish("Duck breast glazed with pears",22,menuForClassic,false,"gorgonzola, duck breast, red wine, butter, flour, sugar, pear, black pepper, salt",false);
        MainDish       tartare             = new MainDish("Angus Tartare",25,menuForClassic,false,"angus",false);
        MainDish       florentine          = new MainDish("Florentine steak",17,menuForClassicChild,false,"steak",false);
        MainDish       cacciatora          = new MainDish("Chicken cacciatora",15,menuForClassic,false,"chicken, onion, celery, red wine, rosemary, salt, tomato, carrot, garlic, black pepper",true);
        mainDish.add(beef);
        mainDish.add(tripe);
        mainDish.add(duck);
        mainDish.add(tartare);
        mainDish.add(florentine);
        mainDish.add(cacciatora);
        menu.addListToMenu(mainDish);

        List<MenuItem> sideDishesList   = new ArrayList<>();
        SideDish       fries            = new SideDish("French fries",3.5,menuForAll,false,"potato",false);
        SideDish       ovenPotatoes     = new SideDish("Oven potatoes",4,menuForAll,false,"potato",false);
        SideDish       salad            = new SideDish("Salad",3,menuForClassicVegetarian,false,"salad, tomato, olive",false);
        SideDish       potatoCroquettes = new SideDish("Potato Croquettes",4.5,menuForClassicChild,false,"potato, batter, cheese",false);
        SideDish       grilledVegetable = new SideDish("Grilled vegetable",4.5,menuForClassicVegetarian,true,"mixed fresh vegetables",true);
        SideDish       olivier          = new SideDish("Olivier salad",5.5,menuForClassicVegetarian,false,"potatos and peas",false);
        sideDishesList.add(fries);
        sideDishesList.add(ovenPotatoes);
        sideDishesList.add(salad);
        sideDishesList.add(potatoCroquettes);
        sideDishesList.add(grilledVegetable);
        sideDishesList.add(olivier);
        menu.addListToMenu(sideDishesList);

        List<MenuItem> dessertList   = new ArrayList<>();
        Dessert        catalan       = new Dessert("Catalan cream", 5, menuForClassicChild, true, "milk, sugar, cinnamon, eggs, lemon", false);
        Dessert        sorbet        = new Dessert("Lemon sorbet", 3.5, menuForClassicChild, false, "lemon juice, sugar, eggs, water, limoncello", false);
        Dessert        fruitSalad    = new Dessert("Fruit salad", 3.5, menuForAll, false, "mixed fresh fruit", true);
        Dessert        sacher        = new Dessert("Sacher cake", 7, menuForClassic, true, "dark chocolate, eggs, flour, sugar, butter, vanilla, Apricot jam", false);
        Dessert        iceCream      = new Dessert("Ice cream drowned in coffee", 5.5, menuForClassicVegetarian, false, "Soymilk chocolate ice cream, coffee", false);
        Dessert        pudding       = new Dessert("Caramel pudding", 4, menuForClassicChild, false, "milk, caramel, sugar", false);
        dessertList.add(catalan);
        dessertList.add(sorbet);
        dessertList.add(fruitSalad);
        dessertList.add(sacher);
        dessertList.add(iceCream);
        dessertList.add(pudding);
        menu.addListToMenu(dessertList);


        //Creation Customers

        Customer customer1 = new Customer("Gianni","Agnelli",MenuTypeEnum.CLASSIC, new CustomerCart(new ArrayList<>(), "1234"));
        Customer customer2 = new Customer("Giulia","Agnelli",MenuTypeEnum.VEGETARIAN,new CustomerCart(new ArrayList<>(),"1235"));
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

        menu.printDishOfTheDayClassic();
        menu.printDishOfTheDayVegetarian();
        menu.printDishOfTheDayChild();

        // book the table

        Table table1 = new Table("Tavolo 1", 4);
        Table table2 = new Table("Tavolo 2", 4);
        Table table3 = new Table("Tavolo 3", 8);

        restaurant.reserveTable(table1, reservation1);

        restaurant.cleanTable(table2, reservation1);

        System.out.println("Situazione attuale dei tavoli occupati e dei clienti che stanno consumando");

        restaurant.printRestaurantInfo();

        //Creating fixed menus

        List<MenuItem> listFixedMenuClassic = new ArrayList<>();
        listFixedMenuClassic.add(matriciana);
        listFixedMenuClassic.add(salad);
        listFixedMenuClassic.add(montepulciano);
        FixedMenu fixedMenuClassic = new FixedMenu(new ArrayList<>());
        fixedMenuClassic.addListToFixedMenu(listFixedMenuClassic);

        List<MenuItem> listFixedMenuVegetarian = new ArrayList<>();
        listFixedMenuVegetarian.add(fume);
        listFixedMenuVegetarian.add(pesto);
        listFixedMenuVegetarian.add(grilledVegetable);
        listFixedMenuVegetarian.add(coffee);
        FixedMenu fixedMenuVegetarian = new FixedMenu(new ArrayList<>());
        fixedMenuVegetarian.addListToFixedMenu(listFixedMenuVegetarian);

        customer2.orderFixedMenu(fixedMenuVegetarian);

        // order item from the menu

        customer1.orderMenuItem(fries);
        customer1.orderMenuItem(salad);
        customer1.orderMenuItem(redWine);
        customer1.getCart().printCartDetails();

        customer1.addFidelityPoints(50);

        customer1.checkout();

    }
}


