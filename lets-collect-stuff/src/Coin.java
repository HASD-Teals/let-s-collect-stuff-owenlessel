public class Coin {
    // Add collectable properties here
    public String color;
    public int size;
    public String condition;
    public double cost;
    public double rarity;
    public double value;

    // Condition can be a variety of strings, rarity 0-5 (Stars can be decimals),
    // value is cost of all.
    // Add collectable constructors here 
    //test commment line
    public Coin() {
    }

    public Coin(String color, int size, String condition, double cost, double rarity, double value) {
        this.color = color;
        this.size = size;
        this.condition = condition;
        this.cost = cost;
        this.rarity = rarity;
        this.value = value;
    }

    // Add collectable accessors
    public String getColor() {
        return this.color;
    }

    public int getSize() {
        return this.size;
    }

    public String getCondition() {
        return this.condition;
    }

    public double getCost() {
        return this.cost;
    }

    public double getRarity() {
        return this.rarity;
    }

    public double getValue() {
        return this.value;
    }

    // Add collectable mutators
    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setRarity(double rarity) {
        this.rarity = rarity;
    }

    public void setValue(double value) {
        this.value = value;
    }

    // Add any methods here
    public String toString() {
        String report = "";
        report = this.color + " " + this.size + " " + this.condition + " " + this.cost + " " + this.rarity + " "
                + this.value + "/n";

        return report;
    }
    public boolean coinEqual(Coin C){
        return this.color==C.color && this.size==C.size && this.condition==C.condition && this.size==C.size && this.cost==C.cost && this.rarity==C.rarity && this.value==C.value;
    }
}