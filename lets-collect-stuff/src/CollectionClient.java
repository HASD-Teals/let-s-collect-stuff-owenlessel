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
        Coins.remove(removeCoins(Coins));
        System.out.println("Coin has been removed");
        System.out.println(Coins);

    }
    public static Coin addCoins(){
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
    public static Coin removeCoins(List<Coin> Coins){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of the Coin you want to remove: ");
        int numberCoin = in.nextInt();
        Coin removeCoin = Coins.get(numberCoin);
        return removeCoin;
    }
}
