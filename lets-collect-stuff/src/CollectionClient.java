import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CollectionClient {
    public static void main(String[] args) throws Exception {
        // Add your collection ArrayList here..
        // e.g. List<Collectable> collection = new ArrayList<Collectable>();
        List<Coin> Coins = new ArrayList<Coin>();
        // Add collection methods here to manage and manipulate the collection uncomment the methods you want to test
        //Coins.add(addCoins());
        //Coins.add(addCoins());
        //System.out.println(Coins);
        //entireCollection(Coins);
        //Coins.remove(removeCoins(Coins));
        //System.out.println("Coin has been removed");
        //System.out.println(Coins);
        //search_or_sortCoins(Coins);
        //System.out.println(Coins);
        //totalCoins(Coins);
        //totalValue(Coins);
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

    public static void search_or_sortCoins(List<Coin> Coins) {
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Enter 1 to search for a property or Enter 2 to search for an item or Enter 3 to sort by a property: ");
        int itemProp = in.nextInt();
        if (itemProp == 1) {
            System.out.println("Enter a property to search: ");
            String prop = in.next();
            prop.toLowerCase();
            if (prop.equals("color")) {
                System.out.print("What Color Do You Want to Search?: ");
                String propColor = in.next();
                for (int i = 0; i < Coins.size(); i++) {
                    if (Coins.get(i).color.equals(propColor)) {
                        System.out.println(Coins.get(i));
                    }
                }
            }
            if (prop.equals("size")) {
                System.out.print("What Size Do You Want to Search?: ");
                int propSize = in.nextInt();
                for (int i = 0; i < Coins.size(); i++) {
                    if (Coins.get(i).size == propSize) {
                        System.out.println(Coins.get(i));
                    }
                }
            }
            if (prop.equals("condition")) {
                System.out.print("What Coin Condition Do You Want to Search?: ");
                String propCondition = in.next();
                for (int i = 0; i < Coins.size(); i++) {
                    if (Coins.get(i).condition.equals(propCondition)) {
                        System.out.println(Coins.get(i));
                    }
                }
            }
            if (prop.equals("cost")) {
                System.out.print("What Coin Cost Do You Want to Search?: ");
                Double propCost = in.nextDouble();
                for (int i = 0; i < Coins.size(); i++) {
                    if (Coins.get(i).cost == propCost) {
                        System.out.println(Coins.get(i));
                    }
                }
            }
            if (prop.equals("rarity")) {
                System.out.print("What Coin Rarity Do You Want to Search?: ");
                Double propRarity = in.nextDouble();
                for (int i = 0; i < Coins.size(); i++) {
                    if (Coins.get(i).rarity == propRarity) {
                        System.out.println(Coins.get(i));
                    }
                }
            }
            if (prop.equals("value")) {
                System.out.print("What Coin Value Do You Want to Search?: ");
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
        } else if (itemProp == 3) {
            System.out.println("What Property do you want to sort the collection by?: ");
            String sortProp = in.next();
            sortProp.toLowerCase();
            if (sortProp.equals("color")) {
                System.out.print("What Color Do You Want to Sort By?: ");
                String sortColor = in.next();
                for (int i = 0; i < Coins.size(); i++) {
                    if (Coins.get(i).color.equals(sortColor)) {
                        Coin temp = Coins.get(i);
                        Coins.remove(i);
                        Coins.add(0, temp);
                    }
                }
            }
            if (sortProp.equals("size")) {
                System.out.print("What Size Do You Want to Sort By?: ");
                int sortSize = in.nextInt();
                for (int i = 0; i < Coins.size(); i++) {
                    if (Coins.get(i).size == sortSize) {
                        Coin temp = Coins.get(i);
                        Coins.remove(i);
                        Coins.add(0, temp);
                    }
                }
            }
            if (sortProp.equals("condition")) {
                System.out.print("What Coin Condition Do You Want to Search?: ");
                String sortCondition = in.next();
                for (int i = 0; i < Coins.size(); i++) {
                    if (Coins.get(i).condition.equals(sortCondition)) {
                        Coin temp = Coins.get(i);
                        Coins.remove(i);
                        Coins.add(0, temp);
                    }
                }
            }
            if (sortProp.equals("cost")) {
                System.out.print("What Coin Cost Do You Want to Search?: ");
                Double sortCost = in.nextDouble();
                for (int i = 0; i < Coins.size(); i++) {
                    if (Coins.get(i).cost == sortCost) {
                        Coin temp = Coins.get(i);
                        Coins.remove(i);
                        Coins.add(0, temp);
                    }
                }
            }
            if (sortProp.equals("rarity")) {
                System.out.print("What Coin Rarity Do You Want to Search?: ");
                Double sortRarity = in.nextDouble();
                for (int i = 0; i < Coins.size(); i++) {
                    if (Coins.get(i).rarity == sortRarity) {
                        Coin temp = Coins.get(i);
                        Coins.remove(i);
                        Coins.add(0, temp);
                    }
                }
            }
            if (sortProp.equals("value")) {
                System.out.print("What Coin Value Do You Want to Search?: ");
                Double sortValue = in.nextDouble();
                for (int i = 0; i < Coins.size(); i++) {
                    if (Coins.get(i).cost == sortValue) {
                        Coin temp = Coins.get(i);
                        Coins.remove(i);
                        Coins.add(0, temp);
                    }
                }
            }
        }
    }

    

    public static void totalCoins(List<Coin> Coins) {
        System.out.println("There is " + Coins.size() + " coins in the collection.");
    }

    public static void totalValue(List<Coin> Coins) {
        double coinsValue = 0;
        for (int i = 0; i < Coins.size(); i++) {
            coinsValue = coinsValue + Coins.get(i).value;
        }
        System.out.println(
                "The total value of all coins in the collection is " + coinsValue + " USD (United States Dollar)");
    }

    public static void entireCollection(List<Coin> Coins) {
        for (int i = 0; i < Coins.size(); i++) {
            System.out.println(Coins.get(i));
        }
    }
}