import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menulist = new Menu();
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in a new meal for menu:");
        String menuItem = reader.nextLine();
        menulist.addMeal(menuItem);
        while(menuItem.length()!=0){
            System.out.print("Type in a new meal for menu:");
            menuItem = reader.nextLine();
            menulist.addMeal(menuItem);
        }
        System.out.println("Here is your menu Sir!");
        menulist.printMeals();

        menulist.clearMenu();

        menulist.printMeals();
    }
}
