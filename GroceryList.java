import static java.lang.System.out;
public class GroceryList {
    public static void main(String[] args){
        out.println("Please list three items on your grocery shopping list:");
        out.println("milk");
        out.println("bread");
        out.println("eggs");
            double milkPrice = 2.59;
            double breadPrice = 1.99;
            double eggPrice = 2.59;
            int milkCount = 1;
            int breadCount = 3;
            int eggCount = 2;
            double milkTotal = milkPrice * milkCount;
            double breadTotal = breadPrice * breadCount;
            double eggTotal = eggPrice * eggCount;

       out.println("Your grocery bill comes out to " + (eggTotal + breadTotal + milkTotal) + ".");
    }
}
