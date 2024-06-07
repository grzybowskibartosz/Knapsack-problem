package Problem;
import java.util.*;

public class Wynik {
    private int itemCount;
    private int totalWeight;
    private int totalValue;
    private List<Integer> wynik;

    public Wynik(List<Integer> selectedItems, int itemCount, int totalValue, int totalWeight) {
        this.wynik = selectedItems;
        this.itemCount = itemCount;
        this.totalValue = totalValue;
        this.totalWeight = totalWeight;
    }

    public List<Integer> getWynikList(){
        return wynik;
    }

    public int getItemCount(){
        return itemCount;
    }

    public int getTotalValue(){
        return totalValue;
    }

    public int getTotalWeight(){
        return totalWeight;
    }


    @Override
    public String toString() {
        return "Selected items: " + wynik +
                "\nTotal number of items: " + itemCount +
                "\nTotal value: " + totalValue +
                "\nTotal weight: " + totalWeight;
    }
}


