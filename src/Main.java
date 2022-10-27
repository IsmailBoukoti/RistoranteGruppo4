import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to our restaurant Antichi sapori");
        List<MenuItem> itemList = new ArrayList<>();
        Menu menu = new Menu (itemList);

        List<MenuItem> drinkList = new ArrayList<>();
        Drink beer = new Drink("Beer", 5, "Drink", false);
        Drink redWhine = new Drink("Red whine ", 8, "Drink", true);
        Drink cocaCola = new Drink("Cocacola", 3, "Drink", false);
        Drink water = new Drink("Water", 2, "Drink", false);
        drinkList.add(beer);
        drinkList.add(redWhine);
        drinkList.add(cocaCola);
        drinkList.add(water);
        menu.addListToMenu(drinkList);

        List<MenuItem> pastasList = new ArrayList<>();
        Pasta ragu = new Pasta("Rigatoni al ragu", 10, "Pasta", true);
        Pasta carbonara = new Pasta("Spaghetti alla Carbonara", 12, "Pasta", false);
        Pasta piemontese = new Pasta("Agnolotti alla Piemontese", 9, "Pasta", false);
        Pasta polpette = new Pasta("Spaghetti alle Polpette", 8, "Pasta", false);
        pastasList.add(ragu);
        pastasList.add(carbonara);
        pastasList.add(piemontese);
        pastasList.add(polpette);
        menu.addListToMenu(pastasList);

        List<MenuItem> secondiPiatti = new ArrayList<>();
        SecondiPiatti tagliataDiManzo = new SecondiPiatti("Tagliata di Manzo", 19, "Secondi piatti", false);
        SecondiPiatti trippaAllaRomana = new SecondiPiatti("Trippa alla Romana", 15, "Secondi piatti ", true);
        SecondiPiatti grigliataMista = new SecondiPiatti("Grigliata Mista", 22, "Secondi piatti", false);
        SecondiPiatti tartareDiAngus = new SecondiPiatti("Tartare di Angus", 25, "Secondi piatti", false);
        secondiPiatti.add(tagliataDiManzo);
        secondiPiatti.add(trippaAllaRomana);
        secondiPiatti.add(grigliataMista);
        secondiPiatti.add(tartareDiAngus);
        menu.addListToMenu(secondiPiatti);

        List<MenuItem> sideDishesList = new ArrayList<>();
        SideDishes chips = new SideDishes("Chips", 3.5, "Side dishes", false);
        SideDishes ovenPotatoes = new SideDishes("Oven potatoes", 4, "Side dishes", false);
        SideDishes salad = new SideDishes("Salad", 3, "Side dishes", false);
        SideDishes potatoCroquettes = new SideDishes("Potato Croquettes", 4.5, "Side dishes", false);
        SideDishes grilledVegetable = new SideDishes("Grilled vegetable", 4.5, "Side dishes", true);
        sideDishesList.add(chips);
        sideDishesList.add(ovenPotatoes);
        sideDishesList.add(salad);
        sideDishesList.add(potatoCroquettes);
        sideDishesList.add(grilledVegetable);
        menu.addListToMenu(sideDishesList);

        System.out.println(menu);

        for (MenuItem item : pastasList) {
            if (item.isRecommended()) {
                System.out.println("Our recommended pasta is " + item.getName() + " " + item.getPrice() + " euros");
            }
        }
        for (MenuItem item : secondiPiatti) {
            if (item.isRecommended()) {
                System.out.println("Our recommended meat is " + item.getName() + " " + item.getPrice() + " euros");
            }
        }
        for (MenuItem sd : sideDishesList) {
            if (sd.isRecommended()) {
                System.out.println("Our recommended side dish is " + sd.getName() + " " + sd.getPrice() + " euros");
            }
        }
        for (MenuItem item : drinkList) {
            if (item.isRecommended()) {
                System.out.println("Our recommended drink is " + item.getName() + item.getPrice() + " euros");
            }
        }
    }
}




