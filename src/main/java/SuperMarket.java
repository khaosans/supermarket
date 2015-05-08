import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Souriya Khaosanga on 5/6/2015.
 */
public class SuperMarket {

    private static int priceOfItemA = 20;
    private static int priceOfItemB = 50;
    private static int priceOfItemC = 30;

    public SuperMarket(int a,int b, int c) {
        priceOfItemA = a;
        priceOfItemB = b;
        priceOfItemC = c;
    }

    public static void main(String[] args) {
        System.out.println(checkOut("ABBACBBABasdf"));
    }

    public static int checkOut(String items) {
        validateItems(items);
        int priceB = priceOfB(countLetter(items, "B"));
        int priceAandC = countLetter(items, "A") * priceOfItemA + countLetter(items, "C") * priceOfItemC;
        return priceAandC + priceB;
    }

    public static int countLetter(String items, String letterToCount) {
        String[] array = items.split("");
        return Arrays.stream(array).filter(x -> Objects.equals(x, letterToCount)).toArray().length;
    }

    //Gives the price of B taking into account the deal of 5 for 3 otherwise its priced at normal price
    public static int priceOfB(int numOfB) {
        if (numOfB < 5) {
            return numOfB * priceOfItemB;
        } else {
            int leftOver = numOfB % 5;
            return leftOver * priceOfItemB + (numOfB - leftOver) / 5 * (3 * priceOfItemB);
        }
    }

    //Checks for items that are not A,B,C and displays them
    public static void validateItems(String items) {
        String[] array = items.split("");
        List<String> unknownItems = new LinkedList<>();
        for (String item : array) {
            if (!item.equals("A") && !item.equals("B") && !item.equals("C") && !item.equals("")) {
                unknownItems.add(item);
            }
        }
        if(!unknownItems.isEmpty()) {
            System.out.println("These items are not valid " + unknownItems);
        }
    }

    public static int getPriceOfItemA() {
        return priceOfItemA;
    }

    public static int getPriceOfItemB() {
        return priceOfItemB;
    }

    public static int getPriceOfItemC() {
        return priceOfItemC;
    }

    public static void setPriceOfItemA(int priceOfItemA) {
        SuperMarket.priceOfItemA = priceOfItemA;
    }

    public static void setPriceOfItemB(int priceOfItemB) {
        SuperMarket.priceOfItemB = priceOfItemB;
    }

    public static void setPriceOfItemC(int priceOfItemC) {
        SuperMarket.priceOfItemC = priceOfItemC;
    }
}
