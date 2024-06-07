package Problem;

class Item {
    private int number;
    private int weight;
    private int value;

    public Item(int number, int weight, int value) {
        this.number = number;
        this.weight = weight;
        this.value = value;
    }

    public double getValueToWeightRatio() {
        return (double) value / weight;
    }
    public int getWeight() {
        return weight;
    }
    public int getValue() {
        return value;
    }
    public int getNumber() {
        return number;
    }


    @Override
    public String toString() {
        return number + ": (" + weight + ", " + value + ")";
    }
}
