import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CollectionClient {
    public static void main(String[] args) throws Exception {
        // Add your collection ArrayList here..
        // e.g. List<Collectable> collection = new ArrayList<Collectable>();
        List<Coin> Coins = new ArrayList<Coin>();
        // Add collection methods here to manage and manipulate the collection
        Coins.add(addCoins());
        System.out.println(Coins);
        //Coins.remove(removeCoins(Coins));
        //System.out.println("Coin has been removed");
        //System.out.println(Coins);
        searchCoins(Coins);

    }

    public static Coin addCoins() {
        Scanner in = new Scanner(System.in).useDelimiter(System.lineSeparator());
        System.out.println("Enter Your Coin Color: ");
        String color = in.next();
        System.out.println("Enter Your Coin Size: ");
        int size = in.nextInt();
        System.out.println("Enter Your Coin Condition: ");
        String condition = in.next();
        System.out.println("Enter Your Coin Cost: ");
        double cost = in.nextDouble();
        System.out.println("Enter Your Coin Rarity: ");
        double rarity = in.nextDouble();
        System.out.println("Enter Your Coin Value: ");
        double value = in.nextDouble();

        return new Coin(color, size, condition, cost, rarity, value);
    }

    public static Coin removeCoins(List<Coin> Coins) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of the Coin you want to remove: ");
        int numberCoin = in.nextInt();
        Coin removeCoin = Coins.get(numberCoin);
        return removeCoin;
    }

    public static void searchCoins(List<Coin> Coins) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 to search for a property or Enter 2 to search for an item: ");
        int itemProp = in.nextInt();
        if (itemProp == 1) {
            System.out.println("Enter a property to search: ");
            String prop = in.next();
            prop.toLowerCase();
            System.out.println(prop);
            if (prop == "color") {
                System.out.println("What Color Do You Want to Search?: ");
                String propColor = in.nextLine();
                for (int i = 0; i < Coins.size(); i++) {
                    if (Coins.get(i).color == propColor) {
                        System.out.println(Coins.get(i));
                    }
                }
            }
            if (prop == "size") {
                System.out.println("What Size Do You Want to Search?: ");
                int propSize = in.nextInt();
                for (int i = 0; i < Coins.size(); i++) {
                    if (Coins.get(i).size == propSize) {
                        System.out.println(Coins.get(i));
                    }
                }
            }
            if (prop == "condition") {
                System.out.println("What Coin Condition Do You Want to Search?: ");
                String propCondition = in.nextLine();
                for (int i = 0; i < Coins.size(); i++) {
                    if (Coins.get(i).condition == propCondition) {
                        System.out.println(Coins.get(i));
                    }
                }
            }
            if (prop == "cost") {
                System.out.println("What Coin Cost Do You Want to Search?: ");
                Double propCost = in.nextDouble();
                for (int i = 0; i < Coins.size(); i++) {
                    if (Coins.get(i).cost == propCost) {
                        System.out.println(Coins.get(i));
                    }
                }
            }
            if (prop == "rarity") {
                System.out.println("What Coin Rarity Do You Want to Search?: ");
                Double propRarity = in.nextDouble();
                for (int i = 0; i < Coins.size(); i++) {
                    if (Coins.get(i).rarity == propRarity) {
                        System.out.println(Coins.get(i));
                    }
                }
            }
            if (prop == "value") {
                System.out.println("What Coin Value Do You Want to Search?: ");
                Double propValue = in.nextDouble();
                for (int i = 0; i < Coins.size(); i++) {
                    if (Coins.get(i).cost == propValue) {
                        System.out.println(Coins.get(i));
                    }
                }
            }
        } else if (itemProp == 2) {
            System.out.println("What Coin Do You Want to Search For?: ");
            int coinSearchNum = in.nextInt();
            System.out.println(Coins.get(coinSearchNum));
        }
    }
}
