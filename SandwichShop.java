import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.println("Checking sales goals");
        out.println("The sales goal for veggie sandwiches is 50");
        out.println("How many veggie sandwhiches were sold today?");
        int veggieCount = keyboard.nextInt();
        int goalForVeggies = 50;

        if (veggieCount >= 50) {
            out.println("made goal for veggies.");
        } else {
            out.println("Fell Short");
        }

        out.println("The sales goal for brugers in 250");
        out.println("How many Burgers were sold today?");
        int burgerCount = keyboard.nextInt();
        int goalForBurgers = 250;

        if (burgerCount >= 250) {
            out.println("made goal for burgers");
        } else {
            out.println("Fell short");
        }

        out.println("The sales goal for subs is 180");
        out.println("How many subs were sold today?");
        int subCount = keyboard.nextInt();
        int goalForSubs = 180;

        if (subCount >= 180) {
            out.print("made goal for subs");
        } else {
            out.println("fell short");
        }

        out.println("The sales goal for soup is 70");
        out.println("How many soups were sold today?");
        int soupCount = keyboard.nextInt();
        int goalForSoup = 70;

        if (soupCount >= 70) {
            out.println("made goal for soup");
        } else {
            out.print("fell short");
        }
        if (veggieCount >= 50 && burgerCount >= 250 && subCount >= 180 && soupCount >= 70) {
            out.println("made goal for everything!");
            {

            }
        }
    }
}