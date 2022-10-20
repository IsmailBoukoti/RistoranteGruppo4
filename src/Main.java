import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to our restaurant Gusti Antichi");

        List<Drink> drinkList = new ArrayList<>();

        Drink beer = new Drink("Beer", 5, "Drink", false);
        Drink redWhine = new Drink("Red whine ", 8, "Drink", true);
        Drink cocaCola = new Drink("Cocacola", 3, "Drink", false);
        Drink water = new Drink("Water", 2, "Drink", false);
        drinkList.add(beer);
        drinkList.add(redWhine);
        drinkList.add(cocaCola);
        drinkList.add(water);

        Menu<Drink> drinksMenu = new Menu<>(drinkList);

        System.out.println(drinksMenu);
        beer.printDetails();

        for (MenuItem item : drinkList) {
            if (item.isRecommended()) {
                System.out.println("Our recommended drink is " + item.getName() + item.getPrice() + " euros");
            }

        }
        List<Pasta> pastasList = new ArrayList<>();
        Pasta ragu = new Pasta("Rigatoni al ragu", 10, "Pasta", true);
        Pasta carbonara = new Pasta("Spaghetti alla Carbonara", 12, "Pasta", false);
        Pasta piemontese = new Pasta("Agnolotti alla Piemontese", 9, "Pasta", false);
        Pasta polpette = new Pasta("Spaghetti alle Polpette", 8, "Pasta", true);
        pastasList.add(ragu);
        pastasList.add(carbonara);
        pastasList.add(piemontese);
        pastasList.add(polpette);
        Menu<Pasta> pastaMenu = new Menu<>(pastasList);
        System.out.println(pastaMenu);



    }
}








